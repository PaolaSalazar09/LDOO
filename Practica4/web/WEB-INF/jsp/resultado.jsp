<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <h2>Información enviada del usuario</h2>
      <table>
         <tr>
            <td>Nombre</td>
            <td>${nomb}</td>
         </tr>
         <tr>
            <td>Apellidos</td>
            <td>${ap}</td>
         </tr>
         <tr>
            <td>Fecha de nacimiento</td>
            <td>${naci}</td>
         </tr>
         <tr>
            <td>Correo</td>
            <td>${correo}</td>
         </tr>
      </table>  
    </body>
</html>
