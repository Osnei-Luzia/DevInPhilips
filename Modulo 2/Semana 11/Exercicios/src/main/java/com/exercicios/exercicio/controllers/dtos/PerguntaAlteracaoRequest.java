package com.exercicios.exercicio.controllers.dtos;

import com.exercicios.exercicio.models.QuizEntity;

public class PerguntaAlteracaoRequest {
    private Long id;
    private String titulo;
    private String texto;
    private QuizEntity id_quiz;

    public PerguntaAlteracaoRequest() {
    }

    public PerguntaAlteracaoRequest(Long id, String titulo, String texto, QuizEntity id_quiz) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.id_quiz = id_quiz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public QuizEntity getId_quiz() {
        return id_quiz;
    }

    public void setId_quiz(QuizEntity id_quiz) {
        this.id_quiz = id_quiz;
    }
}
