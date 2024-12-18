package br.com.curso.aula04_01_for_somavalores;

public class Main {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for(int i = 0; i <= 100; i++) {
			soma = soma + i;
			System.out.println(soma);
		}
	}
}
