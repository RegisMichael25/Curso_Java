package br.com.curso.poo.desafio;

public class Emprestimo {

	@Override
	public String toString() {
		return "\n Aluno que pegou o livro: \n" + aluno + "\n Livro Emprestado: \n" + livro;
	}

	private String aluno;
	private String livro;
	
	public Emprestimo(String aluno, String livro) {
		this.aluno = aluno;
		this.livro = livro;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}
}
