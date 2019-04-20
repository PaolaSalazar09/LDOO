/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author psr_0
 */
public class Normal extends Usuario {
private String direccion;
    
    public Normal(String usuario, String contra, String nombre, String apellido, String email, String fecha, String direccion){
        setUsuario(usuario);
        setContra(contra);
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setFecha(fecha);
        setDireccion(direccion);
        setTipoUsuario();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public void setTipoUsuario(){
        this.tipoUsuario = "Normal";
    }
    
    @Override
    public String mostrarInformación(){
        String str = "Nombre Completo: " + getNombre() + "<br>";
        str += "Apellido: " + getApellido() + "<br>";
        str += "Usuario: " + getUsuario() + "<br>";
        str += "Contraseña: " + getContra() + "<br>";
        str += "Email: " + getEmail() + "<br>";
        str += "Fecha de nacimiento: " + getFecha() + "<br>";
        str += "Dirección: " + getDireccion() + "<br>";
        str += "Tipo de usuario: " + getTipoUsuario() + "<br>";
        return str;
    }
}
