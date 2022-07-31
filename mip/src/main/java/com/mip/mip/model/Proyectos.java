package com.mip.mip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idProyec;
    private String nombreProyec;
    private String fotoProyec;
    private String descripcionProyec;

    public Proyectos(){

    }

    public Proyectos(Long idProyec, String nombreProyec, String fotoProyec, String descripcionProyec) {
        this.idProyec = idProyec;
        this.nombreProyec = nombreProyec;
        this.fotoProyec = fotoProyec;
        this.descripcionProyec = descripcionProyec;
    }

    public String getNombreProyec() {
        return nombreProyec;
    }

    public void setNombreProyec(String nombreProyec) {
        this.nombreProyec = nombreProyec;
    }

    public String getFotoProyec() {
        return fotoProyec;
    }

    public void setFotoProyec(String fotoProyec) {
        this.fotoProyec = fotoProyec;
    }

    public String getDescrpcionProyec() {
        return descripcionProyec;
    }

    public void setDescrpcionProyec(String descrpcionProyec) {
        this.descripcionProyec = descrpcionProyec;
    }

}
