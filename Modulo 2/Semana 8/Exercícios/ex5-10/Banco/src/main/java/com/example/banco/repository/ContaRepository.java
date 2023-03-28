package com.example.banco.repository;

import com.example.banco.model.Conta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContaRepository {
    private static List<Conta> contas = new ArrayList<>();

    private static ContaRepository listaContas;
    public List<Conta>getContas(){
        return this.contas;
    }
    public Conta getContasById(Integer id){
        return contas.stream().filter(c -> c.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("Id inexistente."));
    }
    public void criarConta(Conta conta){
        this.contas.add(conta);
    }
    public void alterarConta(Integer id, Conta conta){
        this.contas.set(id,conta);
    }
    public void transferencia(Integer id1,Integer id2){
        this.contas.get(id1).setValor(this.contas.get(id1).getValor() + contas.get(id2).getValor());
        this.contas.get(id2).setValor(0);
    }
    public void deletarConta(Integer id){
        this.contas.remove(this.contas.get(id));
    }
    public static ContaRepository getInstance(){
        if (listaContas == null) {
            listaContas = new ContaRepository();
        }
        return listaContas;
    }
    private ContaRepository(){
        contas = new ArrayList<>();
    }
}
