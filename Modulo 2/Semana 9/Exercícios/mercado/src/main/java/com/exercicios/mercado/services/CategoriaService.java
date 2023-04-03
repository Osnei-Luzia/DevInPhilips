package com.exercicios.mercado.services;

import com.exercicios.mercado.models.Categoria;
import com.exercicios.mercado.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository repository;
    public CategoriaService(CategoriaRepository repository){
        this.repository = repository;
    }
    public void salvarCategoria(Categoria categoria){
        repository.save(categoria);
    }
    public List<Categoria> buscarCategorias(){
        return (List<Categoria>) repository.findAll();
    }
    public void excluirCategoria(int id){
        repository.deleteById(id);
    }
}
