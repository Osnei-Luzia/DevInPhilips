public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Dono");
        clinica.adicionarCliente();
        clinica.tratamento((Cliente) clinica.clientes.get(0));
    }
}