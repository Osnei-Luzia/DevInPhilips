import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clinica {
    String dono;
    String nome;
    String cnpj;
    String endereco;
    String id;
    List<Cliente> clientes = new ArrayList<>();

    public Clinica(String dono){
        this.dono = dono;
    }
    public Clinica(String dono, List<Cliente> clientes){
        this.dono = dono;
        this.clientes = clientes;
    }

    public void adicionarCliente(){
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente(0,0,"");
        System.out.println("Informe o Nome do cliente.");
        cliente.setNome(scanner.nextLine());
        System.out.println("Informe o Peso do cliente. Eg: 80,0");
        cliente.setPeso(scanner.nextDouble());
        System.out.println("Informe a Altura do cliente. Eg: 1,80");
        cliente.setAltura(scanner.nextDouble());
        this.clientes.add(cliente);
        System.out.println("Cliente registrado com sucesso.");
    }
    public void tratamento(Cliente cliente){
        cliente.setPeso(cliente.getPeso()-5);
        System.out.println("Peso do cliente reduzido para: "+cliente.peso);
    }
    public void tratamento(Cliente cliente,double reducao){
        cliente.setPeso(cliente.getPeso()-reducao);
        System.out.println("Peso do cliente reduzido para: "+cliente.peso);
    }
    public void listarClientes(){
        for(Cliente cliente:clientes){
            System.out.println(cliente.getNome());
        }
    }
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
