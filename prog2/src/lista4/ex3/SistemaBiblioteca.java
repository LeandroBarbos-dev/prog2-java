package lista4.ex3;

/* Sistema Biblioteca versão 1: teste das classes Usuario e Aluno */

import java.io.*;
import java.util.Scanner;


public class SistemaBiblioteca {
    
    // método principal 
    public static void main(String args[]) {
        
        final int QTDUSUARIOS = 2;
        Scanner entrada = new Scanner(System.in);
        Usuario usuariosBiblioteca[] = new Usuario[QTDUSUARIOS];
       
        for(int i = 0; i < QTDUSUARIOS; i++) {
        	String cpf, nome, matricula, curso;
            
            System.out.println("----------- Aluno " + i + " -----------");
            System.out.print("CPF: ");
            cpf = entrada.nextLine();
            System.out.print("Nome: ");
            nome = entrada.nextLine();
            System.out.print("Matricula:");
            matricula = entrada.nextLine();
            System.out.println("Curso: ");
            curso = entrada.nextLine();
            usuariosBiblioteca[i] = new Aluno(cpf, nome, matricula, curso);
            
        }
        
        relatorioListaUsuarios(usuariosBiblioteca);
    }
    
    public static void relatorioListaUsuarios(Usuario[] usuarios) {
        System.out.println("\nRelação de usuarios cadastrados:");
        for(int i = 0; i < usuarios.length; i++) {
            usuarios[i].imprimeInfo();
        }
    }
    
    public static void relatorioListaUsuarios(Aluno[] alunos) {
        System.out.println("\nRelação de usuarios cadastrados:");
        for(int i = 0; i < alunos.length; i++) {
            alunos[i].imprimeInfo();
        }
    }
    
}
