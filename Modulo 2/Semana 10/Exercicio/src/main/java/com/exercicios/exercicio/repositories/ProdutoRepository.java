package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.models.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

}



