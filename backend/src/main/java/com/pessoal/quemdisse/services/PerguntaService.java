package com.pessoal.quemdisse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoal.quemdisse.entities.Pergunta;
import com.pessoal.quemdisse.repositories.PerguntaRepository;

@Service
public class PerguntaService {
	
	@Autowired
	PerguntaRepository repository;

	public List<Pergunta> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
