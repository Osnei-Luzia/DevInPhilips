package com.exercicios.exercicio.models;

import jakarta.persistence.*;

@Entity
@Table(name="perguntas")
public class PerguntaEntity {
    @Id
    private Long id;
    private String titulo;
    private String texto;
    @ManyToOne
    private QuizEntity id_quiz;
}
