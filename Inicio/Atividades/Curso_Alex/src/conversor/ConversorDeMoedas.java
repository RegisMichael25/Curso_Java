/*
4) Conversor de Moeda
	Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. 
	Considere US$1,00 = R$3,45.
*/

package conversor;
import javax.swing.JOptionPane;

public class ConversorDeMoedas {
	public static void main(String[] args) {
		
		float cambio = 3.45f;
		
		String valorStr = JOptionPane.showInputDialog("Informe o valor em reais: ");
		
		float valorFl = Float.parseFloat(valorStr);
		
		float dolar = valorFl / cambio;
		
		JOptionPane.showMessageDialog(null, "Seu valor equivalente em dolar é " + dolar);
		
	}
}