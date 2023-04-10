package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.ProdutoDto;
import com.exercicios.exercicio.controllers.services.ProdutoServices;
import com.exercicios.exercicio.models.ProdutoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
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

    @GetMapping()
    public String mostrarProduto(Model model) {
        ProdutoDto produto = new ProdutoDto("nome","descricao",10.00);
        model.addAttribute("produto", produto);
        return "produto";
    }
    @GetMapping("/criarNovo")
    public String novoProduto(ProdutoDto produtoDto, Model model){
        //model.addAttribute("novoProduto",produtoDto);
        return "formularioProduto";
    }
    @PostMapping("/criarNovo")
    public String salvarProduto(@Validated ProdutoDto novoProduto, Model model){
        produtoServices.salvarProduto(novoProduto);
        return "redirect:/produto/listarTodos";
    }

    @GetMapping("/listarTodos")
    public String mostrarTodos(Model model){
        List<ProdutoDto> produtos = produtoServices.buscarTodos();
        model.addAttribute("produtos",produtos);
        System.out.println(produtos);
        return "listaProdutos";
    }

    @GetMapping("/editar")
    public String novaEdicao(ProdutoDto produtoDto, Model model){
        return "formularioEditar";
    }
    @PostMapping("/editar")
    public String editarProduto(@Validated ProdutoDto novoProduto, Model model){
        produtoServices.editarProduto(novoProduto);
        return "redirect:/produto/listarTodos";
    }
    @PostMapping("/deletar")
    public String deletarProduto(ProdutoDto novoProduto, Model model){
        produtoServices.deletarProduto(novoProduto);
        return "redirect:/produto/listarTodos";
    }
}