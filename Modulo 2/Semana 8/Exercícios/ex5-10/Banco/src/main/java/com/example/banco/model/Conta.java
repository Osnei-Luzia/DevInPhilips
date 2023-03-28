package com.example.banco.model;

public class Conta {
    Integer clienteId;
    Integer valor;

    public Integer getClienteId() {
        return clienteId;
    }

    public Integer getValor() {
        return valor;
    }
    public Conta(Integer clienteId, Integer valor){
        this.clienteId = clienteId;
        this.valor = valor;
    }
}
