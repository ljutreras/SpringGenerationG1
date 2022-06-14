package com.generation.controllers;

import com.generation.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
@RequestMapping("/registro")
public class RegistroController {
    //ruta para desplegar el JSP

    @RequestMapping("")
    public String registro(@ModelAttribute("usuario")Usuario usuario)//estamos pasando un objeto vacio
    {
        return"registro.jsp"; //Pagina a desplegar
    }

    //ruta para capturar los datos del formulario
    /*@RequestMapping("/usuario")
    public String registroUsuario(@RequestParam (value="nombre") String nombre,
                                  @RequestParam (value="apellido") String apellido,
                                  @RequestParam (value="edad") String edad){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        return "registro.jsp"; //La pagina a desplegar
    }*/

    //Solo para recibir datos de method="post"
    @PostMapping("/usuario/respaldo")
    public String registroUsuario(@RequestParam (value="nombre") String nombre,
                                  @RequestParam (value="apellido") String apellido,
                                  @RequestParam (value="edad") String edad){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        return "registro.jsp"; //La pagina a desplegar
    }

    @PostMapping("/usuario")
    public String guardarUsuario(@Valid @ModelAttribute("usuario")Usuario usuario,//traemos el objeto lleno de informacion
                                 BindingResult resultado,
                                 Model model){ //Enviamos resultados al JSP

        if (resultado.hasErrors()){ //Capturando si existe algun error en el ingreso de datos
            model.addAttribute("msgError","Debe ingresar correctamente los datos");

            return "registro.jsp";

        }

        System.out.println(usuario.getNombre()+" "+ usuario.getApellido()+" "+usuario.getEdad());
        return "index.jsp";
    }
}
