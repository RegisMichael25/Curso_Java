package com.br.curso.poo.Carro;

public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;
	
	public Carro(String marcaCarro, String modeloCarro, int anoCarro, String corCarro, double precoCarro){
		marca = marcaCarro;
		modelo = modeloCarro;
		ano = anoCarro;
		cor = corCarro; 
		preco = precoCarro;
	}
	
	public double desconto(float valorDesconto, double valorDoCarro) {
		double porcentagemDesconto = (valorDoCarro * valorDesconto) / 100;
		
		double valorTotalComDesconto = porcentagemDesconto - valorDoCarro;
		
		return valorTotalComDesconto;
		
	}
	
	public String pintarCarro(String cor) {
		this.cor = cor;
		
		return this.cor;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + ", preco=" + preco
				+ "]";
	}
	
}
