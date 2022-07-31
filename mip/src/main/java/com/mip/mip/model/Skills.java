package com.mip.mip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idSki;
    private String nombreSki;
    private String fotoSki;
    private String porcentaje;

    public Skills(){

    }

    public Skills(Long idSki, String nombreSki, String fotoSki, String porcentaje) {
        this.idSki = idSki;
        this.nombreSki = nombreSki;
        this.fotoSki = fotoSki;
        this.porcentaje = porcentaje;
    }

    public Long getIdSki() {
        return idSki;
    }

    public void setIdSki(Long idSki) {
        this.idSki = idSki;
    }

    public String getNombreSki() {
        return nombreSki;
    }

    public void setNombreSki(String nombreSki) {
        this.nombreSki = nombreSki;
    }

    public String getFotoSki() {
        return fotoSki;
    }

    public void setFotoSki(String fotoSki) {
        this.fotoSki = fotoSki;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }


}
