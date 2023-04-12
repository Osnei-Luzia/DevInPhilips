package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.models.PerguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PerguntaRepository extends JpaRepository<PerguntaEntity,Long> {
    @Query("SELECT p FROM PerguntaEntity p WHERE p.id_quiz = :id_quiz")
    PerguntaEntity findById_quiz(Long id_quiz);
}
