package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrutamientoRestController {

    /**Enrutamiento **/
    //http://localhost:8080/usuario
    @RequestMapping("/usuario")
    public String usuario() {
        return "estamos en la url usuario";
    }

    //http://localhost:8080/usuario/inscrito
    @RequestMapping("/usuario/inscrito")
    public String inscrito() {
        return "estamos en la url inscrito";
    }

    //http://localhost:8080/cliente/registrado
    @RequestMapping("/cliente/registrado")
    public String cliente() {
        return "Ruta cliente";
    }

    //http://localhost:8080/proveedor/registrado
    @RequestMapping(value = "/proveedor/registrado", method = RequestMethod.GET) //Es otra forma de agregar una ruta
    public String proveedor() {
        return "Ruta /proveedor/registrado";
    }

}
