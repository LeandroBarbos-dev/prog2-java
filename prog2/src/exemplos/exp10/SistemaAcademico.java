package exemplos.exp10;

/*
Sistema acadC*mico versC#o 9: heranC'a, sobrescrita, ocultaC'C#o de atributos, sobrecarga, polimorfismo, vinculaC'C#o dinC"mica de mC)todos, classes e mC)todos abstratos
*/

import java.io.*;
import java.util.Scanner;

public class SistemaAcademico {

public static void main(String args[]) {

	final int QTDALUNOS = 5;
	final int QTDDISCIPLINAS = 5;
	final int QTDTURMAS = 4;
	Scanner entrada = new Scanner(System.in);

	Aluno listaAlunosUFOP[] = new Aluno[QTDALUNOS];
	Disciplina listaDisciplinas[] = new Disciplina[QTDDISCIPLINAS];
	//Turma listaTurmas[] = new Turma[QTDTURMAS];

	System.out.println("----- Cadastro dos alunos -----\n");
	System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");
	listaAlunosUFOP[0] = new Aluno("111.111.111-11", "Chaves", "11.1.1111", "Rua A, barril");
	listaAlunosUFOP[1]  = new Aluno("222.222.222-22", "Chiquinha", "22.2.2222", "Rua A numero 2");
	listaAlunosUFOP[2]  = new Aluno("333.333.333-33", "Quico", "33.3.3333", "Rua A numero 3");
	listaAlunosUFOP[3]  = new Aluno("444.444.444-44", "Nhonho", "44.4.4444", "Rua B numero 4");
	listaAlunosUFOP[4]  = new Aluno("555.555.555-55", "PC3pis", "55.5.5555", "Rua C numero 5");

	System.out.println("\n----- Relatorios - lista de alunos cadastrados -----");
	imprimeAlunosCadastrados(listaAlunosUFOP);

	System.out.println("\n\n----- Cadastro das disciplinas -----\n");
	System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");
	listaDisciplinas[0] = new Disciplina("CSI101", "Programação de Computadores I");
	listaDisciplinas[1] = new Disciplina("CSI102", "Programação de Computadores II");
	listaDisciplinas[2] = new Disciplina("CSI011", "Matemática Discreta");
	listaDisciplinas[3] = new Disciplina("CSI103", "AEDS I");
	listaDisciplinas[4] = new Disciplina("CSI104", "AEDS II");

	System.out.println("\n----- Relatorios - lista de disciplinas cadastradas -----");
	imprimeDisciplinas(listaDisciplinas);

	System.out.println("\n\n----- Cadastro das turmas -----\n");
	System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");

	Turma prog1T11 = new Turma(listaDisciplinas[0], 2025, 2, 11, 40);
	Turma prog2T21 = new Turma(listaDisciplinas[1], 2025, 2, 21, 40);
	Turma prog2T22 = new Turma(listaDisciplinas[1], 2025, 2, 22, 40);
	prog1T11.imprimeInfo();
	prog2T21.imprimeInfo();
	prog2T22.imprimeInfo();

	System.out.println("\n\n----- Matriculando alunos nas turmas -----\n");
	System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");

	prog1T11.matricularAluno(listaAlunosUFOP[0]);
	prog1T11.matricularAluno(listaAlunosUFOP[0]);
	prog2T21.matricularAluno(listaAlunosUFOP[1]);
	prog2T21.matricularAluno(listaAlunosUFOP[2]);
	prog2T22.matricularAluno(listaAlunosUFOP[3]);
	prog2T22.matricularAluno(listaAlunosUFOP[4]);
	prog2T21.matricularAluno(listaAlunosUFOP[4]);


	prog1T11.imprimeInfo();
	prog2T21.imprimeInfo();
	prog2T22.imprimeInfo();

	System.out.println("\n\n----- Imprimindo diario de classe das turmas -----\n");
	prog1T11.imprimirDiarioClasse();
	prog2T21.imprimirDiarioClasse();
	prog2T22.imprimirDiarioClasse();
	
	System.out.println("\n\n----- Preenchendo diario de classe das turmas -----\n");
	
	preencherDiarioClasse(prog1T11);
	
	
	System.out.println("\n\n----- Imprimindo diario de classe das turmas -----\n");
	prog1T11.imprimirDiarioClasse();

}

public static void imprimeAlunosCadastrados(Aluno[] lista) {
	System.out.println("\nRelaC'C#o de alunos cadastrados:");
	for(int i = 0; i < lista.length; i++) {
		lista[i].imprimeInfo();
	}
}

public static void imprimeDisciplinas(Disciplina[] listaDisc) {
	System.out.println("\nRelaC'C#o de disciplinas:");
	for(int i = 0; i < listaDisc.length; i++) {
		listaDisc[i].imprimeInfo();
	}
}

public static void preencherDiarioClasse(Turma t) {
    Scanner entrada = new Scanner(System.in);
    float tmpNota, tmpNotaEE;
    int tmpFaltas;
    for(int i = 0; i < t.getQtdAlunosMatriculados(); i++) {
        System.out.println(i + ". Matricula " + t.getListaMatriculas()[i].getMatricula());
        System.out.print("\tNota: ");
        tmpNota = entrada.nextFloat();
        System.out.print("\tNotaEE (digite -1 se aluno não fez EE): ");
        tmpNotaEE = entrada.nextFloat();
        System.out.print("\tQuantidade de Faltas: ");
        tmpFaltas = entrada.nextInt();
        
        t.lancarNota(t.getListaMatriculas()[i].getAluno(), tmpNota, tmpNotaEE, tmpFaltas);
    }
}
}
