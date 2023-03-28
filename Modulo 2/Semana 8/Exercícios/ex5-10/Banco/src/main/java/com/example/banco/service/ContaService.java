package com.example.banco.service;

import com.example.banco.model.Cliente;
import com.example.banco.model.Conta;
import com.example.banco.repository.ClienteRepository;
import com.example.banco.repository.ContaRepository;

import java.util.List;

import static com.example.banco.repository.ClienteRepository.listaClientes;
import static com.example.banco.repository.ContaRepository.listaContas;

public class ContaService {
    ContaRepository contas = listaContas.getInstance();
    ClienteRepository clientes = listaClientes.getInstance();

    public List<Conta> listarContas() {
        return contas.getContas();
    }

    public Conta listarContasById(Integer id) {
        return contas.getContasById(id);
    }
    public void criarConta(Conta conta) {
        for (Cliente cliente : listaClientes.getClientes()) {
            if (conta.getClienteId() == cliente.getId()) {
                conta.setId(Generic.buscarUltimaConta() + 1);
                contas.criarConta(conta);
                break;
            }
        }//throw error
    }
    public void alterarConta(Integer id, Conta contaNova) {
        int i = 0;
        for(Conta conta : listaContas.getContas()){
            if(id == conta.getId()){
                contaNova.setId(i);
                contas.alterarConta(i,contaNova);
                break;
            }
            i++;
        }
    }
    public void deletarConta(Integer id) {
        int i = 0;
        for (Conta conta : listaContas.getContas()) {
            if (id == conta.getId()) {
                contas.deletarConta(i);
                break;
            }
            i++;
        }
    }
}

