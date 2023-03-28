package com.example.banco.service;

import com.example.banco.model.Conta;
import com.example.banco.repository.ClienteRepository;
import com.example.banco.repository.ContaRepository;

import java.util.List;

import static com.example.banco.repository.ClienteRepository.clientes;

public class ContaService {
    ContaRepository contas = new ContaRepository();
    public List<Conta>listarContas(){
        return contas.getContas();
    }
    public Conta listarContasById(Integer id){
        return contas.getContasById(id);
    }

    public void criarConta(Conta conta){
        if(conta.getClienteId() < clientes.size()){
            contas.criarConta(conta);
        }
    }
    public void alterarConta(Integer id, Conta conta){
        contas.alterarConta(id,conta);
    }
    public void deletarConta(Integer id){
        contas.deletarConta(id);
    }
}

