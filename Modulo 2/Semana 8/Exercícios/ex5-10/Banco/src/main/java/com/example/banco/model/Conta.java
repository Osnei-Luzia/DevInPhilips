package com.example.banco.model;

public class Conta {
    Integer id;
    Integer clienteId;
    Integer valor;

    public Integer getClienteId() {
        return clienteId;
    }

    public Integer getValor() {
        return valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Conta(Integer clienteId, Integer valor){
        this.clienteId = clienteId;
        this.valor = valor;
    }
}
