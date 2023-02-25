package Exercicio1;
public class Conta implements Operavel{
    double saldo = 0;
    protected double obterSaldoAtual(){
        return this.saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
}