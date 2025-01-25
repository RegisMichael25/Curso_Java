package br.com.curso.poo.desafio;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class Main {
	static String respAluno = "s";
	static String respLivro = "s";
	static int matricula = 1000;
	static Set<Alunos> alunos = new HashSet<>();
	static Set<Biblioteca> livros = new HashSet<>();
	static Set<Emprestimo> emprestimos = new HashSet<>();
	public static void main(String[] args) {
			System.out.println("Inicializando...");
			System.out.println("1 - Menu Aluno");
			System.out.println("2 - Menu Livro");
			System.out.println("3 - Menu Empréstimo");
			int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: "));
			
		switch(escolha) {
			case 1:
				System.out.println("Menu Aluno =======================");
				
				System.out.println("1 - Adicionar Aluno");
				System.out.println("2 - Editar Aluno");
				System.out.println("3 - Remover aluno");
				int alunoEscolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "));
				switch(alunoEscolha) {
				case 1:
					System.out.println("Adicionar aluno =======================");
					inserirAluno();
					mostrarAlunos();
					break;
				case 2:
					System.out.println("Editar aluno =======================");
					mostrarAlunos();
					editarAluno(JOptionPane.showInputDialog("Qual aluno deseja editar? "));
					break;
				case 3:
					System.out.println("Remover aluno =======================");
					mostrarAlunos();
					removerAluno(JOptionPane.showInputDialog("Qual aluno deseja remover? "));
					break;
				default:
					System.out.println("Saída =======================");
					
					System.out.println("Saindo...");
				}
				break;
				
			case 2:
				System.out.println("Menu Livro =======================");
				
				System.out.println("1 - Adicionar Livro");
				System.out.println("2 - Editar Livro");
				System.out.println("3 - Remover Livro");
				int livroEscolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "));
				switch(livroEscolha) {
				case 1:
					System.out.println("Adicionar livro =======================");
					inserirLivro();
					mostrarLivros();
					break;
				case 2:
					System.out.println("Editar livro =======================");
					mostrarLivros();
					editarLivro(JOptionPane.showInputDialog("Qual Livro deseja editar? "));
					break;
				case 3:
					System.out.println("Remover livro =======================");
					mostrarLivros();
					removerLivro(JOptionPane.showInputDialog("Qual Livro deseja remover? "));
					break;
				default:
					System.out.println("Saída =======================");
					
					System.out.println("Saindo...");
				}
				break;
				
			case 3:
				System.out.println("Menu Empréstimo =======================");
				
				System.out.println("1 - Emprestar livro");
				
				int emprestimoEscolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "));
				switch(emprestimoEscolha) {
				case 1:
					emprestarLivro(JOptionPane.showInputDialog("Qual aluno vai pegar o livro? "), JOptionPane.showInputDialog("Que livro ele escolheu? "));
					break;
				default:
					System.out.println("Saída =======================");
					
					System.out.println("Saindo...");
				}
				break;
			default:
				System.out.println("Saída =======================");
				
				System.out.println("Saindo...");
				
		}
	}

		// Alunos
	public static void inserirAluno() {
		while(!respAluno.equals("n")) {
			
			String nome = JOptionPane.showInputDialog("Qual nome do aluno? ");
			String serie = JOptionPane.showInputDialog("Qual a serie do aluno? ");
			
			alunos.add(new Alunos(matricula++, nome, serie));
			respAluno = JOptionPane.showInputDialog("Deseja continuar adicionando alunos? (s/n)").toLowerCase();
		}
		
	}
	
	public static void editarAluno(String nomeAluno) {
		
		for(Alunos aluno:alunos) {
			if(aluno.getNome().equalsIgnoreCase(nomeAluno)) {
				System.out.println("Editar aluno: " + aluno.getNome());
	            String novoNome = JOptionPane.showInputDialog("Novo nome do aluno: ");
	            String novaSerie = JOptionPane.showInputDialog("Nova série do aluno: ");
	            String novaMatricula = JOptionPane.showInputDialog("Nova matricula o aluno: ");

				aluno.setMatricula(Integer.parseInt(novaMatricula));
	            aluno.setNome(novoNome);
	            aluno.setSerieAluno(novaSerie);

	            JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
	            return;
			}
		}
		JOptionPane.showMessageDialog(null, "Aluno não encontrado.");
		
	}
	
	public static void removerAluno(String nomeAluno) {
		Alunos buscaAluno = null;
		
		for(Alunos aluno:alunos) {
			if(aluno.getNome().equalsIgnoreCase(nomeAluno)) {
	            buscaAluno = aluno;
	            break;
			}	
		}
		
		if(buscaAluno != null) {
			System.out.println("Removendo aluno: " + buscaAluno.getNome());
			alunos.remove(buscaAluno);
			JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Aluno não encontrado.");
		}
	}
	
	public static void mostrarAlunos() {
		System.out.println("Alunos cadastrados: ===============");
		for(Alunos aluno : alunos) {
			System.out.println(aluno);
		}
	}

	//Livros
	
	public static void inserirLivro() {
		byte identificador = 0;
		while(!respLivro.equals("n")) {
			String titulo = JOptionPane.showInputDialog("Qual titulo do livro? ");
			String autor = JOptionPane.showInputDialog("Qual o autor do livro? ");
			String genero = JOptionPane.showInputDialog("Qual o genero do livro? ");

			livros.add(new Biblioteca(identificador++,titulo, autor, genero));
			respLivro = JOptionPane.showInputDialog("Deseja continuar adicionando livros? (s/n)").toLowerCase();
		}
	}

	public static void editarLivro(String nomeLivro){
		for(Biblioteca livro:livros) {
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

		for(Biblioteca livro:livros) {
			if(livro.getTitulo().equalsIgnoreCase(nomeLivro)) {
	            buscaLivro = livro;
	            break;
			}
		}

		if(buscaLivro != null) {
			System.out.println("Removendo livro: " + buscaLivro.getTitulo());
			livros.remove(buscaLivro);
			JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Livro não encontrado.");
		}
	}

	public static void mostrarLivros() {
		System.out.println("Livros cadastrados: ");
		for(Biblioteca livro : livros) {
			System.out.println(livro);
		}
	}

	// Emprestimo

	public static void emprestarLivro(String nomeAluno, String nomeLivro) {
		Alunos aluno = null;
		Biblioteca livro = null;
		
		for(Alunos a:alunos) {
			if(a.getNome().equalsIgnoreCase(nomeAluno)) {
				aluno = a;
				break;
			}
		}
		
		for(Biblioteca l:livros) {
			if(l.getTitulo().equalsIgnoreCase(nomeLivro)) {
				livro = l;
				break;
			}
		}
		
		if(aluno != null && livro != null) {
			if(aluno.isPossuiLivro()) {
				JOptionPane.showMessageDialog(null, "Aluno já possui um livro emprestado.");
			} else {
				if(livro.getQuantidade() > 0) {
					emprestimos.add(new Emprestimo(aluno.getNome(), livro.getTitulo()));
					aluno.setPossuiLivro(true);
					livro.setQuantidade(livro.getQuantidade() - 1);
					JOptionPane.showMessageDialog(null, "Livro emprestado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Livro indisponível.");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno ou livro não encontrado.");
		}
	}

	public static void mostrarEmprestimos() {
		System.out.println("Emprestimos: ");
		for(Emprestimo emprestimo : emprestimos) {
			System.out.println(emprestimo);
		}
	}
}