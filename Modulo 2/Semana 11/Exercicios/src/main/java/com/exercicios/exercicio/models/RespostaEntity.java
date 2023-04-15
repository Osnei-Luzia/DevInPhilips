package com.exercicios.exercicio.models;

import jakarta.persistence.*;

@Entity
@Table(name="respostas")
public class RespostaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String texto;
    @OneToOne
    private PerguntaEntity id_pergunta;

    public RespostaEntity() {

    }

    public RespostaEntity(Long id, String texto, PerguntaEntity id_pergunta) {
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
