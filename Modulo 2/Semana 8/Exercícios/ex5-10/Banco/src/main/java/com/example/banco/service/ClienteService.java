package com.example.banco.service;

import com.example.banco.model.Cliente;
import com.example.banco.repository.ClienteRepository;

import java.util.List;

import static com.example.banco.repository.ClienteRepository.listaClientes;


public class ClienteService {
    ClienteRepository clientes = listaClientes.getInstance();

    public List<Cliente> listarClientes() {
        return clientes.getClientes();
    }

    public Cliente listarClientesById(Integer id) {
        return clientes.getClientesById(id);
    }
    public void criarCliente(Cliente cliente) {
        cliente.setId(Generic.buscarUltimoCliente()+1);
        clientes.setCliente(cliente);
    }
    public void alterarCliente(Integer id, Cliente clienteNovo) {
        int i = 0;
        for (Cliente cliente : listaClientes.getClientes()) {
            if (id == cliente.getId()) {
                clienteNovo.setId(cliente.getId());
                clientes.alterarCliente(i, clienteNovo);
                break;
            }
            i++;
        }
    }

    public void deletarCliente(Integer id) {
        int i = 0;
        for (Cliente cliente : listaClientes.getClientes()) {
            if (id == cliente.getId()) {
                clientes.deletarCliente(i);
                break;
            }
            i++;
        }
    }
}
