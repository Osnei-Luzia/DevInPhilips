package com.example.banco.repository;

import com.example.banco.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    public static List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes(){
        return this.clientes;
    }
    public Cliente getClientesById(Integer id){
        return this.clientes.get(id);
    }
    public void setCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    public void alterarCliente(Integer id, Cliente cliente){
        this.clientes.set(id,cliente);
    }
    public void deletarCliente(Integer id){
        this.clientes.remove(this.clientes.get(id));
    }
}
