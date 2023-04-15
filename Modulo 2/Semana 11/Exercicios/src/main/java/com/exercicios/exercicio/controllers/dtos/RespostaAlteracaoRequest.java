package com.exercicios.exercicio.controllers.dtos;

import com.exercicios.exercicio.models.PerguntaEntity;

public class RespostaAlteracaoRequest {
    private Long id;
    private String texto;
    private PerguntaEntity id_pergunta;
    public RespostaAlteracaoRequest() {

    }

    public RespostaAlteracaoRequest(Long id, String texto, PerguntaEntity id_pergunta) {
        this.id = id;
        this.texto = texto;
        this.id_pergunta = id_pergunta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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