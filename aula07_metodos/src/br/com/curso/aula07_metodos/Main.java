package br.com.curso.aula07_metodos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Integer[] numeros = new Integer[5];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = capturaNum();
		}
		
		for (Integer numero : numeros) {
			showNum(numero);
		}

	}
	static int capturaNum() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
		
		return num;
	}
	
	static void showNum(int numero) {
		if(numero%2 == 0) {			
			JOptionPane.showMessageDialog(null, numero);
		}
	}
}