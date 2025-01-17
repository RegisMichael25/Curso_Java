/*
3) Número Real
	Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
	Ex:
	Digite um número: 3.5
	O dobro de 3.5 é 7.0
	A terça parte de 3.5 é 1.16666
*/

package dobroTerca;
import java.util.Scanner;

public class DobroTerca {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = scanner.nextInt();
		
		float dobro = num * 2;
		float tercaParte = num / 3;
		
		System.out.println("O dobro de "+ num + " é " + dobro + ".");
		System.out.print("O terça parte de "+ num + " é " + tercaParte + ".");
		scanner.close();
	}
}
