package br.com.atv_aula6_metodos;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
public class Main 
{
	
	public static void main(String[] args) 
	{
	
		List<String> alunos = new ArrayList<>();
		List<Float> medias = new ArrayList<>();
		
		String resp = "s";
			 
		  while (!resp.equals("n")) 
		  {
				String nome = captNomeAluno(); 
				float media = calcMedia(nome);
				alunos.add(nome);
				medias.add(media);
			 
				resp = JOptionPane.showInputDialog("Deseja continuar? s/n").toLowerCase();
		  }
		
		for(int i = 0; i < alunos.size(); i++) 
		{
			JOptionPane.showMessageDialog(null, "O alunos " + alunos.get(i) + " ficou com a média: " + medias.get(i) + " e está "+ resultado(medias.get(i)) + ".");
		}

	}
	
	public static String resultado(float media) {
		if(media >= 0 && media <= 5) 
		{
			String res = " reprovado";
			return res;
		}
		else if(media > 5 && media <= 7 ) 
		{
			String res = " de recuperação";
			return res;
		}
		else if(media > 7 && media <= 10) 
		{
			String res = " aprovado";
			return res;
		}
		return null;
		
	}
	
	public static String captNomeAluno()
	{
		String nomeAluno = JOptionPane.showInputDialog("Infome o nome do aluno: ");
		return nomeAluno;
	}
	
	public static float calcMedia(String alunos) 
	{
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Qual a primeira nota do aluno " + alunos + " ?"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Qual a segunda nota do aluno " + alunos + " ?"));
		
		float media = (nota1+nota2)/2;
		
		return media;
	}

}
