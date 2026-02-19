package com.george.spring.app1.springboot_aplicaciones.models;

import java.time.LocalDate;

public class Libros {
    private long idLibro;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;

    public Libros( long idLibro, String titulo, String autor, LocalDate fechaPublicacion) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }
    public long getIdLibro() {
        return idLibro;
    }
    public void setIdLibro(long idLibro) {
        this.idLibro = idLibro;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
}

