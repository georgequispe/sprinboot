package com.george.spring.app1.springboot_aplicaciones.controllers;
import com.george.spring.app1.springboot_aplicaciones.servicio.ServicioLibro;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/libros")
public class ControlaorLibreria {
    private final ServicioLibro servicioLibro;
    public ControlaorLibreria(ServicioLibro servicioLibro) {
        this.servicioLibro = servicioLibro;
    }
    @GetMapping("/{titulo}")
    public String obtenerLibroPorTitulo(@PathVariable String titulo) {
        return servicioLibro.obtenerTitulo(titulo);
    }
    
    
}
