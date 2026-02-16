package com.george.spring.app1.springboot_aplicaciones;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.george.spring.app1.springboot_aplicaciones.controllers.ParametroDTO;
import com.george.spring.app1.springboot_aplicaciones.models.Empleado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/pathvariable")
public class PathVariableController {
    @GetMapping("pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje) {
        ParametroDTO parametro1 = new ParametroDTO(mensaje);
        return parametro1;
    }
    @PostMapping("/solicitud")
    
    public Empleado createEmpleado(@RequestBody Empleado empleado1) {
        // Aquí podrías guardar el empleado en una base de datos o realizar otras operaciones
        return empleado1; // Devuelve el empleado recibido como respuesta
    }
    
    
}
