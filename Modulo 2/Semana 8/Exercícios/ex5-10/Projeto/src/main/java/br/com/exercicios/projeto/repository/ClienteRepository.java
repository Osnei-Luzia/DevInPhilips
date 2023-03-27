package br.com.exercicios.projeto.repository;

import br.com.exercicios.projeto.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    private static List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> encontrarClientes(){
        return clientes;
    }

    public Cliente encontrarClienteId(Integer id){
        return clientes.get(id);
    }

    public boolean salvarCliente(Cliente cliente){
        return clientes.add(cliente);
    }

    public boolean deletarClienteId(Integer id){
        return clientes.remove(encontrarClienteId(id));
    }

    public void atualizarClientId(Integer id, Cliente cliente){
        clientes.add(id,cliente);
    }
}
