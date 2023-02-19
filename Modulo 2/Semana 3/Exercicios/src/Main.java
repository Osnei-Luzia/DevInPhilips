public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Dono");
        clinica.adicionarCliente();
        clinica.adicionarCliente();
        clinica.tratamento(clinica.clientes.get(0),25);
        clinica.listarClientes();
    }
}