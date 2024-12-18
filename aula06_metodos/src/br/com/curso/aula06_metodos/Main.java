package br.com.curso.aula06_metodos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String[] nomes = new String[4];
		
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = capturaNome();
		}
		
		for(String nome : nomes) {
			exibirNome(nome);
		}
	}
		
	
	static String capturaNome() {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		return nome;
	}

	static void exibirNome(String nome) {
		JOptionPane.showMessageDialog(null,nome);
	}

}
