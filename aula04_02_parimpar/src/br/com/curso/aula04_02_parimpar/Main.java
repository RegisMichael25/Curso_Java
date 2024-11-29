package br.com.curso.aula04_02_parimpar;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
		
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Número par.");
		}else if (numero % 2 == 1) {
			JOptionPane.showMessageDialog(null, "Número impar.");
		}
	}
}