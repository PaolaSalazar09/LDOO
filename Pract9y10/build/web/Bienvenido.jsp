<%-- 
    Document   : Bienvenido
    Author     : psr_0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Factory.Singleton"%>
<!DOCTYPE html>
<html>
    <%
        Singleton factory = Singleton.getSingleton();
        String us = (String)session.getAttribute("Usuario");
        %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <br>
        <%=factory.getUsuario(us).mostrarInformación()%> <br>
        <a href="index.jsp"> Salir </a>
    </body>
</html>
