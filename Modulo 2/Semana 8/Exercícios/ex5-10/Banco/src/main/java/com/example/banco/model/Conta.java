package com.example.banco.model;

import jakarta.validation.constraints.PositiveOrZero;


public class Conta {
    Integer id;
    Integer clienteId;
    @PositiveOrZero
    Integer valor;

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
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
