package lista3.ex5;

import java.util.Scanner;

public class SistemaB {
	  // método principal 
    public static void main(String args[]) {
        
        final int QTDUSUARIOS = 2;
        Scanner entrada = new Scanner(System.in);
        
        Aluno usuariosBiblioteca[] = new Aluno[QTDUSUARIOS];
        
        for(int i = 0; i < QTDUSUARIOS; i++) {
            System.out.println("\n--- Cadastro do Aluno " + (i + 1) + " ---");
            usuariosBiblioteca[i] = new Aluno();
            System.out.print("Digite o Nome: ");
            String nome = entrada.nextLine();
            usuariosBiblioteca[i].setNome(nome); 

            System.out.print("Digite a Matrícula: ");
            usuariosBiblioteca[i].setMatricula(entrada.nextLine());

            System.out.print("Digite o CPF: ");
            usuariosBiblioteca[i].setCpf(entrada.nextLine());
            
            System.out.print("Digite o Saldo inicial: ");
            usuariosBiblioteca[i].setSaldo(entrada.nextDouble());
            
            entrada.nextLine();
        }
        
        relatorioListaUsuarios(usuariosBiblioteca);
    }
    
    public static void relatorioListaUsuarios(Aluno[] alunos) {
        System.out.println("\nRelação de alunos cadastrados:");
        for(int i = 0; i < alunos.length; i++) {
            alunos[i].imprimeInfo();
        }
    }
    

}
