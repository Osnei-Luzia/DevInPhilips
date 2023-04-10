package com.exercicios.exercicio.controllers.services;

import com.exercicios.exercicio.controllers.dtos.ProdutoDto;
import com.exercicios.exercicio.models.ProdutoEntity;
import com.exercicios.exercicio.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoServices {
    private final ProdutoRepository repository;

    public ProdutoServices(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<ProdutoDto> buscarTodos() {
        System.out.println(repository.findAll());
        return repository.findAll().stream().map(
                        produtoEntity -> new ProdutoDto(produtoEntity.getNome(),produtoEntity.getDescricao(), produtoEntity.getValor()))
                .collect(Collectors.toList());
    }

    public void salvarProduto(ProdutoDto produto) {
        ProdutoEntity produtoEntity = new ProdutoEntity(produto.getNome(),produto.getDescricao(),produto.getValor());
        repository.save(produtoEntity);
    }

    public void editarProduto(ProdutoDto novoProduto){
        ProdutoEntity produto = repository.findById(novoProduto.getId()).orElse(null);
        produto.setNome(novoProduto.getNome());
        produto.setDescricao(novoProduto.getDescricao());
        produto.setValor(novoProduto.getValor());

        repository.save(produto);
    }
    public void deletarProduto(ProdutoDto id){
        ProdutoEntity produto = repository.findById(id.getId()).orElse(null);
        repository.delete(produto);
    }
}