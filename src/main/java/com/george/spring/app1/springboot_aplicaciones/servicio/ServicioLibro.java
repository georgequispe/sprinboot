package com.george.spring.app1.springboot_aplicaciones.servicio;

import org.springframework.stereotype.Service;

@Service
public class ServicioLibro {
    public String obtenerTitulo(String titulo) {
        if (titulo.equalsIgnoreCase("El Gran Gatsby")) {
            return "El Gran Gatsby";
        } else if (titulo.equalsIgnoreCase("Cien Años de Soledad")) {
            return "Cien Años de Soledad";
        } else {
            return "Libro no encontrado";
            
        }
        
    }
}
