<%-- 
    Document   : mostrarPerros
    Created on : 12/10/2023, 11:26:32 p. m.
    Author     : JORGE
--%>

<%@page import="logica.Perro"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Caninos</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body class="container text-center" style="background: linear-gradient(to left, #5d4157, #a8caba);">
        <h1>Lista de caninos registrados</h1>
        <%
            List<Perro> listaPerro = (List) request.getSession().getAttribute("listaPerro");
            int cont = 0;
            float sum = 0;
                for(Perro per: listaPerro){
                    sum += per.getEdad();
        %>
        
        <p><b>Canino N°<%=cont%></b></p>
        <p>Nombre: <%=per.getNombre()%></p>
        <p>Raza: <%=per.getRaza()%></p>
        <p>Color: <%=per.getColor()%></p>
        <p>Edad: <%=per.getEdad()%></p>
        <p>Nivel de entrenamiento: <%=per.getNivelEntrenamiento()%></p>
        <p>Disponibilidad: <%=per.isDisponible()%></p>
        <p>---------------------------------------</p>
        <% cont = cont +1;%>
        
        
        <%}%>
        <p><b>Cantidad total: <%=cont%></b></p>
        <p><b>Edad promedio: <%=sum/(cont)%></b></p>
        
        <form action="SvMascotaCan" method="GET">
            <label for="posicion">Ingrese la posición de la mascota a retirar</label><br>
            <input type="number" id="posicion" name="posicion" required><br></br>
            <input type="submit" value="Retirar" class="btn btn-warning" onclick="alert('¡Se retiró la mascota correctamente!')">
            <h2></h2>
            <a href="rescate.jsp"><button type="button" class="btn btn-primary"><-- Inicio</button></a>
        </form>
    </body>
</html>
