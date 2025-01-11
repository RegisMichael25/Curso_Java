package br.com.curso.poo.conta;

public class Conta {
	
	String numero;
	double saldo;
	
	public Conta(String numeroConta, double saldoInicial) {
		numero = numeroConta;
		saldo = saldoInicial;
	}
	
	void depositar(double deposito) {
		System.out.println("Depósito: "+ deposito);
		saldo = saldo + deposito;
	}
	
	void sacar(double saque) {
		System.out.println("Saque: "+ saque);
		saldo = saldo - saque;
	}
	
	void transferencia(double valor, Conta contaDestino) {
		System.out.println("Transferindo "+valor+ "para"+contaDestino.numero);
		saldo = saldo - valor;
		contaDestino.depositar(valor);
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
}
