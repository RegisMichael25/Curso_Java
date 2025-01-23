/*
1) Ler Nome
	Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
	Ex:
	Nome do Funcionário(a): Maria do Carmo
	Salário: 1850,45
	Funcionário(a) Maria do Carmo tem um salário de R$1850,45 atualmente.
*/

package LerNome;
import java.text.NumberFormat;
import java.util.*;
import java.util.Locale;


public class LetNome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual nome do funcionário? ");
		String nomeFuncionario = scanner.nextLine();
		
		System.out.print("Qual salário de " + nomeFuncionario + "?");
		float salario = scanner.nextFloat();
		
		
		Locale localeBR = new Locale("pt","BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
		
		System.out.printf("O colaborador(a) " + nomeFuncionario +" tem o salário de R$" + dinheiro.format(salario));
		scanner.close();
	}
}

