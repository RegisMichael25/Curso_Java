package br.com.atv2;

import javax.swing.JOptionPane;

public class Multa {

	public static void main(String[] args) {
		
		int kmPorHora = Integer.parseInt(JOptionPane.showInputDialog("Quantos Km por hora o carro estava?"));

		int kmLimite = 60;
		
		if (kmPorHora > kmLimite) {
			int multa =  (kmPorHora - kmLimite) * 5;
			JOptionPane.showMessageDialog(null, "A multa do carro ficou em " + multa);
		}
		
		
		
	}

}
