package com.admision.lector_dbf.controller;

import com.admision.lector_dbf.service.ProcesamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ProcesamientoController {

    @Autowired
    private ProcesamientoService procesamientoService;

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @PostMapping("/procesar")
    public String procesar(
            @RequestParam("nombreProceso")
            String nombreProceso,

            @RequestParam("identifi")
            MultipartFile identifi,

            @RequestParam("respuest")
            MultipartFile respuest,

            @RequestParam("claves")
            MultipartFile claves,

            Model model
    ) {

        try {

            procesamientoService
                    .procesarArchivos(
                            nombreProceso,
                            identifi,
                            respuest,
                            claves
                    );

            model.addAttribute(
                    "mensaje",
                    "Archivos procesados correctamente"
            );

        } catch (Exception e) {

            e.printStackTrace();

            model.addAttribute(
                    "error",
                    e.getMessage()
            );
        }

        return "resultado";
    }
}