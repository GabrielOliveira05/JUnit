package com.example.JUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	
	private String nome;
	
	private LocalDate nascimento;

	public Pessoa(String nome, LocalDate localDate) {
		this.nome = nome;
		this.nascimento = localDate;
	}

	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
	
	
	}
	
	public boolean ehMaiorDeIdade() {
		return getIdade() >= 18;
	}
	
	

}
