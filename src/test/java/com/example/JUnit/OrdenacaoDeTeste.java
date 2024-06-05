package com.example.JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


//Este método ele ordena de acordo com a ordem que você escolher na anotação de cada teste.
//Mas também tem este método: .Random.class    que ele ordena os testes de forma aleatória
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdenacaoDeTeste {
	
	@Order(2)
	@Test
	void validaFluxoA() {
		Assertions.assertTrue(true);
	}
	
	@Order(3)
	@Test
	void validaFluxoB() {
		Assertions.assertTrue(true);
	}
	
	@Order(4)
	@Test
	void validaFluxoC() {
		Assertions.assertTrue(true);
	}
	
	@Order(1)
	@Test
	void validaFluxoD() {
		Assertions.assertTrue(true);
	}

}


//@TestMethodOrder(MethodOrderer.DisplayName.class)
//public class TesteDisplay {
//	
//	@DisplayName("Teste sla")
//	@Test
//	void validaFluxoA() {
//		Assertions.assertTrue(true);
//	}
//	
//	@DisplayName("Teste descobrir sla")
//	@Test
//	void validaFluxoB() {
//		Assertions.assertTrue(true);
//	}
//	
//	@DisplayName("Teste para achar erro")
//	@Test
//	void validaFluxoC() {
//		Assertions.assertTrue(true);
//	}
//	
//	@DisplayName("Teste para sla")
//	@Test
//	void validaFluxoD() {
//		Assertions.assertTrue(true);
//	}
//
//}
