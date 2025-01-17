/*
5) PAR ou ÍMPAR.
	Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.
*/

package parimpar;
import java.util.*;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número qualquer: ");
		int num = scanner.nextInt();
		
		if(num%2==0)
		{
			System.out.print("O número digitado é par");
		}
		else if(num%2==1)
		{
			System.out.print("Número digitado é impar");
		}
		
		scanner.close();
	}
}
