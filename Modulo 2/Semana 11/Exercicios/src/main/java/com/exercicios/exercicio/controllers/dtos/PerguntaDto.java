package com.exercicios.exercicio.controllers.dtos;

public class PerguntaDto {
    private String titulo;
    private String texto;
    public PerguntaDto() {

    }
    public PerguntaDto(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
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
}
