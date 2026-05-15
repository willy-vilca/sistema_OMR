package com.admision.lector_dbf.dto;

public class IdentifiDTO {

    private String litho;
    private String tema;
    private String codigo;

    public IdentifiDTO() {
    }

    public IdentifiDTO(
            String litho,
            String tema,
            String codigo
    ) {
        this.litho = litho;
        this.tema = tema;
        this.codigo = codigo;
    }

    public String getLitho() {
        return litho;
    }

    public String getTema() {
        return tema;
    }

    public String getCodigo() {
        return codigo;
    }
}
