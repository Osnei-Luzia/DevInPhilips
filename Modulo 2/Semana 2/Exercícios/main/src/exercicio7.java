import java.util.Arrays;
import java.util.List;

public class exercicio7 {
    public static void metodo(){
        System.out.println("Início da Atividade 7");
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");
        for(int i=0;i<nomes.size();i++){
            System.out.println(nomes.get(i));
        }
        System.out.println();
        for(String nome:nomes){
            System.out.println(nome);
        }
        System.out.println();
        int i=0;
        while(i<nomes.size()){
            System.out.println(nomes.get(i));
            i++;
        }
    }
}
