package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FolhaDePagamentoTest {
    private FolhaDePagamento folha = new FolhaDePagamento();
    @Test
    @DisplayName("Quando o valor de salarioBase não for nulo e maior que 0, deve retornar salarioBruto")
    void testCalcularSalarioBruto() {
        //given
        Double salarioBase = 1000.0;
        Double gratificacao = 200.0;
        String funcao = "gerente";

        //when
        Double salarioBruto = folha.calcularSalarioBruto(salarioBase,gratificacao,funcao);

        //then
        assertNotNull(salarioBruto);
        assertTrue(salarioBruto>0);
    }
    @Test
    @DisplayName("Quando o valor de salario não for nulo e maior que 0, deve retornar salarioLiquido")
    void testCalcularSalarioLiquido(){
        //given
        Double salario = 1000.0;
        List<Double> descontos = new ArrayList<>();

        descontos.add(100.0);
        descontos.add(25.0);
        descontos.add(50.0);

        //when
        Double salarioLiquido = folha.calcularSalarioLiquido(salario, descontos);

        //then
        assertNotNull(salarioLiquido);
        assertTrue(salarioLiquido>0);
    }
}