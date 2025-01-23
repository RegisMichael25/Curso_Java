package com.br.curso.poo.Carro;

public class Main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Mercury", "Sable LS 3.0 V6", 1992, "Laranja", 8.185);
		Carro carro2 = new Carro("Wake", "Way 1.6 Total Flex 8V Mec", 2009, "Amarelo", 79.776);
		Carro carro3 = new Carro("Walk", " Buggy  Walk Sport 1.6 8V 58cv", 2005, "Amarelo", 100.371);
		
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
		alterarCor(carro1);
	}
	
	public static void alterarCor(Carro carro) {
		carro.pintarCarro("azul");
		System.out.println(carro);
	}
}
