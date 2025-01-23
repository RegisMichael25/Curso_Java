package br.com.curso.poo.desafio;

public class Alunos {
	private int matricula;
	private String nome;
	private String serieAluno;
	private boolean possuiLivro = false;
	private int limiteDeLivros = 1;
	
	
	public Alunos(int matricula, String nome, String serieAluno) {
		this.setMatricula(matricula);
		this.setNome(nome);
		this.setSerieAluno(serieAluno);
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSerieAluno() {
		return serieAluno;
	}

	public void setSerieAluno(String serieAluno) {
		this.serieAluno = serieAluno;
	}
	
	public boolean isPossuiLivro() {
		return possuiLivro;
	}

	public void setPossuiLivro(boolean possuiLivro) {
		this.possuiLivro = possuiLivro;
	}
	
	public int getLimiteDeLivros() {
		return limiteDeLivros;
	}

	public void setLimiteDeLivros(int limiteDeLivros) {
		this.limiteDeLivros = limiteDeLivros;
	}

	@Override
	public String toString() {
		return "Matricula Aluno:\n" + matricula + 
		"\nNome do Aluno:\n" + nome + 
		"\nSerie Aluno: \n" + serieAluno + 
		"\nPossui Livro: \n" + possuiLivro + 
		"\nLimite De Livros: \n" + limiteDeLivros;
	}

}
