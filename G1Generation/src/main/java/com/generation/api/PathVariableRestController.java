package com.generation.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var") // ruta/path por default
public class PathVariableRestController {
    /** capturar variables desde la ruta/path*/

    //localhost:8080/var/anio/2022/mes/06/dia/13
    @RequestMapping("/anio/{a}/mes/{m}/dia/{d}")  //Generamos variables en la ruta
                                                    //Las {} representa una variable dinamicas, no es fija
    public String capturarVariablesPath(@PathVariable("a") String anio,
                                        @PathVariable("m") String mes,
                                        @PathVariable("d") String dia){ //@PathVariable captura la variable dinamica impuesta en las {} luego en String capturamos la variable anio

        return "la fecha es: " +anio + "/" + mes + "/" + dia;
    }

    //localhost:8080/var/fecha/{anio}/{mes}/{dia}
    @RequestMapping("/fecha/{anio}/{mes}/{dia}")
    public String capturandoPath(@PathVariable("anio") String anio,
                                 @PathVariable("mes") String mes,
                                 @PathVariable("dia") String dia){
        return"la fecha es "+anio + mes+ dia;
    }

}
