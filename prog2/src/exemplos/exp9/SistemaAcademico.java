package exemplos.exp9;

/*
    Sistema acadêmico versão 8: herança
*/

import java.io.*;
import java.util.Scanner;

public class SistemaAcademico {

	// método principal
	public static void main(String args[]) {

		final int QTDALUNOS = 2;
		final int QTDDISCIPLINAS = 2;
		Scanner entrada = new Scanner(System.in);

		Aluno listaAlunosUFOP[] = new Aluno[QTDALUNOS];

		Pessoa p = new Pessoa();
		p.setNome("UmaPessoaQualquer");
		p.setCpf("999.999.999-99");
		p.setEndereco("Rua C numero 0");
		p.imprimeInfo();

		System.out.println("---");

		// instanciando um objeto utilizando construtor sem parâmetros
		listaAlunosUFOP[0] = new Aluno();
		listaAlunosUFOP[0].setNome("Maria");
		listaAlunosUFOP[0].setMatricula("00.0.0000");
		listaAlunosUFOP[0].setEndereco("Rua B numero 1");
		listaAlunosUFOP[0].imprimeInfo();

		System.out.println("---");

		// instanciando um objeto utilizando construtor com parâmetros
		listaAlunosUFOP[1] = new Aluno("000.000.000-00", "Jose", "11.1.1111", "Rua A numero 0");
		listaAlunosUFOP[1].imprimeInfo();

		System.out.println("---");

		System.out.println("Objetos criados");
		System.out.println("Objeto p: " + p);
		System.out.println("Objeto listaAlunosUFOP[0]: " + listaAlunosUFOP[0]);
		System.out.println("Objeto listaAlunosUFOP[1]: " + listaAlunosUFOP[1]);

	}
}
