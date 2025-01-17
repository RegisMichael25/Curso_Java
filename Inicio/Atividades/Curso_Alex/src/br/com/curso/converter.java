package br.com.curso;

import javax.swing.JOptionPane;

public class converter {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Informe um Número: ");
		
		String invertido = new StringBuffer(numero).reverse().toString();
		
		JOptionPane.showMessageDialog(null,"Número invertido: " + invertido);
			
	}

}
