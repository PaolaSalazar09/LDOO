<%// @autor: Paola Salazar Rodríguez//%>
<%@page import="MODELO.USUARIO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        HttpSession sesion = request.getSession();
        String usuario,contrasena;
        usuario = sesion.getAttribute("username").toString();
        contrasena = sesion.getAttribute("password").toString();
        USUARIO U = new USUARIO(usuario,contrasena);
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <LINK rel=StyleSheet href="css_BIENVENIDO.css" type="text/css">
        <title>BIENVENIDO</title>
        <script>
            
        </script>
    </head>
    <body background="imagenes/b.jpg">
    <center>
        <h1>Bienvenido, <%=U.getUsuario()%>!</h1>
        <p> TU CONTRASEÑA ES: <%= U.getContrasena()%> </p>
        <form action="cerrarSesion.jsp">
            <input type="submit" name="CERRAR SESIÓN" value="CERRAR SESIÓN"/>
        </form>
        <br>
        <a href="COOKIE">
            <input type="submit" value="Cookies" name="Cookies"/>
        </a>
    </center>
    </body>
</html>