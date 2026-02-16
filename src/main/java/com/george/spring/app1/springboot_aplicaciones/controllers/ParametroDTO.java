package com.george.spring.app1.springboot_aplicaciones.controllers;

public class ParametroDTO {
    private String informacion;
    public ParametroDTO(String informacion) {
        this.informacion = informacion;
    }
    public String getInformacion() {
        return informacion;
    }
    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
