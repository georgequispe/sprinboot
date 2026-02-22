package com.george.spring.app1.springboot_aplicaciones.Util;

import org.springframework.stereotype.Component;

import com.george.spring.app1.springboot_aplicaciones.models.Libros;

@Component
public class ValidarLibro {

    public Libros libro;
    public boolean validarTitulo() {
        return libro.getTitulo() != null && !libro.getTitulo().trim().isEmpty();
    }
}
