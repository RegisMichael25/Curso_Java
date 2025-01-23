package br.com.curso.poo.biblioteca;

public class Livros {
	private String titulo;
	private String autor;
	
	/*public Livros(String tituloLivro, String autorLivro) {
		titulo = tituloLivro;
		autor = autorLivro;
	}*/

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





	@Override
	public String toString() {
		return  "titulo=" + titulo + ", autor=" + autor;
	}	
	
}
