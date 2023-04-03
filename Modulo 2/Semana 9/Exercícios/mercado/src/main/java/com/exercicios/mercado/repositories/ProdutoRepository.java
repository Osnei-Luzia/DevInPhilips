package com.exercicios.mercado.repositories;

import com.exercicios.mercado.models.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
