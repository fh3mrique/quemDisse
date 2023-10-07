package com.pessoal.quemdisse.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoal.quemdisse.PersonalidadeDTO;
import com.pessoal.quemdisse.entities.Personalidade;
import com.pessoal.quemdisse.repositories.PersonalidadeRepository;

@Service
public class PersonalidadeService {

	@Autowired
	private PersonalidadeRepository repository;
	
	public List<PersonalidadeDTO> findall() {
		
		List<Personalidade> personalidades = repository.findAll();
		
		List<PersonalidadeDTO> personalidadeDto = new ArrayList<>();
		
		for (Personalidade p : personalidades) {
			personalidadeDto.add(new PersonalidadeDTO(p));
		}
		
		return personalidadeDto;
	}

}
