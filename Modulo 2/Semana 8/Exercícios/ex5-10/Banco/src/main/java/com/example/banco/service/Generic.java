package com.example.banco.service;

import com.example.banco.model.Cliente;
import com.example.banco.model.Conta;
import com.example.banco.repository.ClienteRepository;
import com.example.banco.repository.ContaRepository;

import java.util.Comparator;
import java.util.Optional;


public class Generic {
    static ClienteRepository clientes = ClienteRepository.getInstance();
    static ContaRepository contas = ContaRepository.getInstance();

    static Integer buscarUltimoCliente() {
        Optional<Cliente> c = clientes.getClientes().stream().sorted(Comparator.comparing(Cliente::getId).reversed()).findFirst();
        if(c.isPresent()){
            return c.get().getId();
        }
        else{
            return -1;
        }
    }

    static Integer buscarUltimaConta() {
        Optional<Conta> c = contas.getContas().stream().sorted(Comparator.comparing(Conta::getId).reversed()).findFirst();
        if(c.isPresent()){
            return c.get().getId();
        }
        else{
            return -1;
        }
    }
}