package com.george.spring.app1.springboot_aplicaciones.controllers;
import com.george.spring.app1.springboot_aplicaciones.servicio.I_ServicioLibro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.george.spring.app1.springboot_aplicaciones.RepoLibros.repoLibros;
import com.george.spring.app1.springboot_aplicaciones.models.Libros;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/libros")
public class ControlaorLibreria  {
    // Inyección de dependencia del servicio
    private final I_ServicioLibro servicioLibro;
    
    public ControlaorLibreria(I_ServicioLibro servicioLibro , repoLibros libroRepositorio) {
        this.servicioLibro = servicioLibro;
       
    }
    @GetMapping("/{titulo}")
    // Método para obtener un libro por su título
    // ResponseEntity se utiliza para manejar la respuesta HTTP,
    //  permitiendo devolver un estado 200 OK si se encuentra el libro
    //  o un 404 Not Found si no se encuentra.
    
    public ResponseEntity<Libros> obtenerPorTitulo(@PathVariable String titulo) {
        return servicioLibro.obtenerPorTitulo(titulo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/todos")
    // Método para obtener todos los libros
    
    public List<Libros> obtenerTodosLosLibros() {
        return servicioLibro.obtenerTodosLosLibros();
    }
    @GetMapping("/id/{id}")
    // Método para obtener un libro por su ID
    
    public ResponseEntity<Libros> obtenerPorId(@PathVariable long id) {
        Optional<Libros> libroOpt = servicioLibro.obtenerPorId(id);
        return libroOpt.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
        
    }
    @PostMapping("/crear")
    public ResponseEntity<Libros> crear(@RequestBody Libros libro) {
        Libros libroGuardado = servicioLibro.guardar(libro);
        return ResponseEntity.ok(libroGuardado);       
    }
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable long id) {
        servicioLibro.eliminarPorId(id);
        return ResponseEntity.noContent().build();
    }
    
    
    
}
