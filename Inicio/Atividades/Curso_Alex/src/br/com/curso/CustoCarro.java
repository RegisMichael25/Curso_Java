/*
1- O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor. 

2- receber do usuario os valores de percentual de distribuidor e de impostos.

 */

package br.com.curso;

import javax.swing.JOptionPane;

public class CustoCarro {

	public static void main(String[] args) {
		
		float custoDeFabrica = Float.parseFloat(JOptionPane.showInputDialog("Informe o custo de fabrica: "));		
		
		float percentualDistribuidor = (Float.parseFloat(JOptionPane.showInputDialog("Taxa do distribuidor: ")) / 100.0f);
		float percentualImposto = (Float.parseFloat(JOptionPane.showInputDialog("Imposto: ")) / 100.0f);
	
		float valorDistribuidor = (custoDeFabrica * percentualDistribuidor);
		float valorImposto = (custoDeFabrica * percentualImposto);
		
		float totalCusto = custoDeFabrica + valorDistribuidor + valorImposto; 
		
		JOptionPane.showMessageDialog(null,"O custo do carro é: " + totalCusto);
	}
}