package lista4.ex7;

import java.time.LocalDate;
import java.util.Scanner;

public class SistemaBiblioteca {
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// constantes para definir quantidade de alunos e livros - facilitam testes e
		// manutencao do programa
		final int QTDUSUARIOS = 100;
		final int QTDLIVROS = 100;
		final int QTDEMPRESTIMOS = 200;
		final int QTDREServas = 100;
			
		// vetores para armazenar os usuarios e o acervo de livros da biblioteca
		Usuario usuariosBiblioteca[] = new Usuario[QTDUSUARIOS];
		ItemAcervo acervo[] = new ItemAcervo[QTDLIVROS];
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
				acervo = cadastrarItem(acervo);
				break;
			case '2':
				usuariosBiblioteca = cadastrarAluno(usuariosBiblioteca);
				break;
			case '3':
				listaReservas = cadastrarReserva(listaReservas);
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
		System.out.println("[1] Cadastrar um item no acervo");
		System.out.println("[2] Cadastrar usuario");
		System.out.println("[3] Reservar item");
		System.out.println("[4] Emprestar item");
		System.out.println("[5] Devolver item");
		System.out.println("[6] Pagar multa (débito)");
		System.out.println("[7] Exibir lista de usuarios cadastrados");
		System.out.println("[8] Exibir lista de livros cadastrados");
		System.out.println("[9] Exibir lista de emprestimos");
		System.out.println("[s] Sair\n\n");
	} 

	public static Usuario[] cadastrarAluno(Usuario[] usuariosBiblioteca) {
		String cpf, nome, cod, cursoDep;
		int tipo = 0;
		// leitura das informações dos alunosw
		System.out.println("CADASTRAR  ALUNO\n");
		int i = Usuario.getCont();

		// instanciação do objeto da classe aluno para cada elemento do vetor
		if (usuariosBiblioteca[i] == null) {
			System.out.println("\n----------- Usuario " + i + " -----------");
			System.out.println("Tipo do usuario: \n[1] Aluno \n[2] Professor");
			do {
				tipo = entrada.nextInt();
				entrada.nextLine();
			} while (tipo > 2 || tipo < 1);
			System.out.print("CPF: ");
			cpf = entrada.nextLine();
			System.out.print("Nome: ");
			nome = entrada.nextLine();
			if (tipo == 1) {
				System.out.print("Matricula:");
				cod = entrada.nextLine();
				System.out.println("Curso: ");
				cursoDep = entrada.nextLine();

				usuariosBiblioteca[i] = new Aluno(cpf, nome, cod, cursoDep);
			} else {
				System.out.print("SIAPE:");
				cod = entrada.nextLine();
				System.out.println("Departamento: ");
				cursoDep = entrada.nextLine();

				usuariosBiblioteca[i] = new Professor(cpf, nome, cod, cursoDep);
			}

			return usuariosBiblioteca;
		}

		return usuariosBiblioteca;
	}

	public static ItemAcervo[] cadastrarItem(ItemAcervo[] acervo) {
		// leitura das informações dos alunosw
		System.out.println("CADASTRAR LIVRO\n");
		int i = Usuario.getCont();

		// instanciação do objeto da classe aluno para cada elemento do vetor
		if (acervo[i] == null) {
			System.out.println("\n----------- Itens " + i + " -----------");
			String isbn, nome, autores, idioma, curso;
			int edicao, ano, tipo = 0;
			System.out.println("Tipo do Item: \n[1] Livro \n[2] Monografia");
			do {
				tipo = entrada.nextInt();
				entrada.nextLine();
			} while (tipo > 2 || tipo < 1);

			System.out.print("ISBN: ");
			isbn = entrada.nextLine();
			System.out.print("Nome: ");
			nome = entrada.nextLine();
			System.out.print("Autores: ");
			autores = entrada.nextLine();
			System.out.print("Idioma: ");
			idioma = entrada.nextLine();
			System.out.print("Ano: ");
			ano = entrada.nextInt();
			entrada.nextLine();
			
			if (tipo == 1) {
				System.out.print("Edicao: ");
				edicao = entrada.nextInt();
				entrada.nextLine();
				acervo[i] = new Livro(isbn, nome, autores, idioma, edicao, ano);
			} else {
				System.out.print("Curso: ");
				curso = entrada.nextLine();
				acervo[i] = new Monografia(isbn, nome, autores, idioma, curso, ano);
			}

			return acervo;
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

	public static Emprestimo[] cadastrarDevolucao(Emprestimo[] listaEmprestimos, Usuario[] usuariosBiblioteca, int id) {
		// leitura das informações dos alunosw

		System.out.println("CADASTRAR EMPRESTIMO\n");
		for (int i = 0; i < listaEmprestimos.length; i++) {
			// instanciação do objeto da classe aluno para cada elemento do vetor
			if (listaEmprestimos[i] != null) {
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

	public static Usuario[] fazerPagamento(Usuario[] alunos) {
		System.out.println("\nFAZER PAGAMENTO");
		System.out.println("CPF do aluno:");
		String cpf = entrada.nextLine();
		System.out.println("Valor:");
		double valor = entrada.nextDouble();
		if (pagarMulta(alunos, cpf, valor)) {
			System.out.println("Saldo recarregado em R$" + valor);
		} else {
			System.out.println("Algo deu errado!");
		}
		return alunos;
	}

	// método de classe para exibir lista de usuarios da biblioteca
	public static void relatorioListaUsuarios(Usuario[] alunos) {
		System.out.println("\n\nRelação de alunos cadastrados:");
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null)
				alunos[i].imprimeInfo();
		}
	}

	// método de classe para exibir lista de livros da biblioteca
	public static void relatorioListaAcervo(ItemAcervo[] livros) {
		System.out.println("\n\nRelação de livros cadastrados no acervo:");
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null)
				livros[i].imprimeInfo();
		}
	}

	// método de classe para exibir lista de emprestimos realizados
	public static void relatorioListaEmprestimos(Emprestimo[] emp) {
		System.out.println("\n\nRelação de emprestimos realizados:");
		for (int i = 0; i < emp.length; i++) {
			if (emp[i] != null)
				emp[i].imprimeInfo();
		}
	}

	public static boolean cobrarMulta(Usuario[] alunos, String cpf, double valor) {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getCpf().equals(cpf)) {
					alunos[i].multar(valor);
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}

	public static boolean pagarMulta(Usuario[] alunos, String cpf, double valor) {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getCpf().equals(cpf)) {
					alunos[i].pagar(valor);
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}
}