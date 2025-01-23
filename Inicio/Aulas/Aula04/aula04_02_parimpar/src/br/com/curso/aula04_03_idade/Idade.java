package br.com.curso.aula04_03_idade;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
		
		if(idade < 18) {
			JOptionPane.showMessageDialog(null,"Menor de idade.");
		} else {
			JOptionPane.showMessageDialog(null, "Maior de idade.");
		}
	}
}