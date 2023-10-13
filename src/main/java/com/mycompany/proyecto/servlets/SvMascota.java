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
import logica.Gato;

@WebServlet(name = "SvMascota", urlPatterns = {"/SvMascota"})
public class SvMascota extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession misesion = request.getSession();
        List<Gato> listaGato = (List<Gato>) misesion.getAttribute("listaGato");
        if (listaGato == null) {
            listaGato = new ArrayList<>();
            misesion.setAttribute("listaGato", listaGato);
        }
        String posicionStr = request.getParameter("posicion");

        if (posicionStr != null && !posicionStr.isEmpty()) {
            int posicion = Integer.parseInt(posicionStr);
            if (posicion >= 0 && posicion < listaGato.size()) {
                listaGato.remove(posicion);
            }
        }

        response.sendRedirect("mostrarGatos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String raza = request.getParameter("raza");
        String color = request.getParameter("color");
        int edad = Integer.parseInt(request.getParameter("edad"));
        boolean toxoplasmosis = Boolean.parseBoolean(request.getParameter("toxoplasmosis"));
        boolean disponibilidad = Boolean.parseBoolean(request.getParameter("disponibilidad"));

        Gato nuevoGato = new Gato(nombre, raza, color, edad, toxoplasmosis, disponibilidad);

        HttpSession misesion = request.getSession();
        List<Gato> listaGato = (List<Gato>) misesion.getAttribute("listaGato");
        if (listaGato == null) {
            listaGato = new ArrayList<>();
            misesion.setAttribute("listaGato", listaGato);
        }

        listaGato.add(nuevoGato);

        response.sendRedirect("rescate.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
