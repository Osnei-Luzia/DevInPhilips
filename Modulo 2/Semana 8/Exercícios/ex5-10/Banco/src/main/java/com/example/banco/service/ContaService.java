package com.example.banco.service;

import com.example.banco.model.Cliente;
import com.example.banco.model.Conta;
import com.example.banco.repository.ClienteRepository;
import com.example.banco.repository.ContaRepository;

import java.util.List;

public class ContaService {
    ContaRepository contas = ContaRepository.getInstance();
    ClienteRepository clientes = ClienteRepository.getInstance();

    public List<Conta> listarContas() {
        return contas.getContas();
    }

    public Conta listarContasById(Integer id) {
        contas.getContas()
                .stream()
                .filter(c -> c.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Id de conta inexistente."));
        return contas.getContasById(id);
    }

    public void criarConta(Conta conta) {
        clientes.getClientes()
                .stream()
                .filter(c -> c.getId() == conta.getClienteId())
                .findAny()
                .orElseThrow(() -> new RuntimeException("Id de cliente inexistente"));
        /*
        boolean check = false;
        for (Cliente cliente : listaClientes.getClientes()) {
            if (conta.getClienteId() == cliente.getId()) {
                conta.setId(Generic.buscarUltimaConta() + 1);
                contas.criarConta(conta);
                check = true;
                break;
            }
        }
        if (check == false) {
            throw new RuntimeException("Id de cliente inexistente");
        }
        */
    }

    public void alterarConta(Integer id, Conta contaNova) {
        contas.getContas()
                .stream()
                .filter(c -> c.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Id de conta inexistente"));
        int i = 0;
        for (Conta conta : contas.getContas()) {
            if (id == conta.getId()) {
                contaNova.setId(conta.getId());
                contaNova.setClienteId(conta.getClienteId());
                contaNova.setValor(contaNova.getValor() + conta.getValor());
                if (contaNova.getValor() >= 0) {
                    contas.alterarConta(i, contaNova);
                }else{
                    throw new RuntimeException("Saldo não pode negativar");
                }
                break;
            }
            i++;
        }
    }

    public void transferencia(Integer id1, Integer id2) {
        int i = 0;
        int conta1 = -1, conta2 = -1;
        for (Conta conta : contas.getContas()) {
            if (id1 == conta.getId()) {
                conta1 = i;
            }
            if (id2 == conta.getId()) {
                conta2 = i;
            }
            i++;
        }
        if (conta1 != -1 && conta2 != -1) {
            contas.transferencia(conta1, conta2);
        }else{
            throw new RuntimeException("Ids inválidos");
        }
    }

    public void deletarConta(Integer id) {
        contas.getContas()
                .stream()
                .filter(c -> c.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Id de conta inexistente."));
        int i = 0;
        for (Conta conta : contas.getContas()) {
            if (id == conta.getId()) {
                contas.deletarConta(i);
                break;
            }
            i++;
        }
    }
}

