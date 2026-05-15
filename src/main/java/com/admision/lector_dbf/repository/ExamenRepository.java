package com.admision.lector_dbf.repository;

import com.admision.lector_dbf.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository
        extends JpaRepository<Examen, Long> {
}
