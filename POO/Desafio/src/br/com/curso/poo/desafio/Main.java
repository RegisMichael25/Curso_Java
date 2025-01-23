package br.com.curso.poo.desafio;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class Main {
	static String resp = "s";
	static int matricula = 1000;
	static Set<Alunos> alunos = new HashSet<>();

	public static void main(String[] args) {
			inserirAluno();
			mostrarAlunos();
			editarAluno("João");
			mostrarAlunos();
			removerAluno("Regis");
			mostrarAlunos();
		}
	public static void inserirAluno() {
		while(!resp.equals("n")) {
			
			String nome = JOptionPane.showInputDialog("Qual nome do aluno? ");
			String serie = JOptionPane.showInputDialog("Qual a serie do aluno? ");
			
			alunos.add(new Alunos(matricula++, nome, serie));
			resp = JOptionPane.showInputDialog("Deseja continuar adicionando alunos? (s/n)").toLowerCase();
		}
		
	}
	
	public static void editarAluno(String nomeAluno) {
		
		for(Alunos aluno:alunos) {
			if(aluno.getNome().equalsIgnoreCase(nomeAluno)) {
	            String novoNome = JOptionPane.showInputDialog("Novo nome do aluno: ");
	            String novaSerie = JOptionPane.showInputDialog("Nova série do aluno: ");

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
			alunos.remove(buscaAluno);
			JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Aluno não encontrado.");
		}
	}
	
	public static void mostrarAlunos() {
		for(Alunos aluno : alunos) {
			System.out.println(aluno);
		}
	}
}

/*String titulo = JOptionPane.showInputDialog("Qual titulo do livro? ");
String autor = JOptionPane.showInputDialog("Quem é o autor do livro? ");
String genero = JOptionPane.showInputDialog("Qual genero do livro? ");

Biblioteca aluno = new Biblioteca(id++, titulo, autor, genero);
livros.add(titulo);*/
