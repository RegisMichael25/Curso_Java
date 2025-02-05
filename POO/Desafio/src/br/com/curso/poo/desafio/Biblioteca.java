package br.com.curso.poo.desafio;

public class Biblioteca {
	private int identificador;
	private String titulo;
	private String autor;
	private String genero;
	private int quantidade = 1;
	
	public Biblioteca(int identificador, String titulo, String autor, String genero) {
		this.identificador = identificador;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "\n Identificador do livro: " + identificador + 
				"\nTitulo do livro: " + titulo + 
				"\nAutor do livro: " + autor + 
				"\nGenero do livro: " + genero;
	}
}
