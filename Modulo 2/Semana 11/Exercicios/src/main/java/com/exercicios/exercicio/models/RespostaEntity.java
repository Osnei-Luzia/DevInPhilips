package com.exercicios.exercicio.models;

import jakarta.persistence.*;

@Entity
@Table(name="respostas")
public class RespostaEntity {
    @Id
    private Long id;
    private String texto;
    @OneToOne
    private PerguntaEntity pergunta_id;
}
