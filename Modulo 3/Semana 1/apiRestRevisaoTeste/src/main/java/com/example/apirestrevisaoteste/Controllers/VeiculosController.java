package com.example.apirestrevisaoteste.Controllers;

import com.example.apirestrevisaoteste.Controllers.dtos.RequestCriarVeiculo;
import com.example.apirestrevisaoteste.Models.Veiculo;
import com.example.apirestrevisaoteste.Services.VeiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculosController {
    private final VeiculoService service;

    public VeiculosController(VeiculoService service) {
        this.service = service;
    }

    @PostMapping
    public void cadastrarVeiculo(@RequestBody RequestCriarVeiculo request){
        service.salvar(request);
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> buscarVeiculos(){
        return ResponseEntity.ok().body(service.buscar());
    }

    @GetMapping("{id}")
    public ResponseEntity<Veiculo> buscarVeiculosById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.buscarById(id));
    }

    @DeleteMapping("{id}")
    public void removerVeiculo(@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping("{id}/multas")
    public void alterarVeiculo(@RequestBody RequestCriarVeiculo request, @PathVariable Long id){
        service.alterar(request ,id);
    }
}
