<%-- 
    Document   : index
    Author     : psr_0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <LINK rel=StyleSheet href="css_index.css" type="text/css"> 
        <title>Iniciar Sesion</title>
    </head>
    <body background="imagenes/fondo.jpg">
        <h1>Iniciar Sesion</h1>
        <form action="iniciar" method="POST">
            <label>Nombre:</label>
            <input type="text" name="usuario"/> <br>
            <label>Contraseña:</label>
            <input type="password" name="contraseña" /> <br>
            <input type="submit" value="Iniciar Sesion" />
        </form>
        <br>
        No tengo cuenta...<a href="registro.jsp">Registrarme</a>
    </body>
</html>
