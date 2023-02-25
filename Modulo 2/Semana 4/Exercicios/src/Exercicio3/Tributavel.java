package Exercicio3;

public interface Tributavel {
    default double calcularValorComImposto(double valor1,double valor2){
        return valor1 + valor2;
    }
}
