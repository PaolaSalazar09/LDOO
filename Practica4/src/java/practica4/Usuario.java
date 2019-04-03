/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

public class Usuario {
   private String nomb;
   private String ap;
   private Integer naci;
   private String correo;
   

   public void setNomb(String nomb) {
      this.nomb = nomb;
   }
   public String getNomb() {
      return nomb;
   }

   public void setAp(String ap) {
      this.ap = ap;
   }
   public String getAp() {
      return ap;
   }
      public void setNaci(Integer naci) {
      this.naci = naci;
   }
   public Integer getNaci() {
      return naci;
   }
   public void setCorreo(String correo) {
      this.correo = correo;
   }
   public String getCorreo() {
      return correo;
   }
   
}
