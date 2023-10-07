package com.pessoal.quemdisse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoal.quemdisse.PersonalidadeDTO;
import com.pessoal.quemdisse.services.PersonalidadeService;

@RestController
@RequestMapping("/personalidade")
public class PersonalidadeController {
	
	@Autowired
	private PersonalidadeService personalidadeService;
	
	@GetMapping("/list")
	public ResponseEntity<List<PersonalidadeDTO>> findallPersonalidade(){
		
		List<PersonalidadeDTO> personalidades = personalidadeService.findall();
		
		return ResponseEntity.ok().body(personalidades);
	}

}
