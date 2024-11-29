package br.com.curso.aula04_10_while;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int numero = 1;
		int soma = 0;
		int media = 0;
		
		while(numero<=15) {
			soma = soma+numero;
			
			media = soma / numero;
			
			numero ++;
		}

		JOptionPane.showMessageDialog(null, soma + "\n" + media);
	}

}
