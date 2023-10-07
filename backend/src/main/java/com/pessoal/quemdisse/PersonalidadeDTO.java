package com.pessoal.quemdisse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pessoal.quemdisse.entities.Citacao;
import com.pessoal.quemdisse.entities.Personalidade;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PersonalidadeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	private Long id;
	private String nome;
	private List<Citacao> citacoes = new ArrayList<>();

	public PersonalidadeDTO() {

	}

	public PersonalidadeDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public PersonalidadeDTO(Personalidade entidade) {
		this.id = entidade.getId();
		this.nome = entidade.getNome();
		this.citacoes = entidade.getCitacoes();
	}

}
