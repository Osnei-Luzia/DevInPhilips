package com.exercicios.exercicio.controllers.dtos;

public class ProdutoDto {

    private Long id;
    private String nome;
    private String descricao;
    private Double valor;

    @Override
    public String toString() {
        return "ProdutoEntity{" +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ProdutoDto() {
    }

    public ProdutoDto(String nome, String descricao, Double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
}