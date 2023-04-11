package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.models.RespostaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaEntity,Long> {
}
