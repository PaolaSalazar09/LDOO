<%-- 
    Document   : registro
    Author     : psr_0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body background="imagenes/reg.png">
        <h1>Formulario de registro</h1>
        <form action="registrar" method="post">
            <label>Usuario:</label>
            <input type="text" name="usuario"/> <br>
            <label>Nombre:</label>
            <input type="text" name="nombre"/> <br>
            <label>Apellido</label>
            <input type="text" name="apellido"/> <br>
            <label>Contraseña</label>
            <input type="password" name="contraseña"/> <br>
            <input type="submit" value="Registrar"/> <br>
        </form>
    </body>
</html>
