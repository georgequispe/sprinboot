package com.george.spring.app1.springboot_aplicaciones.RepoLibros;

import java.util.List;
import com.george.spring.app1.springboot_aplicaciones.models.Libros;
import java.util.Optional;

public interface I_RepoLibros {
    List<Libros> findAll();
    Optional<Libros> findById(long id);
    Optional<Libros> findByTitulo(String titulo);
    void save(Libros libro);
    void deleteById(long id);
}
