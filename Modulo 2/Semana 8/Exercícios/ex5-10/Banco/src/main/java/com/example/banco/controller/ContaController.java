package com.example.banco.controller;

import com.example.banco.model.Conta;
import com.example.banco.service.ContaService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {
    ContaService service = new ContaService();
    @GetMapping
    public List<Conta> listarContas(){
        return service.listarContas();
    }
    @GetMapping(params = "id")
    public Conta listarClientes(@RequestParam Integer id){
        return service.listarContasById(id);
    }

    @PostMapping
    public void criarConta(@RequestBody @Validated Conta conta){
        service.criarConta(conta);
    }
    @PutMapping
    public void alterarConta(@RequestParam Integer id , @RequestBody Conta conta){
        service.alterarConta(id,conta);
    }
    @PutMapping("/transferencia")
    public void Transferencia(@RequestParam Integer idConta1, @RequestParam Integer idConta2){
        service.transferencia(idConta1,idConta2);
    }
    @DeleteMapping("/{id}")
    public void deletarConta(@PathVariable Integer id){
        service.deletarConta(id);
    }
}
