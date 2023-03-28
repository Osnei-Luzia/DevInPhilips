package com.example.banco.repository;

import com.example.banco.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    private static List<Cliente> clientes = new ArrayList<>();
    public static ClienteRepository listaClientes;

    public List<Cliente> getClientes(){
        return this.clientes;
    }
    public Cliente getClientesById(Integer id){
         return clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }
    public void setCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    public void alterarCliente(Integer id, Cliente clienteNovo){
        this.clientes.set(id,clienteNovo);
    }
    public void deletarCliente(Integer id){
        this.clientes.remove(this.clientes.get(id));
    }

    public static ClienteRepository getInstance() {
        if (listaClientes == null) {
            listaClientes = new ClienteRepository();
        }
        return listaClientes;
    }
    private ClienteRepository(){
        clientes = new ArrayList<>();
    }
}
