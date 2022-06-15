package com.generation.controllers;

import com.generation.models.Usuario;
import com.generation.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
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

    //Inyeccion de depencias
    @Autowired
    UsuarioService usuarioService; //Queremos acceder a los metodos

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

        //Capturamos el objeto con los atributos llenos
        System.out.println(usuario.getNombre()+" "+ usuario.getApellido()+" "+usuario.getEdad());

        //Enviar el objeto al servicio
        usuarioService.saveUsuario(usuario); //La variable esta cargada con data, en este caso, hicimos el llamado en la linea 56


        return "index.jsp";
    }
}
