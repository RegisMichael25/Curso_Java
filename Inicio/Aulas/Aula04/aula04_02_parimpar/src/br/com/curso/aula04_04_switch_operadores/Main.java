package br.com.curso.aula04_04_switch_operadores;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String operador = (JOptionPane.showInputDialog("Informe um operador matemático:"));
		
		switch (operador){
		case "+":
			JOptionPane.showMessageDialog(null, "Soma");
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "Subtração");
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "Divisão");
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "Multiplicação");
			break;	
		default:
			JOptionPane.showMessageDialog(null, "Nenhum operador valido!");
			break;
		}
	}
}