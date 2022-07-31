package com.mip.mip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SoftSkills {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idSoftSki;
    private String nombreSoftSki;
    private String fotoSoftSki;
    private String porcentajeSoft;

    public SoftSkills(){

    }

    public SoftSkills(Long idSoftSki, String nombreSoftSki, String fotoSoftSki, String porcentajeSoft) {
        this.idSoftSki = idSoftSki;
        this.nombreSoftSki = nombreSoftSki;
        this.fotoSoftSki = fotoSoftSki;
        this.porcentajeSoft = porcentajeSoft;
    }

    public Long getIdSoftSki() {
        return idSoftSki;
    }

    public void setIdSoftSki(Long idSoftSki) {
        this.idSoftSki = idSoftSki;
    }

    public String getNombreSoftSki() {
        return nombreSoftSki;
    }

    public void setNombreSoftSki(String nombreSoftSki) {
        this.nombreSoftSki = nombreSoftSki;
    }

    public String getFotoSoftSki() {
        return fotoSoftSki;
    }
    public void setFotoSoftSki(String fotoSoftSki) {
        this.fotoSoftSki = fotoSoftSki;
    }

    public String getPorcentajeSoft() {
        return porcentajeSoft;
    }

    public void setPorcentajeSof(String porcentajeSoft) {
        this.porcentajeSoft = porcentajeSoft;
    }


}


