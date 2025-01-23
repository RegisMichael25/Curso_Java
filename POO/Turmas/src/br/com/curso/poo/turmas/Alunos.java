package br.com.curso.poo.turmas;

public class Alunos {
	String nome;	

	
	public void setNomeAluno(String nomeCapturado) {
		this.nome = nomeCapturado;
		
	}

	public String getNomeAluno() {
		return this.nome;
	}

	
	@Override
	public String toString() {
		return "Turmas [nome=" + nome + "]";
	}
}
