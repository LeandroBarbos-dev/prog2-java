package lista4.ex4;

/* Sistema Biblioteca versão 2: teste das classes Usuario e Aluno */

import java.io.*;
import java.util.Scanner;

public class SistemaBiblioteca {
    
    // método principal 
    public static void main(String args[]) {
        
        final int QTDUSUARIOS = 2;
        Scanner entrada = new Scanner(System.in);
        
        // cria vetor para armazenar usuarios
        Usuario usuariosBiblioteca[] = new Usuario[QTDUSUARIOS];
        
        // instanciando usuario 1
        String tmpCpf = "000.000.000-00";
        String tmpNome = "Maria";
        usuariosBiblioteca[0] = new Usuario(tmpCpf, tmpNome);
        // instanciando usuario 2
        usuariosBiblioteca[1] = new Usuario("111.111.111-11", "Jose");
        
        // imprime usuarios cadastrados
        relatorioListaUsuarios(usuariosBiblioteca);
        
        
        // cria vetor para armazenar alunos
        Aluno alunosBiblioteca[] = new Aluno[QTDUSUARIOS];
        
        // instanciando aluno 1
        alunosBiblioteca[0] = new Aluno("222.222.222-22", "Joao", "22.2.2222", "Sistemas de Informacao");
        // instanciando aluno 2
        alunosBiblioteca[1] = new Aluno("333.333.333-33", "Juliana", "33.3.3333", "Engenharia da Computacao");
        
        relatorioListaUsuarios(alunosBiblioteca);
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

