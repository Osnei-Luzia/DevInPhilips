package com.example.apirestrevisaoteste.Services;

import com.example.apirestrevisaoteste.Controllers.dtos.RequestCriarVeiculo;
import com.example.apirestrevisaoteste.Models.Veiculo;
import com.example.apirestrevisaoteste.Repositories.VeiculoRepository;
import com.example.apirestrevisaoteste.Services.Mappers.VeiculoMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class VeiculoService {
    private final VeiculoRepository repository;
    private final VeiculoMapper mapper;

    public VeiculoService(VeiculoRepository repository, VeiculoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public void salvar(RequestCriarVeiculo request){
        repository.save(mapper.map((request)));
    }
    public List<Veiculo> buscar(){
        return repository.findAll();
    }
    public Veiculo buscarById(Long id){
        return repository.findById(id).orElseThrow();
    }
    public void alterar(RequestCriarVeiculo request, Long id){
        Veiculo veiculo = repository.findById(id).orElseThrow();
        if(!Objects.isNull(veiculo)){
            mapper.update(veiculo, request);
            repository.save(veiculo);
        }
    }
    public void deletar(Long id){
        Veiculo veiculo = repository.findById(id).orElseThrow();
        if(!Objects.isNull(veiculo)&&veiculo.getQtdMultas()<1){
            repository.delete(veiculo);
        }
    }
}
