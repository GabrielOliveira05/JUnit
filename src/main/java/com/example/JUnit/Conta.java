package com.example.JUnit;

public class Conta {

	private int conta;

	private int saldo;

	public Conta(int conta, int saldo) {
		this.conta = conta;
		this.saldo = saldo;
	}

	public Conta() {
	}

	public void tranferirSaldo(Conta contaOrigem, Conta contaDestino, int valor) {

		if (valor < 0) {
			throw new IllegalArgumentException("Valor deve ser maior que 0");
		}

	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
