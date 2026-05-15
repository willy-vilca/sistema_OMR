package com.admision.lector_dbf.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "procesos_admision")
public class ProcesoAdmision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private LocalDateTime fechaCreacion;

    public ProcesoAdmision() {
    }

    @PrePersist
    public void prePersist() {
        fechaCreacion = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
}
