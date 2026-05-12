package lista4.ex6;

/* Sistema Biblioteca versão 4: definição das classes Livro e Monografia */

import java.io.*;
import java.util.Scanner;

public class SistemaBiblioteca {
    
    // método principal 
    public static void main(String args[]) {
        
        final int QTDUSUARIOS = 2;
        final int QTDLIVROS = 2;
        final int QTDMONOGRAFIAS = 2;
        
        Scanner entrada = new Scanner(System.in);
        
        // ----------------------- TESTE DE CRIAÇÃO DE OBJETOS DA CLASSE USUARIO ------------------------
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
        
        // ----------------------- TESTE DE CRIAÇÃO DE OBJETOS DA CLASSE ALUNO ------------------------
        // cria vetor para armazenar alunos
        Aluno alunosBiblioteca[] = new Aluno[QTDUSUARIOS];
        
        // instanciando aluno 1
        alunosBiblioteca[0] = new Aluno("222.222.222-22", "Joao", "22.2.2222", "Sistemas de Informacao");
        // instanciando aluno 2
        alunosBiblioteca[1] = new Aluno("333.333.333-33", "Juliana", "33.3.3333", "Engenharia da Computacao");
        
        relatorioListaUsuarios(alunosBiblioteca);
        
        // ----------------------- TESTE DE CRIAÇÃO DE OBJETOS DA CLASSE PROFESSOR ------------------------
        // cria vetor para armazenar professores
        Professor professoresBiblioteca[] = new Professor[QTDUSUARIOS];
        
        // instanciando aluno 1
        professoresBiblioteca[0] = new Professor("444.444.444-44", "Luisa", "1.111.111", "Dept de Computacao");
        // instanciando aluno 2
        professoresBiblioteca[1] = new Professor("555.555.555-55", "Alexandre", "2.222.222", "Dept de Engenharia de Producao");
        
        relatorioListaUsuarios(alunosBiblioteca);
        
        // ----------------------- TESTE DE CRIAÇÃO DE OBJETOS DA CLASSE LIVRO ------------------------
        Livro acervoLivros[] = new Livro[QTDLIVROS];
        // leitura das informações dos livros
        System.out.println("CADASTRO DOS LIVROS\n");
        for(int i = 0; i < QTDLIVROS; i++) {
            // instanciação do objeto da classe livro para cada elemento do vetor
            System.out.println("\n----------- Livro " + i + " -----------");
            System.out.print("ISBN: ");
            String isbn = entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Autores: ");
            String autores = entrada.nextLine();
            System.out.print("Idioma: ");
            String idioma = entrada.nextLine();
            System.out.print("Edicao: ");
            int edicao = entrada.nextInt();
            System.out.print("Ano de Publicacao: ");
            int ano = entrada.nextInt();
            acervoLivros[i] = new Livro(isbn, nome, autores, idioma, edicao, ano);
            entrada.nextLine(); // esvazia o buffer do teclado
        }
        
        // exibe livros cadastrados
        relatorioListaAcervoLivros(acervoLivros);
        
        // ----------------------- TESTE DE CRIAÇÃO DE OBJETOS DA CLASSE LIVRO ------------------------
        Monografia acervoMonografias[] = new Monografia[QTDMONOGRAFIAS];
        // leitura das informações dos livros
        System.out.println("CADASTRO DAS MONOGRAFIAS\n");
        for(int i = 0; i < QTDLIVROS; i++) {
            // instanciação do objeto da classe livro para cada elemento do vetor
            System.out.println("\n----------- Monografia " + i + " -----------");
            System.out.print("ISBN: ");
            String isbn = entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Autores: ");
            String autores = entrada.nextLine();
            System.out.print("Idioma: ");
            String idioma = entrada.nextLine();
            System.out.print("Curso: ");
            String curso = entrada.nextLine();
            System.out.print("Ano de Publicacao: ");
            int ano = entrada.nextInt();
            acervoMonografias[i] = new Monografia(isbn, nome, autores, idioma, curso, ano);
            entrada.nextLine(); // esvazia o buffer do teclado
        }
        
        // exibe livros cadastrados
        relatorioListaAcervoMonografias(acervoMonografias);


    }
    
    public static void relatorioListaUsuarios(Usuario[] usuarios) {
        System.out.println("\nRelação de usuarios cadastrados:");
        for(int i = 0; i < usuarios.length; i++) {
            usuarios[i].imprimeInfo();
        }
    }
    
    public static void relatorioListaUsuarios(Aluno[] alunos) {
        System.out.println("\nRelação de alunos cadastrados:");
        for(int i = 0; i < alunos.length; i++) {
            alunos[i].imprimeInfo();
        }
    }
    
    public static void relatorioListaUsuarios(Professor[] professores) {
        System.out.println("\nRelação de professores cadastrados:");
        for(int i = 0; i < professores.length; i++) {
            professores[i].imprimeInfo();
        }
    }
    
    // método de classe para exibir lista de livros da biblioteca
    public static void relatorioListaAcervoLivros(Livro[] livros) {
        System.out.println("\n\nRelação de livros cadastrados no acervo:");
        for(int i = 0; i < livros.length; i++) {
            livros[i].imprimeInfo();
        }
    }
    
    // método de classe para exibir lista de livros da biblioteca
    public static void relatorioListaAcervoMonografias(Monografia[] monografias) {
        System.out.println("\n\nRelação de livros cadastrados no acervo:");
        for(int i = 0; i < monografias.length; i++) {
            monografias[i].imprimeInfo();
        }
    }

    
}
