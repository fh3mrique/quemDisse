package com.pessoal.quemdisse.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pergunta")
@Getter
@Setter
public class Pergunta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer posicao;
	
	@OneToOne(mappedBy = "pergunta")
	private Citacao citacao;
	
	public Pergunta() {
		
	}

	public Pergunta(Long id, Integer posicao) {
		this.id = id;
		this.posicao = posicao;
	}
	
}
