package br.com.curso.lista01_01_lernome;

import java.util.Scanner;
/**
 * 1) Ler Nome
 * Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
 * Ex:
 * Nome do Funcionário(a): Maria do Carmo
 * Salário: 1850,45
 * Funcionário(a) Maria do Carmo tem um salário de R$1850,45 atualmente.
 */

public class Main {

	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = entrada.next();

		System.out.println("Informe o salario: ");
		float salario = entrada.nextFloat();
		
		System.out.println("Funcionário(a) " + nome + " tem um salário de " + salario + " atualmente.");
		
		entrada.close();
		
	}

}
