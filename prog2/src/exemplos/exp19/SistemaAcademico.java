package exemplos.exp19;

import java.io.*;
import java.util.Scanner;

public class SistemaAcademico {
	static int qtdCadastrados = 0;

	public static void main(String args[]) {

		final int QTDALUNOS = 2;

		Scanner entrada = new Scanner(System.in);

		Aluno turma[] = new Aluno[QTDALUNOS];

		char opc = 's';

		do {
			exibeMenu();
			opc = entrada.next().charAt(0);

			switch (opc) {
			case 'c':
				System.out.println("-----Cadastrar aluno-----");
				try {
					cadastraAluno(turma);
				} catch (CpfInvalidoException e) {
					System.out.println("Erro ao cadastrar aluno: CPF invalido");
					e.printStackTrace(System.out);
				}catch (ArrayIndexOutOfBoundsException e) {
				    System.out.println(e.getMessage());
				}
				break;

			case 'p':
			case 'P':
				try {
			        pesquisarAluno(turma);
			    } catch (AlunoNaoEncontradoException e) {
			        System.out.println(e.getMessage());
			    }
			    break;

			case 'r':
			case 'R':
				try {
			        relatorioTurma(turma);
			    } catch (TurmaVaziaException e) {
			        System.out.println(e.getMessage());
			    }
				break;

			case 's':
			case 'S':
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opcao invallida");
				break;
			}
		} while (opc != 's' && opc != 'S');

	}

	public static void exibeMenu() {
		System.out.println("Escolha a opcao desejada:");
		System.out.println("[C]adastrar aluno");
		System.out.println("[P]pesquisar aluno");
		System.out.println("[R]elatorio da turma");
		System.out.println("[S]Sair");
	}

	public static void cadastraAluno(Aluno turma[]) throws CpfInvalidoException {

		Scanner e = new Scanner(System.in);

		
		if (qtdCadastrados >= turma.length) 
		    throw new ArrayIndexOutOfBoundsException("Turma esta cheia");
		
		System.out.print("CPF: ");
		String cpf = e.nextLine();

		if (!Utilidades.isCPF(cpf))
			throw new CpfInvalidoException("CPF inválido");

		System.out.print("Nome: ");
		String nome = e.nextLine();

		System.out.print("Endereco: ");
		String end = e.nextLine();

		System.out.print("Matricula: ");
		String matricula = e.nextLine();

		turma[qtdCadastrados] = new Aluno(cpf, nome, end, matricula);

		qtdCadastrados++;

		System.out.println("Aluno cadastrado com sucesso!");
	}
	
	public static void pesquisarAluno(Aluno turma[])
	        throws AlunoNaoEncontradoException {

	    Scanner e = new Scanner(System.in);

	    System.out.print("Matricula: ");
	    String matricula = e.nextLine();

	    for (int i = 0; i < qtdCadastrados; i++) {

	        if (turma[i].getMatricula().equals(matricula)) {
	            turma[i].imprimeInfo();
	            return;
	        }
	    }

	    throw new AlunoNaoEncontradoException(
	            "Aluno não encontrado");
	}
	
	public static void relatorioTurma(Aluno turma[])
	        throws TurmaVaziaException {

	    if (qtdCadastrados == 0) {
	        throw new TurmaVaziaException(
	                "Nenhum aluno cadastrado");
	    }

	    for (int i = 0; i < qtdCadastrados; i++) {
	        turma[i].imprimeInfo();
	    }
	}

}
