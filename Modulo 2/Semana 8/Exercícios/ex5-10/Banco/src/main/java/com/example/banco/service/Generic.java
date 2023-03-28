package com.example.banco.service;

import com.example.banco.model.Cliente;
import com.example.banco.model.Conta;

import java.util.Comparator;
import java.util.Optional;

import static com.example.banco.repository.ClienteRepository.listaClientes;
import static com.example.banco.repository.ContaRepository.listaContas;

public class Generic {
    static Integer buscarUltimoCliente() {
        Optional<Cliente> c = listaClientes.getClientes().stream().sorted(Comparator.comparing(Cliente::getId).reversed()).findFirst();
        if(c.isPresent()){
            return c.get().getId();
        }
        else{
            return -1;
        }
    }

    static Integer buscarUltimaConta() {
        Optional<Conta> c = listaContas.getContas().stream().sorted(Comparator.comparing(Conta::getId).reversed()).findFirst();
        if(c.isPresent()){
            return c.get().getId();
        }
        else{
            return -1;
        }
    }
}