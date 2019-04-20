<%-- 
    Document   : index
    Author     : psr_0





NOTA: Tuve muchas fallas y dudas con esta practica, estuve pidiendo ayuda a varios de mis compañeros y me estuvieron ayudando hasta que pude concluir la actividad.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
        <title>Practica 9 y 10</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <LINK rel=StyleSheet href="css_index.css" type="text/css">
        <script src = "logmain.js"></script> 
      </head>
    <body background="imagenes/fondo.jpg">
        <h1>Iniciar Sesión</h1>
        <br>
        
        <form class="login" onsubmit="return error();" action="Check" method="POST">
            <h2>Usuario:</h2>
            <input type="text" name="usuario"> 
            <br>
            <h2>Contraseña:</h2>
            <input type="password" name="contra"><br>
            <br><br>
            <input type="submit" value="Ingresar">
            <br><br>
            <a href="registro.jsp"> Registrarse </a>
            
        </form>
    </body>
</html>
