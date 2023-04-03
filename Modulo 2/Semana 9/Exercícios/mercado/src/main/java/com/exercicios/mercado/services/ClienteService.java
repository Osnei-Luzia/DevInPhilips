package com.exercicios.mercado.services;

import com.exercicios.mercado.models.Cliente;
import com.exercicios.mercado.models.Produto;
import com.exercicios.mercado.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repository;
    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }
    public void salvarCliente(Cliente cliente){
        repository.save(cliente);
    }
    public List<Cliente> buscarCliente(){
        return (List<Cliente>) repository.findAll();
    }
    public void excluirClienteById(int id){
        repository.deleteById(id);
    }
}
