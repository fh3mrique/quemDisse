package com.pessoal.quemdisse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pessoal.quemdisse.entities.Pergunta;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {

}
