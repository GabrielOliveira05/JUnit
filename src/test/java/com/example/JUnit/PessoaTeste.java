package com.example.JUnit;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
	
	@Test
	void deveCalcularIdadeCorretamente() {
		Pessoa pessoa = new Pessoa("Gabriel", LocalDate.of(2002, 12, 5));
		
		Assertions.assertEquals(21, pessoa.getIdade());
	}
	
	@Test
	void deveRetornarSeEhMaiorDeIdade() {
		Pessoa pessoa = new Pessoa("GAbriel", LocalDate.of(2002, 12, 5));
		Assertions.assertTrue(pessoa.ehMaiorDeIdade());
	}
	
	
	@Test
	void validarObjetoEstaNull() {
		Pessoa pessoa = null;
		Assertions.assertNull(pessoa);
		
		Pessoa pessoa2 = new Pessoa("Luis", LocalDate.of(2002, 1, 1));
		Assertions.assertNotNull(pessoa2);
	}

}
