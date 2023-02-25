package Exercicio4;

import java.util.Scanner;

public class Idade {
    public static void metodo(){
        Scanner scanner = new Scanner(System.in);
        int idade;
        try{
            System.out.println("Informe sua idade.");
            idade = scanner.nextInt();
            if(idade>0&&idade<100){
                System.out.println("Olá, você tem "+idade+" anos de idade!");
            }else{
                String[] erro = new String[0];
                System.out.println(erro[10]);
            }
        }catch(Exception e){
            System.out.println("A idade informada deve ser maior que 0 e menor que 100");
            metodo();
        }
    }
}
