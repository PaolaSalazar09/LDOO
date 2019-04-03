<%// @autor: Paola Salazar Rodríguez//*%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8">
      <LINK rel=StyleSheet href="css_index.css" type="text/css"> 
      <title>Registrarse</title>
      <script type="text/javascript">
          function validar(){
              var caracter_invalido = " ";
              var contra1 = document.login.contra1.value;
              var contra2 = document.login.contra2.value;
              
              if(contra1 != contra2){
                  alert("Las contraseñas introducidas no son iguales");
                  return false;
              }
              else if(contra1 == '' || contra2 == ''){
                  alert("Debes introducir tu contraseña en los dos campos")
                  return false;
              }
              else{
                  return true;
              }
          }
      </script>
   </head>
   <body background="imagenes/reg.png">
   <center>
       <h1>Registrarse</h1>
       <form action="REGISTRARSE" method="POST" name="login" onSubmit="return validar()"
            <table>
                <tr>
                    <td>
                        <p>Usuario</p>
                    </td>
                    <td>
                        <input type="text" name="usuario"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Contraseña</p>
                    </td>
                    <td>
                        <input type="password" name="contra1"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Vuelve a introducir tu contraseña</p>
                    </td>
                    <td>
                        <input type="password" name="contra2"/>
                    </td>
                </tr>
            </table>
           <table>
               <tr>
                   <td>
                       <input type="submit" name="ENTRAR" value="Enviar"/>
                   </td>
               </tr>
           </table>
       </form>
   </center>
   </body>
</html>