import java.util.ArrayList;
import java.util.List;

public class clinica {
    String dono;
    String nome;
    String cnpj;
    String endereco;
    String id;
    List<Object> clientes = new ArrayList<>();

    static Double calcIMC(Double peso, Double altura){
        Double imc = peso/(altura*altura);
        if(imc<25){
            System.out.println("Peso Normal");
        }else if(imc<30){
            System.out.println("Excesso de Peso");
        }else if(imc<35){
            System.out.println("Obesidade Classe I");
        }else if(imc<40){
            System.out.println("Obesidade Classe II");
        }else{
            System.out.println("Obesidade Classe III");
        }
        return imc;
    }
}
