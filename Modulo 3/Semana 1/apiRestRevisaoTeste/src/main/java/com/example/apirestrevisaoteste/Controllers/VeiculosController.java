package com.example.apirestrevisaoteste.Controllers;

import com.example.apirestrevisaoteste.Controllers.dtos.RequestCriarVeiculo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculosController {
    private final VeiculoService service;

    public VeiculosController(VeiculoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity cadastrarVeiculo(@RequestBody RequestCriarVeiculo request){
        service.salvar(request);
    }

    @GetMapping
    public ResponseEntity buscarVeiculos(){
        service.buscar();
    }

    @GetMapping("{id}")
    public ResponseEntity buscarVeiculosById(@PathVariable Long id){
        service.buscarById(id);
    }

    @DeleteMapping("{id}")
    public void removerVeiculo(@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping("{id}/multas")
    public ResponseEntity alterarVeiculo(@PathVariable Long id){
        service.alterar(id);
    }
}
