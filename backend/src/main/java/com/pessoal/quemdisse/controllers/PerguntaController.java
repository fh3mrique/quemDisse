package com.pessoal.quemdisse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoal.quemdisse.entities.Pergunta;
import com.pessoal.quemdisse.services.PerguntaService;

@RestController
@RequestMapping("/pergunta")
public class PerguntaController {
	
	@Autowired
	private PerguntaService perguntaService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Pergunta>> findAllPerguntas(){
		
		List<Pergunta> perguntas = perguntaService.findAll();
		
		return ResponseEntity.ok().body(perguntas);
	}
	
	

}
