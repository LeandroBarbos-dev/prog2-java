package lista3.ex6;

import java.util.Scanner;

public class SistemaB {
	  // método principal 
    public static void main(String args[]) {
        
        final int QTDUSUARIOS = 2;
        final int QTDLIVROS = 2;
        Scanner entrada = new Scanner(System.in);
        
        Aluno usuariosBiblioteca[] = new Aluno[QTDUSUARIOS];
        Livro acervo[] = new Livro[QTDLIVROS];
        
        // leitura das informações dos alunos
        for(int i = 0; i < QTDUSUARIOS; i++) {
            // instanciação do objeto da classe aluno para cada elemento do vetor
            usuariosBiblioteca[i] = new Aluno();
            System.out.println("----------- Aluno " + i + " -----------");
            System.out.print("CPF: ");
            usuariosBiblioteca[i].setCpf(entrada.nextLine());
            System.out.print("Matricula:");
            usuariosBiblioteca[i].setMatricula(entrada.nextLine());
            System.out.print("Nome: ");
            usuariosBiblioteca[i].setNome(entrada.nextLine());
            System.out.println("Saldo: ");
            usuariosBiblioteca[i].setSaldo(entrada.nextDouble());
            entrada.nextLine(); 
        }
        for(int i = 0; i < QTDLIVROS; i++) {
            acervo[i] = new Livro();
            System.out.println("----------- Livro " + i + " -----------");
            System.out.print("ISBN: ");
            acervo[i].setIsbn(entrada.nextLine());
            System.out.print("Nome:");
            acervo[i].setNome(entrada.nextLine());
            System.out.print("Autor: ");
            acervo[i].setAutores(entrada.nextLine());
            System.out.print("Idioma: ");
            acervo[i].setIdioma(entrada.nextLine());
            System.out.println("Edição: ");
            acervo[i].setEdicao(entrada.nextInt());
            entrada.nextLine(); 
            
        }
        
        relatorioListaUsuarios(usuariosBiblioteca);
        
        relatorioListaAcervo(acervo);
    }
    
    public static void relatorioListaUsuarios(Aluno[] alunos) {
        System.out.println("\nRelação de alunos cadastrados:");
        for(int i = 0; i < alunos.length; i++) {
            alunos[i].imprimeInfo();
        }
    }
    
    public static void relatorioListaAcervo(Livro[] acervo) {
        System.out.println("\nRelação de alunos cadastrados:");
        for(int i = 0; i < acervo.length; i++) {
        	acervo[i].imprimeInfo();
        }
    }
    
}

