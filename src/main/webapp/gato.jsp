<%-- 
    Document   : gato
    Created on : 12/10/2023, 9:46:47 p. m.
    Author     : JORGE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Felino</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body style="background: linear-gradient(to right, #DECBA4, #3E5151)">
        <div class="container text-center">
            <form action="SvMascota" method="POST">
                <h1>Felino</h1>
                <img src="https://hospitalveterinariodonostia.com/wp-content/uploads/2022/02/Personalidad-gatos.png"
                     width="250"
                     height="250"
                     title="Felino"/>
                <div class="form-group">
                    <label>Nombre:</label><br>
                    <input type="text" name="nombre" placeholder="    Nombre de mascota" required>
                </div>
                <div class="form-group">
                    <label>Raza:</label><br>
                    <input type="text" name="raza" placeholder="       Raza de mascota" required>
                </div>
                <div class="form-group">
                    <label>Color:</label><br>
                    <input type="text" name="color" placeholder="      Color de mascota" required>
                </div>
                <div class="form-group">
                    <label>Edad:</label><br>
                    <input type="number" name="edad" placeholder="      Edad de mascota" required>
                </div>
                <div class="form-group">
                    <label>Libre de toxoplasmosis:</label><br>
                    <select name="toxoplasmosis" required>
                        <option value="">Seleccionar</option>
                        <option value="si">Sí</option>
                        <option value="no">No</option>
                    </select>
                </div>
                <div class="form-group">
                    <label>La mascota se encuentra disponible:</label><br>
                    <select name="disponibilidad" required>
                        <option value="">Seleccionar</option>
                        <option value="si">Sí</option>
                        <option value="no">No</option>
                    </select>
                </div>
                <button class="btn btn-success" onclick="alert('¡Se agrego el felino correctamente!')">Agregar</button>
                <h5></h5></br>
            </form>
        </div>
    </body>
</html>
