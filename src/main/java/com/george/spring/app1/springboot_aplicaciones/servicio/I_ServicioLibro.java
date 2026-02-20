package com.george.spring.app1.springboot_aplicaciones.servicio;

import com.george.spring.app1.springboot_aplicaciones.models.Libros;
import java.util.List;
import java.util.Optional;


public interface I_ServicioLibro {
        List<Libros> obtenerTodosLosLibros();
        Optional<Libros> obtenerPorTitulo(String titulo);
        Optional<Libros> obtenerPorId(long id);
        Libros guardar(Libros libro);
        void eliminarPorId(long id);
}
