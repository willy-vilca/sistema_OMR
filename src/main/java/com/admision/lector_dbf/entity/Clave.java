package com.admision.lector_dbf.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "claves")
public class Clave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tema;

    @Column(columnDefinition = "TEXT")
    private String respuestasJson;

    @ManyToOne
    @JoinColumn(name = "proceso_id")
    private ProcesoAdmision procesoAdmision;

    public Clave() {
    }

    public Long getId() {
        return id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getRespuestasJson() {
        return respuestasJson;
    }

    public void setRespuestasJson(
            String respuestasJson
    ) {
        this.respuestasJson = respuestasJson;
    }

    public ProcesoAdmision getProcesoAdmision() {
        return procesoAdmision;
    }

    public void setProcesoAdmision(
            ProcesoAdmision procesoAdmision
    ) {
        this.procesoAdmision = procesoAdmision;
    }
}