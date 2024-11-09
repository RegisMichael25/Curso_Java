package proj_media;

import javax.swing.JOptionPane;
public class Media{
    
    public static void main(String[] args){
        
        JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de notas do Aluno!");
        JOptionPane.showMessageDialog(null, "O padrão de notas é entre 0 e 10");
        JOptionPane.showMessageDialog(null, "Vamos lá!");
        
        
        String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: ");
        
        //------------------------------------------------------------------------------
        
        JOptionPane.showMessageDialog(null, "Agora informe as 4 notas de " + nomeAluno + " dos 4 bimestres: ");
        JOptionPane.showMessageDialog(null, "Digite a primeira nota: ");
        
        String nota1Str = JOptionPane.showInputDialog(null,"Nota 1: ");
        float nota1 = Float.parseFloat(nota1Str);
        
        if(nota1 < 0 || nota1 > 10)
        {
            verificarNota(nota1);
        }
        
        //------------------------------------------------------------------------------
        
        JOptionPane.showMessageDialog(null, "Show! Agora informe a segunda nota: ");
        String nota2Str = JOptionPane.showInputDialog(null, "Nota 2: ");
        float nota2 = Float.parseFloat(nota2Str);
        
        if(nota2 < 0 || nota2 > 10)
        {
        	verificarNota(nota2);
        }
        
        //------------------------------------------------------------------------------
        
        JOptionPane.showMessageDialog(null, "Maravilha, vamos para a terceira nota do(a) aluno(a) " + nomeAluno);
        String nota3Str = JOptionPane.showInputDialog("Nota 3: ");
        float nota3 = Float.parseFloat(nota3Str);
        
        if(nota3 < 0 || nota3 > 10)
        {
        	verificarNota(nota3);
        }
        
      //------------------------------------------------------------------------------
        
        JOptionPane.showMessageDialog(null, "Pronto, agora só falta a quarta nota: ");
        String nota4Str = JOptionPane.showInputDialog("Nota 4: ");
        
        float nota4 = Float.parseFloat(nota4Str);
        if(nota4 < 0 || nota4 > 10) 
        {
        	verificarNota(nota4);
        }
        
        float media = calcMedia(nota1, nota2, nota3, nota4);
        
        resultado(nomeAluno, media, aprovadoOuReprovado(media));
        
      }
        
      //------------------------------------------------------------------------------
        
    public static float verificarNota(float nota) {
    	
    	while(nota < 0 || nota > 10)
    	{
    		JOptionPane.showMessageDialog(null, "Nota digitada está fora dos padrões.");
    		String testNota = JOptionPane.showInputDialog("Digite uma nota entre 0 e 10");
    		nota = Float.parseFloat(testNota);
    	}
    	
    	return nota;
    }
    
    public static float calcMedia(float nota1, float nota2, float nota3, float nota4) {
    	
    	float media = (nota1 + nota2 + nota3 + nota4) / 4;
    	
    	return media;
    }
    
    public static String aprovadoOuReprovado(float media) {
    	
    	String aprovadoReprovado = null;
    	
    	if(media < 5)
    	{
    		aprovadoReprovado = "reprovado";
    	}
    	else if (media >= 5 || media < 7)
    	{
    		aprovadoReprovado = "de recuperação";
    	}
    	else if(media >= 7 || media <= 10)
    	{
    		aprovadoReprovado = "aprovado";
    	}
    	
    	return aprovadoReprovado;
    }
    
    public static void resultado(String nome, float media, String aprovadoReprovado) {
    	JOptionPane.showMessageDialog(null,"O aluno(a) " + nome + " teve a média " + media + " e está " + aprovadoReprovado);
    }
}
