package br.com.atv2;

import javax.swing.JOptionPane;

public class Distancia {

	public static void main(String[] args) {
		
		float distanciaMetros = Float.parseFloat(JOptionPane.showInputDialog("Informe a distância: "));
		
		int km = 1000;
		int hectometro = 10;
		int decametro = 100;
		int decimetro = 10000;
		int centimetro = 100000;
		int milimetro = 10000000;
		
		float distanciaKm = distanciaMetros / km;
		float distanciaHec = distanciaKm * hectometro;
		float distanciaDecam = distanciaKm * decametro;
		float distanciaDeci = distanciaKm * decimetro;
		float distanciaCent = distanciaKm * centimetro;
		float distanciaMili = distanciaKm * milimetro;
		
		JOptionPane.showMessageDialog(null, "Distancias: " + "\n" + 
		"Km: " + distanciaKm + "\n" + 
		"Hm: " + distanciaHec + "\n" + 
		"Dam: " + distanciaDecam + "\n" + 
		"dm: " + distanciaDeci + "\n" + 
		"cm: " + distanciaCent + "\n" + 
		"mm: " + distanciaMili);

	}

}
