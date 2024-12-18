package aula04_01_imprima10;

import javax.swing.JOptionPane;

public class Imprima10 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(
				JOptionPane.showInputDialog("Informe um número de 0 a 10")
				);
		
		if(numero == 10) {
			JOptionPane.showMessageDialog(null, "Número igual a 10");
		}
	}
}