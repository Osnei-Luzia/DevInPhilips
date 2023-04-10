package com.exercicios.exercicio.models;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
}
