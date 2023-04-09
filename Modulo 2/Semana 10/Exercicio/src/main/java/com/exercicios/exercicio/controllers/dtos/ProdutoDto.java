package com.exercicios.exercicio.controllers.dtos;

public class ProdutoDto {
    public class ProdutoEntity {
        private Integer id;
        private String nome;
        private String descricao;
        private Double valor;

        @Override
        public String toString() {
            return "ProdutoEntity{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", descricao='" + descricao + '\'' +
                    ", valor=" + valor +
                    '}';
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
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
    }
}