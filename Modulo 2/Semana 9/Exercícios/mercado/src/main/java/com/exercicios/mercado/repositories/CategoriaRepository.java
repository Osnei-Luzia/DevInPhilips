package com.exercicios.mercado.repositories;

import com.exercicios.mercado.models.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
}