package com.exercicios.exercicio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="quiz")
public class QuizEntity {
    @Id
    private Long id;
    private String nome;
    private String descricao;
}
