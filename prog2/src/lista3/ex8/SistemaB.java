package lista3.ex8;

import java.time.LocalDate;
import java.util.Scanner;

public class SistemaB {
	 
    // método principal 
    public static void main(String args[]) {
        
        // constantes para definir quantidade de alunos e livros - facilitam testes e manutencao do programa
        final int QTDUSUARIOS = 2;
        final int QTDLIVROS = 2;
        final int QTDEMPRESTIMOS = 2;
        
        Scanner entrada = new Scanner(System.in);
        
        // vetores para armazenar os usuarios e o acervo de livros da biblioteca
        Aluno usuariosBiblioteca[] = new Aluno[QTDUSUARIOS];
        Livro acervo[] = new Livro[QTDLIVROS];
        Emprestimo listaEmprestimos[] = new Emprestimo[QTDEMPRESTIMOS];
        
        
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
            System.out.print("Edicao: ");
            acervo[i].setEdicao(entrada.nextInt());
            entrada.nextLine();
            System.out.print("Idioma: ");
            acervo[i].setIdioma(entrada.nextLine());
            entrada.nextLine(); // esvazia o buffer do teclado
        }
        
        System.out.println("CADASTRO DOS EMPRESTIMOS\n");
        for(int i = 0; i < QTDEMPRESTIMOS; i++) {

            listaEmprestimos[i] = new Emprestimo();
            System.out.println("Emprestimo " + (i+1));
            System.out.print("CPF do aluno: ");
            listaEmprestimos[i].setCpf(entrada.nextLine());
            System.out.print("ISBN do livro: ");
            listaEmprestimos[i].setIsbn(entrada.nextLine());
            System.out.print("Data do emprestimo (AAAA-MM-DD): ");
            listaEmprestimos[i].setDataEmprestimo(LocalDate.parse(entrada.nextLine()));
            System.out.print("Prazo em dias: ");
            listaEmprestimos[i].setPrazo(entrada.nextInt());

            entrada.nextLine();
        }
        
        System.out.println("CADASTRO DAS DEVOLUÇÕES\n");
        for(int i = 0; i < QTDEMPRESTIMOS; i++) {
            System.out.print("\nData de devolucao do emprestimo "+ (i+1) +" (AAAA-MM-DD): ");
            listaEmprestimos[i].setDataDevolucao(LocalDate.parse(entrada.nextLine()));
            double multa = listaEmprestimos[i].calcularMulta();
            
            System.out.println("Multa calculada: R$ " + multa);
            if(multa>0) {
            	 if(cobrarMulta(usuariosBiblioteca, listaEmprestimos[i].getCpf(), multa)) {
                 	System.out.println("Multa cobrada!");
                 }else {
                	 System.out.println("Algo deu errado ao cobrar multa!");
                 }
            }
           
            
        }
        
        // exibe usuarios cadastrados
        relatorioListaUsuarios(usuariosBiblioteca);
        // exibe livros cadastrados
        relatorioListaAcervo(acervo);
        // exibe emprestimos realizados
        relatorioListaEmprestimos(listaEmprestimos);
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
    
    // método de classe para exibir lista de emprestimos realizados
    public static void relatorioListaEmprestimos(Emprestimo[] emp) {
        System.out.println("\n\nRelação de emprestimos realizados:");
        for(int i = 0; i < emp.length; i++) {
            emp[i].imprimeInfo();
        }
    }
    
    public static boolean cobrarMulta(Aluno[] alunos, String cpf, double valor) {
    	for (int i = 0; i < alunos.length; i++) {
    		if(alunos[i].getCpf().equals(cpf)) {
    			alunos[i].multar(valor);
    			return true;
    		}
		}
    	return false;
    }
}

