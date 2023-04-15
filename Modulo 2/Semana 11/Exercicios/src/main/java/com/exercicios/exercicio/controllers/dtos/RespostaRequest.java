package com.exercicios.exercicio.controllers.dtos;

import com.exercicios.exercicio.models.PerguntaEntity;

public class RespostaRequest {
    private String texto;
    private PerguntaEntity id_pergunta;
    public RespostaRequest() {

    }

    public RespostaRequest(String texto, PerguntaEntity id_pergunta) {
        this.texto = texto;
        this.id_pergunta = id_pergunta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public PerguntaEntity getId_pergunta() {
        return id_pergunta;
    }

    public void setId_pergunta(PerguntaEntity id_pergunta) {
        this.id_pergunta = id_pergunta;
    }
}
