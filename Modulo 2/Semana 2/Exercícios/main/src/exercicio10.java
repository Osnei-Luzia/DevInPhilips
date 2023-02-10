import java.util.Scanner;

public class exercicio10 {
    public static void metodo() {
        System.out.println("Início da Atividade 10");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma palavra");
        String frase = scanner.nextLine();

        char[] teste = frase.toCharArray();
        int i = 0;
        int j = teste.length-1;
        while(j>i){
            i++;
            j--;
            if(teste[i]!=teste[j]){
                System.out.println("Não é Palíndrome");
                return;
            }
        }
        System.out.println("A frase informada é Palíndrome");
    }
}
