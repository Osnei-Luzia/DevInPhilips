package com.example.banco.controller;

import com.example.banco.model.Cliente;
import com.example.banco.repository.ClienteRepository;
import com.example.banco.service.ClienteService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    ClienteService service = new ClienteService();
    @GetMapping
    public List<Cliente> listarClientes(){
        return service.listarClientes();
    }
    @GetMapping(params = "id")
    public Cliente listarClientes(@RequestParam Integer id){
        return service.listarClientesById(id);
    }
    @PostMapping
    public void salvarCliente(@RequestBody @Validated Cliente cliente){
        System.out.println(cliente.getNome());
        service.salverCliente(cliente);
    }
    @PutMapping
    public void alterarCliente(@RequestParam Integer id , @RequestBody Cliente cliente){
        service.alterarCliente(id,cliente);
    }
    @DeleteMapping("/{id}")
    public void alterarCliente(@PathVariable Integer id){
        service.deletarCliente(id);
    }
}
