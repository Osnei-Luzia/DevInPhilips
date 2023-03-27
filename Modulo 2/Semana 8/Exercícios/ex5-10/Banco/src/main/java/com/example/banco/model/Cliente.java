package com.example.banco.model;

import org.hibernate.validator.constraints.br.CPF;

public class Cliente {
    String nome;

    @CPF
    String cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
}
