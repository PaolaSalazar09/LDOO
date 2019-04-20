
package Modelo;


/**
 *
 * @author psr_0
 */
public class Invitado extends Usuario {
    
 private String fechaReg;
    
    public Invitado(String usuario, String contra, String nombre, String apellido, String email, String fecha, String fechaReg){
        setUsuario(usuario);
        setContra(contra);
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setFecha(fecha);
        setFechaReg(fechaReg);
        setTipoUsuario();
    }

    public Invitado(String usuario, String nombre, String apellido, String email, String fecha, String fechaReg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(String fechaReg) {
        this.fechaReg = fechaReg;
    }
    
    @Override
    public void setTipoUsuario(){
        this.tipoUsuario = "Invitado";
    }
    
    @Override
    public String mostrarInformación(){
        String str = "Nombre: " + getNombre() + "<br>";
        str += "Apellido: " + getApellido() + "<br>";
        str += "Usuario: " + getUsuario() + "<br>";
        str += "Contraseña: " + getContra() + "<br>";
        str += "Email: " + getEmail() + "<br>";
        str += "Fecha de nacimiento: " + getFecha() + "<br>";
        str += "Fecha De Registro: " + getFechaReg() + "<br>";
        str += "Tipo de usuario: " + getTipoUsuario() + "<br>";
        return str;
    }
   
}
