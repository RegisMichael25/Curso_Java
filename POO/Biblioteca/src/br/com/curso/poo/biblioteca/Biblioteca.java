package br.com.curso.poo.biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Biblioteca {

	public static void main(String[] args) {
		ArrayList<Livros> listaDeLivros = new ArrayList<Livros>();
		
		String resp = "s";
		
		while(!resp.equals("n")) {
			Livros tituloDoLivro = new Livros(); 
			Livros autorDoLivro = new Livros();
			adicionarLivros(tituloDoLivro, autorDoLivro, listaDeLivros);
			
			resp = JOptionPane.showInputDialog("Quer adicionar mais algum livro? ").toLowerCase();
		}
		
		listarLivros(listaDeLivros);
		
	}
	
	public static void adicionarLivros(Livros titulo, Livros autor, ArrayList lista) {
		String tituloLivro = JOptionPane.showInputDialog("Qual o nome titulo do livro?");
		String autorLivro = JOptionPane.showInputDialog("Quem é o autor do livro?");
		
		titulo.setTitulo(tituloLivro);
		autor.setAutor(autorLivro);
		lista.add(titulo.getTitulo());
		lista.add(autor.getAutor());
	}
	
	public static void listarLivros(ArrayList listaDeLivros) {
		
		JOptionPane.showMessageDialog(null, listaDeLivros);
	}
}
