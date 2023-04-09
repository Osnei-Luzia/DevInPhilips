package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.ProdutoDto;
import com.exercicios.exercicio.controllers.services.ProdutoServices;
import com.exercicios.exercicio.models.ProdutoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoServices produtoServices;

    public ProdutoController(ProdutoServices produtoServices) {
        this.produtoServices = produtoServices;
    }

    @GetMapping
    public String mostrarProduto(Model model) {
        ProdutoDto produto = new ProdutoDto("nome","descricao",10.00);
        produtoServices.salvarProduto(produto);
        model.addAttribute("produto", produto);
        return "produto";
    }

    @GetMapping("/listarTodos")
    public String mostrarTodos(Model model){
        List<ProdutoDto> produtos = produtoServices.buscarTodos();
        model.addAttribute("produtos",produtos);
        System.out.println(produtos);
        return "listaProdutos";
    }
    @PostMapping("/criarNovo")
    public void criarNovo(ProdutoDto produto, Model model){

    }
}