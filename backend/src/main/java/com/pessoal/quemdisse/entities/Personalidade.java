package com.pessoal.quemdisse.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "personalidade")
@Data
public class Personalidade {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;
	private String nome;
	
	@OneToMany(mappedBy = "personalidade")
	private List<Citacao> citacoes = new ArrayList<>();
	
	public Personalidade() {
		
	}
	
}
