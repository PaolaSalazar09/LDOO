/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;



@Controller
public class ControlUsuario {

   @RequestMapping(value = "/usuario", method = RequestMethod.GET)
   public ModelAndView usuario() {
      return new ModelAndView("usuario", "command", new Usuario());
   }
   
   @RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
   public String addUsuario(@ModelAttribute("SpringWeb")Usuario usuario, 
   ModelMap model) {
      model.addAttribute("nomb", usuario.getNomb());
      model.addAttribute("ap", usuario.getAp());
      model.addAttribute("naci", usuario.getNaci());
      model.addAttribute("correo", usuario.getCorreo());
      
      return "result";
   } 
}
