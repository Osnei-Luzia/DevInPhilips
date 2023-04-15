package com.exercicios.exercicio.controllers.dtos.handler;

import org.springframework.validation.FieldError;

public class ErroValidacao {
    private final String campo;
    private final String mensagem;

    public ErroValidacao(FieldError erro) {
        this.campo = erro.getField();
        this.mensagem = erro.getDefaultMessage();
    }

    public String getCampo() {
        return campo;
    }

    public String getMensagem() {
        return mensagem;
    }
}
