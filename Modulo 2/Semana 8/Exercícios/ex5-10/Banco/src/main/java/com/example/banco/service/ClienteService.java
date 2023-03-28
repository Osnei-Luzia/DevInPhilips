package com.example.banco.service;

import com.example.banco.model.Cliente;
import com.example.banco.repository.ClienteRepository;

import java.util.List;


public class ClienteService {
    ClienteRepository clientes = new ClienteRepository();
    public List<Cliente> listarClientes(){
        return clientes.getClientes();
    }
    public Cliente listarClientesById(Integer id){
        return clientes.getClientesById(id);
    }
    public void criarCliente(Cliente cliente){
        clientes.setCliente(cliente);
    }
    public void alterarCliente(Integer id, Cliente cliente){
        clientes.alterarCliente(id,cliente);
    }
    public void deletarCliente(Integer id){
        clientes.deletarCliente(id);

    }
}
