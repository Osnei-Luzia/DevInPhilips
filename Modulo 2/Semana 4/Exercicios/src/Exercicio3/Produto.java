package Exercicio3;

public class Produto implements Tributavel{
    double valor, valorImposto;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public double getValorImposto() {
        return valorImposto;
    }
}
