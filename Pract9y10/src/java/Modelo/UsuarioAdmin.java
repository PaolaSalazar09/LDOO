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
public class UsuarioAdmin extends Usuario {
     private String nume;
    
    public UsuarioAdmin(String usuario, String contra, String nombre, String apellido, String email, String fecha, String nume){
        setUsuario(usuario);
        setContra(contra);
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setFecha(fecha);
        setNume(nume);
        setTipoUsuario();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    
    @Override
    public void setTipoUsuario(){
        this.tipoUsuario = "Administrador";
    }
    
    @Override
    public String mostrarInformación(){
        String str = "Nombre:" + getNombre()+"<br>" ;
        str += "Apellido: " + getApellido() + "<br>";
        str += "Usuario: " + getUsuario() + "<br>";
        str += "Contraseña: " + getContra() + "<br>";
        str += "Email: " + getEmail() + "<br>";
        str += "Fecha de nacimiento: " + getFecha() + "<br>";
        str += "Numero de Empleado: " + getNume() + "<br>";
        str += "Tipo de usuario: " + getTipoUsuario() + "<br>";
        return str;
    }
}

   