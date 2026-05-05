package lista3.ex7;

import java.util.Scanner;

public class SistemaB {
	 
    // método principal 
    public static void main(String args[]) {
        
        // constantes para definir quantidade de alunos e livros - facilitam testes e manutencao do programa
        final int QTDUSUARIOS = 2;
        final int QTDLIVROS = 2;
        Scanner entrada = new Scanner(System.in);
        
        // vetores para armazenar os usuarios e o acervo de livros da biblioteca
        Aluno usuariosBiblioteca[] = new Aluno[QTDUSUARIOS];
        Livro acervo[] = new Livro[QTDLIVROS];
        
        // leitura das informações dos alunos
        System.out.println("CADASTRO DOS ALUNOS\n");
        for(int i = 0; i < QTDUSUARIOS; i++) {
            // instanciação do objeto da classe aluno para cada elemento do vetor
            System.out.println("\n----------- Aluno " + i + " -----------");
            usuariosBiblioteca[i] = new Aluno();
            System.out.print("CPF: ");
            usuariosBiblioteca[i].setCpf(entrada.nextLine());
            System.out.print("Matricula: ");
            usuariosBiblioteca[i].setMatricula(entrada.nextLine());
            System.out.print("Nome: ");
            usuariosBiblioteca[i].setNome(entrada.nextLine());
            System.out.print("Email: ");
            usuariosBiblioteca[i].setEmail(entrada.nextLine());
            System.out.print("Telefone: ");
            usuariosBiblioteca[i].setTelefone(entrada.nextLine());
            System.out.print("Saldo: ");
            usuariosBiblioteca[i].setSaldo(entrada.nextDouble());
            entrada.nextLine(); // esvazia o buffer do teclado
        }
        
        // leitura das informações dos livros
        System.out.println("CADASTRO DOS LIVROS\n");
        for(int i = 0; i < QTDLIVROS; i++) {
            // instanciação do objeto da classe livro para cada elemento do vetor
            System.out.println("\n----------- Livro " + i + " -----------");
            acervo[i] = new Livro();
            System.out.print("ISBN: ");
            acervo[i].setIsbn(entrada.nextLine());
            System.out.print("Nome: ");
            acervo[i].setNome(entrada.nextLine());
            System.out.print("Autores: ");
            acervo[i].setAutores(entrada.nextLine());
            System.out.print("Editora: ");
            acervo[i].setEditora(entrada.nextLine());
            System.out.print("Ano de  publicação: ");
            acervo[i].setAnoPublicado(entrada.nextInt());
            System.out.print("Edicao: ");
            acervo[i].setEdicao(entrada.nextInt());
            entrada.nextLine();
            System.out.print("Idioma: ");
            acervo[i].setIdioma(entrada.nextLine());
             // esvazia o buffer do teclado
        }
        
        // exibe usuarios cadastrados
        relatorioListaUsuarios(usuariosBiblioteca);
        // exibe livros cadastrados
        relatorioListaAcervo(acervo);
    }
    
    // método de classe para exibir lista de usuarios da biblioteca
    public static void relatorioListaUsuarios(Aluno[] alunos) {
        System.out.println("\n\nRelação de alunos cadastrados:");
        for(int i = 0; i < alunos.length; i++) {
            alunos[i].imprimeInfo();
        }
    }
    
    // método de classe para exibir lista de livros da biblioteca
    public static void relatorioListaAcervo(Livro[] livros) {
        System.out.println("\n\nRelação de livros cadastrados no acervo:");
        for(int i = 0; i < livros.length; i++) {
            livros[i].imprimeInfo();
        }
    }

}

