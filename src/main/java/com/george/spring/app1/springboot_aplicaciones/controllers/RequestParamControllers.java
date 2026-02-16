package com.george.spring.app1.springboot_aplicaciones.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/parametros")
public class RequestParamControllers {
    @GetMapping("/detalle")
    //http://localhost:8080/api/parametros/detalle?informacion=Hola a Todos
    //tambien se puede declarar adentro del metodo el parametro con @RequestParam
    //  y no en la firma del metodo, con requiered = false, para que no sea obligatorio
    // y tambien asignar un valor por defecto con defaultValue = "Valor el que yo quiera"    
    public ParametroDTO detalle(@RequestParam String informacion) {
       ParametroDTO parametro1 = new ParametroDTO(informacion);
       return parametro1;
    
    
    
    }
    
}
