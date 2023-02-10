import java.util.Arrays;
import java.util.List;

public class exercicio6 {
    public static void metodo(){
        System.out.println("Início da Atividade 6");
        List<Integer> lista = Arrays.asList(1,2,3,4);
        for(int i=0;i<lista.size();i++){
            lista.set(i,(lista.get(i)*3));
        }
        System.out.println(lista);
    }
}
