package com.pessoal.quemdisse.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "citacao")
@Data
public class Citacao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(columnDefinition = "TEXT")
	private String texto;
	
	@ManyToOne
	@JoinColumn(name = "personalidade_id")
	@JsonIgnore
	private Personalidade personalidade;
	
	@OneToOne
	@JoinColumn(name = "pergunta_id")
	@JsonIgnore
	private Pergunta pergunta;
	
	public Citacao () {
		
	}
	
}
