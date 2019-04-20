<%-- 
    Document   : registro
    Author     : psr_0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <LINK rel=StyleSheet href="css_index.css" type="text/css">
        <script src = "logmain.js"></script> 
        <title>Registro</title>
    </head>
    <body bgcolor="gray">

        <h1>Registro </h1>

        
        <form class="login" action="Registrar" method="POST" onsubmit="return validar();"> 
            <div align="center">
            <h2>Nombre: </h2>
            <input  type="text" name="nombre">

            <h2>Apellido: </h2>
            <input  type="text" name="ap"><br>
            
            <h2>Usuario:</h2>
            <input type="text" name="usuario"><br>
            		
            <h2> E-mail:</h2>
            <input type="email" name="email"><br>

            <h2>Contraseña:</h2>
            <input type="password" name="contra"><br>
			
            <h2>Fecha De Nacimiento: </h2>
            <input type="date" name="fecha"><br>
          
            
            <h2>Tipo De Usuario:</h2>
            <select  name="tipousuario" >   
                <option value="Administrador">Administrador</option>
                <option value="Normal">Normal</option>
                <option value="Invitado">Invitado</option>
            </select><br>
            
            <h2>Número De Empleado: </h2> *solo en caso de ser administrador
            <input type="text" name="nume" ><br>
              
             <h2>Dirección: </h2>  *solo en caso de ser usuario normal
            <input  type="text" name="direccion"><br>
            
            <h2>Fecha De Registro:</h2> *solo en caso de ser invitado
            <input  type="date" name="fechaReg"><br> <br>
            
             <input type="submit" value="Registrarme">
            </div>
	</form>
        
    </body>
</html>
