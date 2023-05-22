package com.example.apirestrevisaoteste.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long placa;
    String tipo;
    String cor;
    String anoDeFabricacao;
    Integer qtdMultas;
}
