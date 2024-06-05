package com.example.JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTeste {
	
	//Este exemplo verifica se lançará uma Exception se caso o valor da tranferencia for menor que 0 
	@Test
	void validarValorTranferenciaMenorQue0() {
		
		Conta contaOrigem = new Conta(123456, 0);
		Conta contaDestino = new Conta(123488, 100);
		
		Conta conta = new Conta();
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->
				conta.tranferirSaldo(contaOrigem, contaDestino, -1));
	}
	
	//Este exemplo verifica se não será lançada nenhuma Exception caso o valor da trasferencia for maior que 0
	@Test
	void validarValorTranferenciaMaiorQue0() {
		
		Conta contaOrigem = new Conta(123456, 0);
		Conta contaDestino = new Conta(123488, 100);
		
		Conta conta = new Conta();
		
		Assertions.assertDoesNotThrow(() -> conta.tranferirSaldo(contaOrigem, contaDestino, 20));
	}

}
