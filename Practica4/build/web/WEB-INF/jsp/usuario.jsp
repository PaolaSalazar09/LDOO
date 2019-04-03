<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de usuario</title>
    </head>
    <body>
        <h1>Información del usuario</h1>
      <form:form method = "POST" action = "/Practica4/addUsuario">

          <div>
            <br>
            Nombre: <input type="text" name="nomb"> 
            Apellido: <input type="text" name="ap"> 
            <br>
            <br>
           
            Fecha de nacimiento: 
                <input type="date" name="dt">
                <br><br>
            Correo electrónico: <input type="email" name="mail">
            <br><br>
            Contraseña: <input type="password" name="pass">
            <br><br>
            <br>
           
            <input type="reset" value="Borrar">   
            <input type="submit" value="Enviar">
          </div>
      </form:form>
    </body>
</html>
