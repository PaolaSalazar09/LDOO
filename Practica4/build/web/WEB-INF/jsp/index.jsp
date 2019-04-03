<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>
              
        <form>

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
    </form>
    </body>
</html>
