/*
4) Conversor de Moeda
	Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. 
	Considere US$1,00 = R$3,45.
*/

package conversor;
import java.util.*;

public class ConversorDeMoedas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quanto de dinheiro você deseja converter de R$ para U$? ");
		float reais = scanner.nextFloat();
		float dollar = (float) (3.45);
		
		float convRealParaDollar = reais / dollar;
		
		System.out.print("A conversão do valor de R$ " + reais + " ficou em " + convRealParaDollar);
	}
}
