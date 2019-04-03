<%-- 
    Document   : practica3
    Author     : paola salazar rodríguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <h1> Los datos que a ingresado son: </h1>
        <h2> Nombre: <%= request.getParameter("nomb")%></h2>
        <h2> Apellido: <%= request.getParameter("ap")%></h2>
        <h2> Fecha de nacimiento: <%= request.getParameter("dt")%></h2>
        <h2> Correo electrónico: <%= request.getParameter("mail")%></h2>
        <h2> Contraseña: <%= request.getParameter("pass")%></h2>
        
        
    </body>
</html>
