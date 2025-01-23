package br.com.curso.poo.desafio;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class Main {
	static String resp = "s";
	// static int matricula = 1000;
	// static Set<Alunos> alunos = new HashSet<>();
	static Set<Biblioteca> livro = new HashSet<>();
	public static void main(String[] args) {
			//inserirAluno();
			// mostrarAlunos();
			// editarAluno(JOptionPane.showInputDialog("Qual nome do aluno que deseja editar? "));
			// mostrarAlunos();
			// removerAluno(JOptionPane.showInputDialog("Qual nome do aluno que deseja remover? "));
			// mostrarAlunos();
			inserirLivro();
			mostrarLivros();
			editarLivro(JOptionPane.showInputDialog("Qual nome do livro que deseja editar? "));
			mostrarLivros();
			removerLivro(JOptionPane.showInputDialog("Qual nome do livro que deseja remover? "));
			mostrarLivros();

		}

		// Alunos
	// public static void inserirAluno() {
	// 	while(!resp.equals("n")) {
			
	// 		String nome = JOptionPane.showInputDialog("Qual nome do aluno? ");
	// 		String serie = JOptionPane.showInputDialog("Qual a serie do aluno? ");
			
	// 		alunos.add(new Alunos(matricula++, nome, serie));
	// 		resp = JOptionPane.showInputDialog("Deseja continuar adicionando alunos? (s/n)").toLowerCase();
	// 	}
		
	// }
	
	// public static void editarAluno(String nomeAluno) {
		
	// 	for(Alunos aluno:alunos) {
	// 		if(aluno.getNome().equalsIgnoreCase(nomeAluno)) {
	// 			System.out.println("Editar aluno: " + aluno.getNome());
	//             String novoNome = JOptionPane.showInputDialog("Novo nome do aluno: ");
	//             String novaSerie = JOptionPane.showInputDialog("Nova série do aluno: ");
	//             String novaMatricula = JOptionPane.showInputDialog("Nova matricula o aluno: ");

	// 			aluno.setMatricula(Integer.parseInt(novaMatricula));
	//             aluno.setNome(novoNome);
	//             aluno.setSerieAluno(novaSerie);

	//             JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
	//             return;
	// 		}
	// 	}
	// 	JOptionPane.showMessageDialog(null, "Aluno não encontrado.");
		
	// }
	
	// public static void removerAluno(String nomeAluno) {
	// 	Alunos buscaAluno = null;
		
	// 	for(Alunos aluno:alunos) {
	// 		if(aluno.getNome().equalsIgnoreCase(nomeAluno)) {
	//             buscaAluno = aluno;
	//             break;
	// 		}	
	// 	}
		
	// 	if(buscaAluno != null) {
	// 		System.out.println("Removendo aluno: " + buscaAluno.getNome());
	// 		alunos.remove(buscaAluno);
	// 		JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
	// 	} else {
	// 		JOptionPane.showMessageDialog(null, "Aluno não encontrado.");
	// 	}
	// }
	
	// public static void mostrarAlunos() {
	// 	System.out.println("Alunos cadastrados: ");
	// 	for(Alunos aluno : alunos) {
	// 		System.out.println(aluno);
	// 	}
	// }

	//Livros
	
	public static void inserirLivro() {
		byte identificador = 0;
		while(!resp.equals("n")) {
			String titulo = JOptionPane.showInputDialog("Qual titulo do livro? ");
			String autor = JOptionPane.showInputDialog("Qual o autor do livro? ");
			String genero = JOptionPane.showInputDialog("Qual o genero do livro? ");
			
			livro.add(new Biblioteca(identificador++,titulo, autor, genero));
			resp = JOptionPane.showInputDialog("Deseja continuar adicionando livros? (s/n)").toLowerCase();
		}
	}

	public static void editarLivro(String nomeLivro){
		for(Biblioteca livro:livro) {
			if(livro.getTitulo().equalsIgnoreCase(nomeLivro)) {
				System.out.println("Editar livro: " + livro.getTitulo());
	            String novoTitulo = JOptionPane.showInputDialog("Novo titulo do livro: ");
	            String novoAutor = JOptionPane.showInputDialog("Novo autor do livro: ");
	            String novoGenero = JOptionPane.showInputDialog("Novo genero do livro: ");
	            String novoIdentificador = JOptionPane.showInputDialog("Novo identificador do livro: ");

				livro.setIdentificador(Integer.parseInt(novoIdentificador));
	            livro.setTitulo(novoTitulo);
	            livro.setAutor(novoAutor);
	            livro.setGenero(novoGenero);

	            JOptionPane.showMessageDialog(null, "Livro atualizado com sucesso!");
	            return;
			}
		}
		JOptionPane.showMessageDialog(null, "Livro não encontrado.");
	}

	public static void removerLivro(String nomeLivro) {
		Biblioteca buscaLivro = null;
		
		for(Biblioteca livro:livro) {
			if(livro.getTitulo().equalsIgnoreCase(nomeLivro)) {
	            buscaLivro = livro;
	            break;
			}	
		}
		
		if(buscaLivro != null) {
			System.out.println("Removendo livro: " + buscaLivro.getTitulo());
			livro.remove(buscaLivro);
			JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Livro não encontrado.");
		}
	}

	public static void mostrarLivros() {
		System.out.println("Livros cadastrados: ");
		for(Biblioteca livro : livro) {
			System.out.println(livro);
		}
	}
}
