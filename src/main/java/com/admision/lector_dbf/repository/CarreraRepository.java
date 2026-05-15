package com.admision.lector_dbf.repository;

import com.admision.lector_dbf.entity.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarreraRepository
        extends JpaRepository<Carrera, Long> {
}
