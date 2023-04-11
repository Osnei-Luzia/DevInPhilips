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

    public RespostaEntity() {

    }

    public RespostaEntity(Long id, String texto, PerguntaEntity pergunta_id) {
        this.id = id;
        this.texto = texto;
        this.pergunta_id = pergunta_id;
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

    public PerguntaEntity getPergunta_id() {
        return pergunta_id;
    }

    public void setPergunta_id(PerguntaEntity pergunta_id) {
        this.pergunta_id = pergunta_id;
    }
}
