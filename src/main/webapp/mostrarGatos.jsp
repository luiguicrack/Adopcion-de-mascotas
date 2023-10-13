<%-- 
    Document   : mostrarGatos
    Created on : 12/10/2023, 9:54:40 p. m.
    Author     : JORGE
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Gato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Felinos</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body class="container text-center" style="background: linear-gradient(to left, #649173, #dbd5a4);">
        <h1>Lista de felinos registrados</h1>
        <%
            List<Gato> listaGato = (List) request.getSession().getAttribute("listaGato");
            int cont = 0;
            float sum = 0;
            for (Gato gat : listaGato) {
                sum += gat.getEdad();
        %>

        <p><b>Felino N°<%=cont%></b></p>
        <p>Nombre: <%=gat.getNombre()%></p>
        <p>Raza: <%=gat.getRaza()%></p>
        <p>Color: <%=gat.getColor()%></p>
        <p>Edad: <%=gat.getEdad()%></p>
        <p>Toxoplasmosis: <%=gat.isToxoplasmosis()%></p>
        <p>Disponibilidad: <%=gat.isDisponible()%></p>
        <p>---------------------------------------</p>

        <% cont = cont + 1;%>


        <%}%>
        <p><b>Cantidad total: <%=cont%></b></p>
        <p><b>Edad promedio: <%=sum / (cont)%></b></p>

        <form action="SvMascota" method="GET">
            <label for="posicion">Ingrese la posición de la mascota a retirar</label><br>
            <input type="number" id="posicion" name="posicion" required><br></br>
            <input type="submit" value="Retirar" class="btn btn-warning" onclick="alert('¡Se retiró la mascota correctamente!')">
            <h2></h2>
            <a href="rescate.jsp"><button type="button" class="btn btn-primary"><-- Inicio</button></a>
        </form>
    </body>
</html>
