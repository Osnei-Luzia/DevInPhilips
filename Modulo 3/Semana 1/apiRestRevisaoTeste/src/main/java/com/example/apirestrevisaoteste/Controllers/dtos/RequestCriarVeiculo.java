package com.example.apirestrevisaoteste.Controllers.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestCriarVeiculo {
    String tipo;
    String cor;
    String anoDeFabricacao;
    Integer qtdMultas;
}
