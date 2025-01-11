package br.com.curso.poo.conta;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta("2310", 100.00);
		System.out.println(c1);
		c1.depositar(200);
		System.out.println(c1);
		c1.sacar(50);
		System.out.println(c1);
		
		Conta c2 = new Conta("9987", 1000.00);
		System.out.println(c2);
		c2.depositar(500);
		System.out.println(c2);
		c2.sacar(100);
		System.out.println(c2);
		
		c1.transferencia(200, c2);
		
		System.out.println(c1);
		System.out.println(c2);
	}
	}


