package com.example.banco.repository;

import com.example.banco.model.Conta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContaRepository {
    public static List<Conta> contas = new ArrayList<>();
    public List<Conta> getClientes() {
        return this.contas;
    }
    public List<Conta>getContas(){
        return this.contas;
    }
    public Conta getContasById(Integer id){
        return this.contas.get(id);
    }
    public void criarConta(Conta conta){
        this.contas.add(conta);
    }
    public void alterarConta(Integer id, Conta conta){
        this.contas.set(id,conta);
    }
    public void deletarConta(Integer id){
        this.contas.remove(this.contas.get(id));
    }
}
