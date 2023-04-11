package com.exercicios.exercicio.controllers.dtos;

public class RespostaDto {
    private String texto;

    public RespostaDto() {
    }

    public RespostaDto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
