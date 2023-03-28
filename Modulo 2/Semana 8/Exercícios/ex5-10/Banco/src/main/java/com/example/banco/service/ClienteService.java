package com.example.banco.service;

import com.example.banco.model.Cliente;
import com.example.banco.repository.ClienteRepository;

import java.util.List;


public class ClienteService {
    ClienteRepository clientes = ClienteRepository.getInstance();

    public List<Cliente> listarClientes() {
        return clientes.getClientes();
    }

    public Cliente listarClientesById(Integer id) {
        clientes.getClientes()
                .stream()
                .filter(c -> c.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Id de cliente inexistente."));
        return clientes.getClientesById(id);
    }
    public void criarCliente(Cliente cliente) {
        cliente.setId(Generic.buscarUltimoCliente()+1);
        clientes.setCliente(cliente);
    }
    public void alterarCliente(Integer id, Cliente clienteNovo) {
        clientes.getClientes()
                .stream()
                .filter(c -> c.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Id de cliente inexistente."));
        int i = 0;
        for (Cliente cliente : clientes.getClientes()) {
            if (id == cliente.getId()) {
                clienteNovo.setId(cliente.getId());
                clientes.alterarCliente(i, clienteNovo);
                break;
            }
            i++;
        }
    }

    public void deletarCliente(Integer id) {
        clientes.getClientes()
                .stream()
                .filter(c -> c.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Id de cliente inexistente."));
        int i = 0;
        for (Cliente cliente : clientes.getClientes()) {
            if (id == cliente.getId()) {
                clientes.deletarCliente(i);
                break;
            }
            i++;
        }
    }
}
