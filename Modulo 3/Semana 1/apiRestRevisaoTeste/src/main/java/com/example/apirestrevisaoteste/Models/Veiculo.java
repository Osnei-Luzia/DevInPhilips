package com.example.apirestrevisaoteste.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

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
