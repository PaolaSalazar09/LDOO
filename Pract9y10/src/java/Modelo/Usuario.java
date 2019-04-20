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
public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String usuario;
    protected String email;
    protected String contra;
    protected String fecha;
    protected String tipoUsuario;
    
    public Usuario(){
    }
    
    public Usuario(String usuario, String contra, String nombre, String apellido, String email, String fecha){
        setUsuario(usuario);
        setContra(contra);
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setFecha(fecha);
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public abstract void setTipoUsuario();  
    public abstract String mostrarInformación();
}

   