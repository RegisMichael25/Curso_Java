package com.br.curso.poo.pessoas;

public class Pessoa {
	String nome;
	int idade;
	
	public Pessoa(String nomePessoa, int idadePessoa) {
		nome = nomePessoa;
		idade = idadePessoa;
	}
	
	String compararPessoas(Pessoa pessoa){
			if(pessoa.idade > this.idade) {
				return "Pessoa mais velha é" + pessoa.nome;
			}else {
				return "Pessoa mais velha é " + this.nome;
			}			
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}


}
