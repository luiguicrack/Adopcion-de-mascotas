package com.mycompany.proyecto.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Perro;

@WebServlet(name = "SvMascotaCan", urlPatterns = {"/SvMascotaCan"})
public class SvMascotaCan extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession misesion = request.getSession();
        List<Perro> listaPerro = (List<Perro>) misesion.getAttribute("listaPerro");
        if (listaPerro == null) {
            listaPerro = new ArrayList<>();
            misesion.setAttribute("listaPerro", listaPerro);
        }
        String posicionStr = request.getParameter("posicion");

        if (posicionStr != null && !posicionStr.isEmpty()) {
            int posicion = Integer.parseInt(posicionStr);
            if (posicion >= 0 && posicion < listaPerro.size()) {
                listaPerro.remove(posicion);
            }
        }

        response.sendRedirect("mostrarPerros.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String raza = request.getParameter("raza");
        String color = request.getParameter("color");

        String edadStr = request.getParameter("edad");
        int edad = edadStr != null ? Integer.parseInt(edadStr) : 0;

        String nivelEntrenamientoStr = request.getParameter("nivelEntrenamiento");
        int nivelEntrenamiento = nivelEntrenamientoStr != null ? Integer.parseInt(nivelEntrenamientoStr) : 0;

        String disponibilidadStr = request.getParameter("disponibilidad");
        boolean disponibilidad = disponibilidadStr != null ? Boolean.parseBoolean(disponibilidadStr) : false;

            if (nombre != null && raza != null && color != null) {
            Perro nuevoPerro = new Perro(nombre, raza, color, edad, nivelEntrenamiento, disponibilidad);

            HttpSession misesion = request.getSession();
            List<Perro> listaPerro = (List<Perro>) misesion.getAttribute("listaPerro");
            if (listaPerro == null) {
                listaPerro = new ArrayList<>();
                misesion.setAttribute("listaPerro", listaPerro);
            }

            listaPerro.add(nuevoPerro);
        }

        response.sendRedirect("rescate.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
