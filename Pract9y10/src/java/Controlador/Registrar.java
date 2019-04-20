/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Factory.Singleton;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author psr_0
 */
@WebServlet(name = "Registrar", urlPatterns = {"/Registrar"})

public class Registrar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
            Singleton factory = Singleton.getSingleton();
            String tipo = request.getParameter("tipousuario");
            String nom = request.getParameter("nombre");
            String ape = request.getParameter("apellido");
            String us = request.getParameter("usuario");
            String nume = request.getParameter("nume");
            String email = request.getParameter("email");
            String contra = request.getParameter("contrasena");
            String fech = request.getParameter("fecha");
            String dir = request.getParameter("direccion");
            String fechareg = request.getParameter("fechaReg");
            
            switch (tipo) {
            case "Administrador":
                factory.agregarUsuario(tipo, us, contra, nom, ape, email, fech, nume, null, null);
                break;
            case "Normal":
                factory.agregarUsuario(tipo, us, contra, nom, ape, email, fech, null, null, dir);
                break;
            default:
                factory.agregarUsuario(tipo, us, contra, nom, ape, email, fech, null, fechareg, null);
                break;
            }
            response.sendRedirect("index.jsp");
    }

    

}
