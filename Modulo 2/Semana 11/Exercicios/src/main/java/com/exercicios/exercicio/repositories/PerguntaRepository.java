package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.models.PerguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerguntaRepository extends JpaRepository<PerguntaEntity,Long> {
}
