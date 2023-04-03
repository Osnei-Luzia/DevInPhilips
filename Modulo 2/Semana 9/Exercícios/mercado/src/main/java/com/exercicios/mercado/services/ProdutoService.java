package com.exercicios.mercado.services;

import com.exercicios.mercado.models.Produto;
import com.exercicios.mercado.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;
    public ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }
    public void salvarProduto(Produto produto){
        repository.save(produto);
    }
    public void buscarProdutos(){
        repository.findAll();
    }
    public void buscarProdutoById(Integer id){
        repository.findById(id);
    }
}
