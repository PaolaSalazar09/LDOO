/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Modelo.Usuario;
import Modelo.UsuarioAdmin;
import Modelo.Normal;
import Modelo.Invitado;
import java.util.HashMap;

/**
 *
 * @author psr_0
 */
public class Singleton {
    private static Singleton sing;
    
    private HashMap<String, Usuario> hashmap = new HashMap();;
    private Singleton(){
        
    }
    
    public static Singleton getSingleton(){
        if (sing==null){
            sing = new Singleton();
        }
        return sing;
    }
    
    public Usuario getUsuario(String usuario){
        return hashmap.get(usuario);
    }
    
    
    public static Usuario elegirUsuario(String tipoUsuario, String usuario, String contra, String nombre, String apellido, String email, String fecha, String nume, String fechaReg, String direccion){
        switch (tipoUsuario) {
            case "Administrador":
                return new UsuarioAdmin(usuario, contra, nombre, apellido, email, fecha, nume);
            case "Normal":
                return new Normal(usuario, contra, nombre, apellido, email, fecha, direccion);
            case "Invitado":
                return new Invitado(usuario, nombre, apellido, email, fecha, fechaReg);
            default:
                break;
        }
        return null;
    }
    
    public void agregarUsuario(String tipoUsuario, String usuario, String contra, String nombre, String apellido, String email, String fecha, String nume, String fechaReg, String direccion){
        if (hashmap.get(usuario) == null){
            hashmap.put(usuario, elegirUsuario(tipoUsuario,usuario, contra, nombre, apellido, email, fecha, nume, fechaReg, direccion));
        }
    }

    public void agregarUsuario(String tipo, String us, String contra, String nom, String ape, String email, String fech, Object object, Object object0, String dir) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


}
