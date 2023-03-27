package br.com.exercicios.projeto.service;

import br.com.exercicios.projeto.repository.ClienteRepository;
import br.com.exercicios.projeto.model.Cliente;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerErrorException;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repository;
    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }
    public boolean criarCliente(Cliente cliente){
        try{
            return repository.salvarCliente(cliente);

        } catch (Exception e) {
            throw new ServerErrorException("ClienteService", e);
        }
    }
    public List<Cliente> pesquisarClientes(){
        return repository.encontrarClientes();
    }
    public Cliente pesquisarClientePorId(Integer id){
        try{
            return repository.encontrarClienteId(id);
        } catch (Exception e) {
            throw new ServerErrorException("ClienteService", e);
        }
    }
    public boolean deletarClientePorId(Integer id){
        return repository.deletarClienteId(id);
    }
    public void alterarClientePorId(Integer id, Cliente cliente){
        repository.atualizarClientId(id, cliente);
    }
}
