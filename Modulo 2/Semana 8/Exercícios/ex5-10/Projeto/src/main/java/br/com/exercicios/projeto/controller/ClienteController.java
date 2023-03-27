package br.com.exercicios.projeto.controller;

import br.com.exercicios.projeto.model.Cliente;
import br.com.exercicios.projeto.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cliente")
@RestController
public class ClienteController {
    private final ClienteService service;
    public ClienteController(ClienteService service) {
        this.service = service;
    }
    @GetMapping
    public List<Cliente> listarCliente(){
        return service.pesquisarClientes();
    }
    @GetMapping(params = "id")
    public Cliente listarClienteId(Integer id){
        return service.pesquisarClientePorId(id);
    }

    @PostMapping
    public boolean criarCliente(Cliente cliente){
        return service.criarCliente(cliente);
    }
    @DeleteMapping("/{id}")
    public boolean listarCliente(@PathVariable Integer id){
        return service.deletarClientePorId(id);
    }
    @PutMapping()
    public void atualizarCliente(
            Integer id,
            Cliente cliente
    ){
        service.alterarClientePorId(id, cliente);
    }


}
