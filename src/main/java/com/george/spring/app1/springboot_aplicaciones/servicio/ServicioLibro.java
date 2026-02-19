package com.george.spring.app1.springboot_aplicaciones.servicio;

import com.george.spring.app1.springboot_aplicaciones.RepoLibros.repoLibros;
import com.george.spring.app1.springboot_aplicaciones.models.Libros;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ServicioLibro {
    private final repoLibros libroRepositorio;

    public ServicioLibro(repoLibros libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    public Optional<Libros> obtenerTitulo(String titulo) {
        return Optional.ofNullable(libroRepositorio.findByTitulo(titulo));
    }
}
