/*
2) Antecessor
	Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
	Ex:
	Digite um número: 9
	O antecessor de 9 é 8
	O sucessor de 9 é 10
*/



package Antecessor;
import java.util.*;

public class Antecessor {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número qualquer: ");
		int num = scanner.nextInt();
		
		System.out.print("O antecessor de " + num + " é " + (num - 1) + " e o sucessor de " + num + " é " + (num + 1) + ".");
	
		
		scanner.close();
	}	
}