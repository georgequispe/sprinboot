package com.george.spring.app1.springboot_aplicaciones.servicio;

import com.george.spring.app1.springboot_aplicaciones.RepoLibros.I_RepoLibros;
import com.george.spring.app1.springboot_aplicaciones.RepoLibros.repoLibros;
import com.george.spring.app1.springboot_aplicaciones.models.Libros;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
// La anotación @Service indica que esta clase es un servicio de negocio en la aplicación,
//  lo que permite a Spring gestionarla como un componente y facilitar la inyección de dependencias.
public class ServicioLibro implements I_ServicioLibro {
    private final I_RepoLibros libroRepositorio;

    // Inyección de dependencia del repositorio
    public ServicioLibro(I_RepoLibros libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }
    // Implementación de los métodos definidos en la interfaz I_ServicioLibro,
    //  que delegan las operaciones al repositorio para acceder a los datos de los libros
    @Override
    public List<Libros> obtenerTodosLosLibros() {
        return libroRepositorio.findAll();
    }

    // Método para obtener un libro por su título, utilizando el repositorio para buscarlo
    @Override
    public Optional<Libros> obtenerPorTitulo(String titulo) {
        return libroRepositorio.findByTitulo(titulo);
    }
    // Método para obtener un libro por su ID, utilizando el repositorio para buscarlo
    @Override
    public Optional<Libros> obtenerPorId(long id) {
        return libroRepositorio.findById(id);
    }
    // Método para guardar un libro, delegando la operación al repositorio
    @Override
    public Libros guardar(Libros libro) {
        libroRepositorio.save(libro);
        return libro;
    }
    // Método para eliminar un libro por su ID, delegando la operación al repositorio
    @Override
    public void eliminarPorId(long id) {
        libroRepositorio.deleteById(id);
    }
}