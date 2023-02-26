import Exercicio1.*;
import Exercicio2.*;
import Exercicio3.*;
import Exercicio4.*;
import Exercicio5.*;
import Exercicio6.*;
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
            case 4:
                exercicioQuatro();
                break;
            case 5:
                exercicioCinco();
                break;
            case 6:
                exercicioSeis();
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
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Informe o valor do produto");
        produto.setValor(scanner.nextDouble());
        System.out.println("Informe o valor do imposto");
        produto.setValorImposto(scanner.nextDouble());
        System.out.println(produto.calcularValorComImposto(produto.getValor(),produto.getValorImposto()));
    }
    public static void exercicioQuatro(){
        Idade.metodo();
    }
    public static void exercicioCinco(){
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Informe o nome do aluno");
        aluno.setNome(scanner.nextLine());
        System.out.println("Informe o sobrenome do aluno");
        aluno.setSobrenome(scanner.nextLine());
        System.out.println(aluno.registrar());
    }
    public static void exercicioSeis() {
        Scanner scanner = new Scanner(System.in);
        Teste teste = new Teste();
        System.out.println("Informe uma frase de até 6 caractéres");
        try {
            teste.validar(scanner.nextLine(), 6);
        }
        catch(TamanhoInvalidoException erro1){
            System.out.println("Tamanho inválido");
        }
        catch(IllegalArgumentException erro2){
            System.out.println("Informe valores corretos.");
        }
    }
}