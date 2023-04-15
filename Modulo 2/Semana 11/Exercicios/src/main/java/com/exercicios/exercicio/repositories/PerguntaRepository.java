package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.models.PerguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PerguntaRepository extends JpaRepository<PerguntaEntity,Long> {
    @Query("SELECT p FROM PerguntaEntity p WHERE p.id_quiz.id = :id_quiz")
    List<PerguntaEntity> findAllById_quiz(@Param("id_quiz")Long id_quiz);
}
