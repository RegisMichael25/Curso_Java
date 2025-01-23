package br.com.curso.poo.desafio;

public class Emprestimo {

	private String aluno;
	private String livro;
	
	public Emprestimo(String aluno, String livro) {
		this.setAluno(aluno);
		this.setLivro(livro);
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
