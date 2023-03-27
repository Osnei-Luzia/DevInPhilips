package br.com.exercicios.projeto.model;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;
public class Cliente {
    private Integer id;
    @CPF
    private String cpf;
    @NotBlank
    private String nome;
}
