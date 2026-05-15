package com.admision.lector_dbf.repository;

import com.admision.lector_dbf.entity.ProcesoAdmision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcesoAdmisionRepository
        extends JpaRepository<ProcesoAdmision, Long> {
}
