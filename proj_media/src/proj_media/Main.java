package proj_media;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o nome do aluno: ");
        String aluno = scanner.nextLine();
        
        System.out.println("Agora informe as 4 notas de " + aluno + " dos 4 bimestres");
        
        Float nota1 = scanner.nextFloat();
        if(nota1 < 0 || nota1 > 10){
            System.out.println("Nota fora dos padroes.");
            while(nota1 < 0 || nota1 > 10){
                Float nota1Ajuste = scanner.nextFloat();
                System.out.println("Primeira nota digitada está fora dos padroes.");
                nota1 = nota1Ajuste;
            }
        }
        
        System.out.println("Certo, agora vamos para a segunda nota.");
        
        Float nota2 = scanner.nextFloat();
        
        if(nota2 < 0 || nota2 > 10){
            System.out.println("Nota 2 fora dos padroes.");
            while(nota2 < 0 || nota2 > 10){
                System.out.println("Segunda nota digitada está fora dos padroes.");
                Float nota2Ajuste = scanner.nextFloat();
                nota2 = nota2Ajuste;
            }
        }
        Float nota3 = scanner.nextFloat();
        Float nota4 = scanner.nextFloat();
        
        Float media;
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if(media >= 6){
            System.out.println(aluno + " esta Aprovado");
        }else{
            System.out.println(aluno + " esta Reprovado");
        }
        
        scanner.close();
        
    }
    
}
