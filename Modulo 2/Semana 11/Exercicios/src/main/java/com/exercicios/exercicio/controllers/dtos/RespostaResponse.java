package com.exercicios.exercicio.controllers.dtos;

public class RespostaResponse {
    private String texto;

    public RespostaResponse() {

    }
    public RespostaResponse(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
