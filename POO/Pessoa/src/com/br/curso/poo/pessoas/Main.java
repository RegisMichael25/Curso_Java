package com.br.curso.poo.pessoas;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Karol", 29); 
		Pessoa pessoa2 = new Pessoa("Regis", 30);
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		
		System.out.println(pessoa1.compararPessoas(pessoa2));
	}	
}
