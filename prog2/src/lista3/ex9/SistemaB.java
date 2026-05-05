package lista3.ex9;

import java.time.LocalDate;
import java.util.Scanner;

public class SistemaB {

	static Scanner entrada = new Scanner(System.in);

	// método principal
	public static void main(String args[]) {

		// constantes para definir quantidade de alunos e livros - facilitam testes e
		// manutencao do programa
		final int QTDUSUARIOS = 100;
		final int QTDLIVROS = 100;
		final int QTDEMPRESTIMOS = 200;
		final int QTDREServas = 100;


		// vetores para armazenar os usuarios e o acervo de livros da biblioteca
		Aluno usuariosBiblioteca[] = new Aluno[QTDUSUARIOS];
		Livro acervo[] = new Livro[QTDLIVROS];
		Emprestimo listaEmprestimos[] = new Emprestimo[QTDEMPRESTIMOS];
		Reserva listaReservas[] = new Reserva[QTDREServas];

		// variavel usada no menu de opcoes
		char opc = 'a';

		do {
			exibeMenu();
			opc = entrada.next().charAt(0);
			entrada.nextLine(); 
			switch (opc) {
			case '1':
				acervo = cadastrarLivro(acervo);
				break;
			case '2':
				usuariosBiblioteca = cadastrarAluno(usuariosBiblioteca);
				break;
			case '3':
				  listaReservas= cadastrarReserva(listaReservas);
				break;
			case '4':
				listaEmprestimos = cadastrarEmprestimo(listaEmprestimos);
				break;
			case '5':
				System.out.println("ID do emprestimo:");
				int id = entrada.nextInt();
				entrada.nextLine();
				listaEmprestimos = cadastrarDevolucao(listaEmprestimos, usuariosBiblioteca, id);
				break;
			case '6':
				usuariosBiblioteca = fazerPagamento(usuariosBiblioteca);
				
				break;
			case '7':
				relatorioListaUsuarios(usuariosBiblioteca);
				
				break;
			case '8':
				relatorioListaAcervo(acervo);
				break;
			case '9':
				relatorioListaEmprestimos(listaEmprestimos);
				break;
			case 's':
			case 'S':
				System.out.println("Encerrando programa...\n");
				break;
			default:
				System.out.println("Opcao invalida\n");
				break;
			}

		} while (opc != 's' && opc != 'S');

		

		

				
	}

	public static void exibeMenu() {
        System.out.println("SISTEMA DA BIBLIOTECA");
        System.out.println("Escolha uma das opcoes: ");
        System.out.println("[1] Cadastrar livro");
        System.out.println("[2] Cadastrar aluno");
        System.out.println("[3] Reservar livro");
        System.out.println("[4] Emprestar livro");
        System.out.println("[5] Devolver livro");
        System.out.println("[6] Pagar multa (débito)");
        System.out.println("[7] Exibir lista de usuarios cadastrados");
        System.out.println("[8] Exibir lista de livros cadastrados");
        System.out.println("[9] Exibir lista de emprestimos");
        System.out.println("[s] Sair\n\n");
    }   


	public static Aluno[] cadastrarAluno(Aluno[] usuariosBiblioteca) {
		// leitura das informações dos alunosw
		System.out.println("CADASTRAR  ALUNO\n");
		for (int i = 0; i < usuariosBiblioteca.length; i++) {
			// instanciação do objeto da classe aluno para cada elemento do vetor
			if (usuariosBiblioteca[i] == null) {
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
				return usuariosBiblioteca;
			}
			
		}
		return usuariosBiblioteca;
	}
	
	public static Livro[] cadastrarLivro(Livro[] acervo) {
		// leitura das informações dos alunosw
		System.out.println("CADASTRAR LIVRO\n");
		for (int i = 0; i < acervo.length; i++) {
			// instanciação do objeto da classe aluno para cada elemento do vetor
			if (acervo[i] == null) {
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
				
				return acervo;
			}
			
		}
		return acervo;
	}
	
	public static Emprestimo[] cadastrarEmprestimo(Emprestimo[] listaEmprestimos) {
		// leitura das informações dos alunosw
		System.out.println("CADASTRAR EMPRESTIMO\n");
		for (int i = 0; i < listaEmprestimos.length; i++) {
			// instanciação do objeto da classe aluno para cada elemento do vetor
			if (listaEmprestimos[i] == null) {

				listaEmprestimos[i] = new Emprestimo();
				System.out.println("Emprestimo " + (i + 1));
				System.out.print("CPF do aluno: ");
				listaEmprestimos[i].setCpf(entrada.nextLine());
				System.out.print("ISBN do livro: ");
				listaEmprestimos[i].setIsbn(entrada.nextLine());
				System.out.print("Data do emprestimo (AAAA-MM-DD): ");
				listaEmprestimos[i].setDataEmprestimo(LocalDate.parse(entrada.nextLine()));
				System.out.print("Prazo em dias: ");
				listaEmprestimos[i].setPrazo(entrada.nextInt());

				entrada.nextLine();
				
				
				return listaEmprestimos;
			}
			
		}
		return listaEmprestimos;
	}
	
	public static Reserva[] cadastrarReserva(Reserva[] listaEmprestimos) {
		// leitura das informações dos alunosw
		System.out.println("CADASTRAR RESERVA\n");
		for (int i = 0; i < listaEmprestimos.length; i++) {
			// instanciação do objeto da classe aluno para cada elemento do vetor
			if (listaEmprestimos[i] == null) {

				listaEmprestimos[i] = new Reserva();
				System.out.println("Reserva " + (i + 1));
				System.out.print("CPF do aluno: ");
				listaEmprestimos[i].setCpf(entrada.nextLine());
				System.out.print("ISBN do livro: ");
				listaEmprestimos[i].setIsbn(entrada.nextLine());
				System.out.print("Data do emprestimo (AAAA-MM-DD): ");
				listaEmprestimos[i].setDataReserva(LocalDate.parse(entrada.nextLine()));

				entrada.nextLine();
				
				
				return listaEmprestimos;
			}
			
		}
		return listaEmprestimos;
	}


	public static Emprestimo[] cadastrarDevolucao(Emprestimo[] listaEmprestimos, Aluno[] usuariosBiblioteca, int id) {
		// leitura das informações dos alunosw
		
		System.out.println("CADASTRAR EMPRESTIMO\n");
		for (int i = 0; i < listaEmprestimos.length; i++) {
			// instanciação do objeto da classe aluno para cada elemento do vetor
			if(listaEmprestimos[i] != null) {
				if (listaEmprestimos[i].getId() == id) {
					System.out.print("\nData de devolucao do emprestimo " + (i + 1) + " (AAAA-MM-DD): ");
					listaEmprestimos[i].setDataDevolucao(LocalDate.parse(entrada.nextLine()));
					double multa = listaEmprestimos[i].calcularMulta();

					System.out.println("Multa calculada: R$ " + multa);
					if (multa > 0) {
						if (cobrarMulta(usuariosBiblioteca, listaEmprestimos[i].getCpf(), multa)) {
							System.out.println("Multa cobrada!");
						} else {
							System.out.println("Algo deu errado ao cobrar multa!");
						}
					}
					
					
					return listaEmprestimos;
				}
			}
			
			
		}
		return listaEmprestimos;
	}
	
	public static Aluno[] fazerPagamento(Aluno[] alunos) {
		System.out.println("\nFAZER PAGAMENTO");
		System.out.println("CPF do aluno:");
		String cpf = entrada.nextLine();
		System.out.println("Valor:");
		double valor = entrada.nextDouble();
		if(pagarMulta(alunos,cpf,valor)) {
			System.out.println("Saldo recarregado em R$"+valor);
		}else {
			System.out.println("Algo deu errado!");
		}
		return alunos;
	}
	
	// método de classe para exibir lista de usuarios da biblioteca
	public static void relatorioListaUsuarios(Aluno[] alunos) {
		System.out.println("\n\nRelação de alunos cadastrados:");
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null)
				alunos[i].imprimeInfo();
		}
	}

	// método de classe para exibir lista de livros da biblioteca
	public static void relatorioListaAcervo(Livro[] livros) {
		System.out.println("\n\nRelação de livros cadastrados no acervo:");
		for (int i = 0; i < livros.length; i++) {
			if(livros[i] != null)
				livros[i].imprimeInfo();
		}
	}

	// método de classe para exibir lista de emprestimos realizados
	public static void relatorioListaEmprestimos(Emprestimo[] emp) {
		System.out.println("\n\nRelação de emprestimos realizados:");
		for (int i = 0; i < emp.length; i++) {
			if(emp[i] != null)
				emp[i].imprimeInfo();
		}
	}

	public static boolean cobrarMulta(Aluno[] alunos, String cpf, double valor) {
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null) {
				if (alunos[i].getCpf().equals(cpf)) {
					alunos[i].multar(valor);
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}
	
	public static boolean pagarMulta(Aluno[] alunos, String cpf, double valor) {
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null) {
				if (alunos[i].getCpf().equals(cpf)) {
					alunos[i].pagar(valor);
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}
}
