package br.com.atv2;

import javax.swing.JOptionPane;

public class Salario {

	public static void Main(String args[]) {
		
		float salarioColab = Float.parseFloat(JOptionPane.showInputDialog("Qual salário do colaborador? "));
		
		float porcDeAumento = (float) 0.15;
		
		JOptionPane.showMessageDialog(null, "O salário com aumento ficou de " + (salarioColab * porcDeAumento));
		
	}
	
}
