package com.example.banco.model;

import org.hibernate.validator.constraints.br.CPF;

public class Cliente {
    Integer id;
    String nome;

    @CPF
    String cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
}
