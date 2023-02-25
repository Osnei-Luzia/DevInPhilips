import Exercicio1.ContaCorrente;
import Exercicio2.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um exercício: 1 a 6");
        switch (scanner.nextInt()){
            case 1:
                exercicioUm();
                break;
            case 2:
                exercicioDois();
                break;
            case 3:
                exercicioTres();
                break;
        }

    }
    public static void exercicioUm(){
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
    public static void exercicioDois(){
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        System.out.println(funcionario.obterCargo());
        System.out.println(gerente.obterCargo());
    }
    public static void exercicioTres(){

    }
}