import java.util.Arrays;

import static java.util.Objects.isNull;

public class exercicio5 {
    public static void metodo(){
        System.out.println("Início da Atividade 5");
        Integer[][] numbers = {
                {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47},
                {1},
                {1, -1},
                null,
                {-2, -2, -2, -2},
                {20, 10, 30}
        };
        for(int i=0;i< numbers.length;i++){
            try{
                Arrays.sort(numbers[i]);
                System.out.println("Menor número: "+numbers[i][0]);
                System.out.println("Maior número: "+numbers[i][numbers[i].length-1]);
            }catch(Exception e){
                System.out.println("Não é possível calcular");
            }
        }
    }
}
