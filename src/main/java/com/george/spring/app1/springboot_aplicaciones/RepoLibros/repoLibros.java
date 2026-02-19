package com.george.spring.app1.springboot_aplicaciones.RepoLibros;

import org.springframework.stereotype.Repository;
import com.george.spring.app1.springboot_aplicaciones.models.Libros;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Optional;

@Repository
public class repoLibros {
    private final List<Libros> libros = new ArrayList<>();
    public repoLibros() {
        libros.add(new Libros(1, "El Gran Gatsby", "F. Scott Fitzgerald", LocalDate.of(1925, 4, 10)));
        libros.add(new Libros(2, "Cien Años de Soledad", "Gabriel García Márquez", LocalDate.of(1967, 5, 30)));
        libros.add(new Libros(3, "Don Quijote de la Mancha", "Miguel de Cervantes", LocalDate.of(1605, 1, 16)));
        libros.add(new Libros(4, "Matar a un Ruiseñor", "Harper Lee", LocalDate.of(1960, 7, 11)));
        libros.add(new Libros(5, "1984", "George Orwell", LocalDate.of(1949, 6, 8)));   
    }
    public List<Libros> findAll() {
        return libros;
    }
    public Libros findByTitulo(String titulo) {
        return libros.stream()
                .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }
    public Optional<Libros> findById(long id) {
        return libros.stream()
                .filter(libro -> libro.getIdLibro() == id)
                .findFirst();
    }

}
