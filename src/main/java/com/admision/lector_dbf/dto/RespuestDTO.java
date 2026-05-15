package com.admision.lector_dbf.dto;

import java.util.Map;

public class RespuestDTO {

    private String litho;

    private String tema;

    private Map<String, String> respuestas;

    public RespuestDTO() {
    }

    public RespuestDTO(
            String litho,
            String tema,
            Map<String, String> respuestas
    ) {
        this.litho = litho;
        this.tema = tema;
        this.respuestas = respuestas;
    }

    public String getLitho() {
        return litho;
    }

    public String getTema() {
        return tema;
    }

    public Map<String, String> getRespuestas() {
        return respuestas;
    }
}