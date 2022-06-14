package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroController {
    //ruta para desplegar el JSP

    @RequestMapping("/registro")
    public String registro(){
        return"registro.jsp"; //Pagina a desplegar
    }
}
