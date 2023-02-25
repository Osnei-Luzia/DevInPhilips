import Exercicio1.ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();
        System.out.println("Escolha a operação");
        System.out.println("1- Deposito");
        System.out.println("2- Saque");

        switch (scanner.nextInt()){
            case 1:
                System.out.println("Informe o valor");
                conta.depositar(scanner.nextDouble());
                System.out.println("Novo saldo de: "+ conta.obterSaldo());
                break;
            case 2:
                System.out.println("Saldo disponível: "+ conta.obterSaldo());
                System.out.println("Informe o valor de saque.");
                conta.sacar(scanner.nextDouble());
                System.out.println("Novo saldo de: "+ conta.obterSaldo());
                break;
        }
    }
}