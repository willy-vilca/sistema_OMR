package com.admision.lector_dbf.repository;

import com.admision.lector_dbf.entity.Examen;
import com.admision.lector_dbf.entity.ProcesoAdmision;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamenRepository
        extends JpaRepository<Examen, Long> {
    List<Examen>
    findByProcesoAdmisionOrderByPuntajeDesc(
            ProcesoAdmision procesoAdmision
    );
}
