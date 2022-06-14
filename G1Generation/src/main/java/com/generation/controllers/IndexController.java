package com.generation.controllers;

import com.generation.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Esta instancia hace que entienda que es un controller/ Realiza la importacion
public class IndexController {

    //http://localhost:8080/
    @RequestMapping("/") //Establecemos la ruta la cual respondera
    public String index(Model model){
        model.addAttribute("apellidos", "Utreras Montesinos"); //clave,valor
        model.addAttribute("nombres","Leonardo Javier");
        model.addAttribute("edad",26);



        //instancia de usuario
        Usuario usuario = new Usuario("Donato","Loren",12,"Admin1234");
        //pasando el objeto a la vista (JSP)
        model.addAttribute("usuario",usuario);




        return "index.jsp";
    }

}
