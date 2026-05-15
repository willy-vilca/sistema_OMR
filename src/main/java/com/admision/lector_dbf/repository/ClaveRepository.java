package com.admision.lector_dbf.repository;

import com.admision.lector_dbf.entity.Clave;
import com.admision.lector_dbf.entity.ProcesoAdmision;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClaveRepository
        extends JpaRepository<Clave, Long> {

    Optional<Clave> findByProcesoAdmisionAndTema(
            ProcesoAdmision procesoAdmision,
            String tema
    );
}