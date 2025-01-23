/*
 *  Interação entre Objetos
 *	Crie uma classe Turma. Crie Métodos para adicionar, remover e transferir alunos.
 *	Simule uma transferência de alunos entre duas turmas no main.
 */

package br.com.curso.poo.turmas;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		List<String> turmaA = new ArrayList<String>();
		List<String> turmaB = new ArrayList<String>();

		System.out.println("Adicionar alunos: ");
		
		adicionarAluno(turmaA);
		adicionarAluno(turmaB);
		adicionarAluno(turmaA);
		
		System.out.println("Mostrar alunos adicionados: ");
		
		mostrarAlunos(turmaA);
		mostrarAlunos(turmaB);
		
		System.out.println("Transferir aluno: ");
		transferirAlunos(turmaA, turmaB);
		
		System.out.println("Remover aluno: ");
		removerAluno(turmaB);
	}
	
	public static void adicionarAluno(List<String> turma) {
		Alunos aluno = new Alunos();
		String nomeAluno = JOptionPane.showInputDialog("Nome:");
		aluno.setNomeAluno(nomeAluno);

		turma.add(nomeAluno);
		
		System.out.println("Aluno(a) " + nomeAluno + " adicionado(a) com sucesso.");
	}

	public static void removerAluno(List<String> turma) {
		String getAluno = turma.get(turma.size()-1);
		turma.remove(turma.size() - 1);
		
		System.out.println("Aluno(a) " + getAluno + " removido(a).");
		System.out.println("Turma atualizada: " + turma);
	}
	
	public static void mostrarAlunos(List<String> turma) {
		System.out.println(turma);
	}
	
	
	public static void transferirAlunos(List<String> turma1, List<String> turma2) {
		
		turma2.add(turma1.get(turma1.size() - 1));
		turma1.remove(turma1.size()-1);
		
		System.out.println(turma1);
		System.out.println(turma2);
	}
	
}










/**/