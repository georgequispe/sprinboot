package com.george.spring.app1.springboot_aplicaciones.controllers;


import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import com.george.spring.app1.springboot_aplicaciones.models.Empleado;

@Controller
public class EjemploController {
    @GetMapping("/detalles_info")
    
    
    public String ejemplo(Model model) {
        Empleado empleado1= new Empleado("George", "Smith", "123 Main St", "george.smith@example.com", 1, 30, 1234567890);
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }
    @ModelAttribute("listaEmpleados")
    public List<Empleado> listaEmpleados() {
        Empleado empleado1= new Empleado("George", "Smith", 
        "123 Main St", "george.smith@example.com", 1, 30, 1234567890);
        Empleado empleado2= new Empleado("Maria", "Garcia", 
        "456 Elm St", "maria.garcia@example.com", 2, 25, 1176543210);
        return Arrays.asList(empleado1, empleado2);
    }
}
