package br.com.atv2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um números inteiros: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro números inteiros: "));
		
		int soma = num1 + num2;
		int subtracao = num1 - num2;
		int multiplicacao = num1 * num2;
		float divisao = num1 / num2;
		
		JOptionPane.showMessageDialog(null, "Operações de " + num1 + " e " + num2 + "\n" + "Soma: " + soma + " \n" + 
		"Subtração: " + subtracao + "\n" + "Divisão: " + divisao + "\n" +"Multiplição: " + multiplicacao);
		
	}

}
