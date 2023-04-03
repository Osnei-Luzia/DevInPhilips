package com.exercicios.mercado.services;

import com.exercicios.mercado.models.Produto;
import com.exercicios.mercado.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;
    public ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }
    public void salvarProduto(Produto produto){
        repository.save(produto);
    }
    public List<Produto> buscarProdutos(){
        return (List<Produto>) repository.findAll();
    }
    public void excluirProdutoById(int id){
        repository.deleteById(id);
    }
}
