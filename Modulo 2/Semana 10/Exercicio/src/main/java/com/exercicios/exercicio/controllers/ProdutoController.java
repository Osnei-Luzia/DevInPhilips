package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.ProdutoDto;
import com.exercicios.exercicio.models.ProdutoEntity;
import com.exercicios.exercicio.repositories.ProdutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoRepository repository;
    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public String mostrarProduto(ProdutoEntity produto, Model model){
        produto.setNome("Nome");
        produto.setDescricao("Descricao");
        produto.setValor(10.00);
        model.addAttribute("produto", produto);
        return "produto";
    }
}
