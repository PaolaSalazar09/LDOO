/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Factory.Singleton;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author psr_0
 */
public class Check extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        
        Singleton factory = Singleton.getSingleton();
        
        String us = request.getParameter("usuario");
        String contra = request.getParameter("contra");

            if (factory.getUsuario(us)!=null){
                if (factory.getUsuario(us).getUsuario().equals(us) && factory.getUsuario(us).getContra().equals(contra)){
                    request.getSession().setAttribute("Usuario", us);
                    response.sendRedirect("Bienvenido.jsp");
                }else {
                    response.sendRedirect("Errores.jsp");
                }
            }else 
                response.sendRedirect("regitro.jsp");
    }



}
