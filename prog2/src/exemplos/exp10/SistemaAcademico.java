package exemplos.exp10;

/*
Sistema acadC*mico versC#o 9: heranC'a, sobrescrita, ocultaC'C#o de atributos, sobrecarga, polimorfismo, vinculaC'C#o dinC"mica de mC)todos, classes e mC)todos abstratos
*/

import java.io.*;
import java.util.Scanner;

public class SistemaAcademico {

public static void main(String args[]) {

	final int QTDALUNOS = 10;
	final int QTDDISCIPLINAS = 6;
	final int QTDTURMAS = 7;
	final int QTDPROF = 6;
	Scanner entrada = new Scanner(System.in);

	Aluno listaAlunosUFOP[] = new Aluno[QTDALUNOS];
	Disciplina listaDisciplinas[] = new Disciplina[QTDDISCIPLINAS];
	Professor ListaProf[] = new Professor[QTDPROF];
	Turma listaTurmas[] = new Turma[QTDTURMAS];

	System.out.println("----- Cadastro dos alunos -----\n");
	System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");
	listaAlunosUFOP[0] = new Aluno("111.111.111-11", "Chaves", "11.1.1111", "Rua A, barril","Sistemas de Informação", 2);
	listaAlunosUFOP[1]  = new Aluno("222.222.222-22", "Chiquinha", "22.2.2222", "Rua B numero 2","Engenharia da Computação", 3);
	listaAlunosUFOP[2]  = new Aluno("333.333.333-33", "Quico", "33.3.3333", "Rua A numero 3","Sistemas de Informação", 7);
	listaAlunosUFOP[3]  = new Aluno("444.444.444-44", "Padrim", "44.4.4444", "Rua B numero 4","Engenharia Eletrica", 5);
	listaAlunosUFOP[4]  = new Aluno("555.555.555-55", "Leandro", "55.5.5555", "Rua C numero 5","Sistemas de Informação", 6);
	listaAlunosUFOP[5] = new Aluno("666.666.666-66", "Spagnol", "66.6.6666", "Rua D, numero 6","Sistemas de Informação", 3);
	listaAlunosUFOP[6]  = new Aluno("777.777.777-77", "Kaique", "77.7.7777", "Rua C numero 2","Engenharia da Computação", 3);
	listaAlunosUFOP[7]  = new Aluno("888.888.888-88", "Chico", "88.8.8888", "Rua B numero 6","Sistemas de Informação", 7);
	listaAlunosUFOP[8]  = new Aluno("999.999.999-99", "Kaleb", "99.9.9999", "Rua B numero 8","Engenharia Eletrica", 5);
	listaAlunosUFOP[9]  = new Aluno("101.010.101-01", "Isabella", "25.1.8314", "Rua C numero 12","Engenharia da Computação", 3);
	
	

	System.out.println("\n----- Relatorios - lista de alunos cadastrados -----");
	imprimeAlunosCadastrados(listaAlunosUFOP);
	
	System.out.println("----- Cadastro dos alunos -----\n");
	System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");
	ListaProf[0] = new Professor("000.000.123-00", "Marcos", "Rua A numero 1", "21.1.2011","Computação" );
	ListaProf[1]  = new Professor("000.000.123-23", "Janiele", "Rua B numero 2", "21.1.1130","Engenharia" );
	ListaProf[2]  = new Professor("000.123.123-23", "Hugo", "Rua C numero 3", "22.1.3230","Computação" );
	ListaProf[3] = new Professor("111.000.123-00", "Felipo", "Rua C numero 4", "21.1.1234","Computação" );
	ListaProf[4]  = new Professor("222.000.123-23", "Alexandre", "Rua B numero 5", "21.1.2345","Engenharia" );
	ListaProf[5]  = new Professor("333.123.123-23", "Carlos", "Rua A numero 6", "22.1.3456","Computação" );
	

	System.out.println("\n----- Relatorios - lista de alunos cadastrados -----");
	imprimeProfessoresCadastrados(ListaProf);

	System.out.println("\n\n----- Cadastro das disciplinas -----\n");
	System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");
	listaDisciplinas[0] = new Disciplina("CSI101", "Programação de Computadores I");
	listaDisciplinas[1] = new Disciplina("CSI102", "Fundamentos de Sistemas da Informação");
	listaDisciplinas[2] = new Disciplina("CSI011", "Fundamentos de Calculo");
	listaDisciplinas[3] = new Disciplina("CSI103", "Fundamentos de GAAL");
	listaDisciplinas[4] = new Disciplina("CSI104", "Informatica e Sociedade");
	listaDisciplinas[5] = new Disciplina("CSI105", "Metodologia de Pesquisa");

	System.out.println("\n----- Relatorios - lista de disciplinas cadastradas -----");
	imprimeDisciplinas(listaDisciplinas);

	System.out.println("\n\n----- Cadastro das turmas -----\n");
	System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");

	listaTurmas[0] = new Turma(listaDisciplinas[0], 2025, 2, 11, 40,ListaProf[0]);
	listaTurmas[1]  = new Turma(listaDisciplinas[1], 2025, 2, 11, 40,ListaProf[1]);
	listaTurmas[2]  = new Turma(listaDisciplinas[2], 2025, 2, 21, 40,ListaProf[2]);
	listaTurmas[3]  = new Turma(listaDisciplinas[3], 2025, 2, 11, 40,ListaProf[3]);
	listaTurmas[4]  = new Turma(listaDisciplinas[4], 2025, 2, 11, 40,ListaProf[4]);
	listaTurmas[5]  = new Turma(listaDisciplinas[5], 2025, 2, 21, 40,ListaProf[5]);
	listaTurmas[6]  = new Turma(listaDisciplinas[0], 2025, 2, 12, 40,ListaProf[0]);
	
	imprimeTurmas(listaTurmas);

	System.out.println("\n\n----- Matriculando alunos nas turmas -----\n");
	System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");

	listaTurmas[0].matricularAluno(listaAlunosUFOP[0]);
	listaTurmas[1].matricularAluno(listaAlunosUFOP[1]);
	listaTurmas[2].matricularAluno(listaAlunosUFOP[2]);
	listaTurmas[3].matricularAluno(listaAlunosUFOP[3]);
	listaTurmas[4].matricularAluno(listaAlunosUFOP[4]);
	listaTurmas[5].matricularAluno(listaAlunosUFOP[5]);
	listaTurmas[6].matricularAluno(listaAlunosUFOP[6]);
	listaTurmas[0].matricularAluno(listaAlunosUFOP[7]);
	listaTurmas[1].matricularAluno(listaAlunosUFOP[8]);
	listaTurmas[2].matricularAluno(listaAlunosUFOP[9]);
	listaTurmas[3].matricularAluno(listaAlunosUFOP[1]);
	listaTurmas[4].matricularAluno(listaAlunosUFOP[2]);
	listaTurmas[5].matricularAluno(listaAlunosUFOP[3]);
	listaTurmas[6].matricularAluno(listaAlunosUFOP[4]);
	listaTurmas[0].matricularAluno(listaAlunosUFOP[1]);
	listaTurmas[0].matricularAluno(listaAlunosUFOP[2]);


	imprimeTurmas(listaTurmas);

	System.out.println("\n\n----- Imprimindo diario de classe das turmas -----\n");
	imprimeDiarioTurmas(listaTurmas);
	
	System.out.println("\n\n----- Preenchendo diario de classe das turmas -----\n");
	
	preencherDiarioClasse(listaTurmas[0]);
	
	
	System.out.println("\n\n----- Imprimindo diario de classe das turmas -----\n");
	listaTurmas[0].imprimirDiarioClasse();

}

public static void imprimeAlunosCadastrados(Aluno[] lista) {
	System.out.println("\nRelatorio de alunos cadastrados:");
	for(int i = 0; i < lista.length; i++) {
		lista[i].imprimeInfo();
	}
}


public static void imprimeProfessoresCadastrados(Professor[] lista) {
	System.out.println("\nRelatorio de professores cadastrados:");
	for(int i = 0; i < lista.length; i++) {
		lista[i].imprimeInfo();
	}
}

public static void imprimeDisciplinas(Disciplina[] listaDisc) {
	System.out.println("\nRelatorio de disciplinas:");
	for(int i = 0; i < listaDisc.length; i++) {
		listaDisc[i].imprimeInfo();
	}
}

public static void imprimeTurmas(Turma[] lista) {
	System.out.println("\nRelatorio de disciplinas:");
	for(int i = 0; i < lista.length; i++) {
		lista[i].imprimeInfo();
	}
}

public static void imprimeDiarioTurmas(Turma[] lista) {
	System.out.println("\nRelatorio de disciplinas:");
	for(int i = 0; i < lista.length; i++) {
		lista[i].imprimirDiarioClasse();
	}
}

public static void preencherDiarioClasse(Turma t) {
    Scanner entrada = new Scanner(System.in);
    float tmpNota, tmpNotaEE = -1;
    int tmpFaltas;
    for(int i = 0; i < t.getQtdAlunosMatriculados(); i++) {
        System.out.println(i + ". Matricula " + t.getListaMatriculas()[i].getMatricula());
        System.out.print("\tQuantidade de Faltas: ");
        do {
        tmpFaltas = entrada.nextInt();
        }while(tmpFaltas <0);
        System.out.print("\tNota: ");
        do {
        tmpNota = entrada.nextFloat();
        }while(tmpNota < 0);
        if(tmpNota < 60 && tmpFaltas<17 ) {
        	System.out.print("\tNotaEE (digite -1 se aluno não fez EE): ");
        	do {
            tmpNotaEE = entrada.nextFloat();
        	}while(tmpNotaEE <-1);
        }
        
        
        
        t.lancarNota(t.getListaMatriculas()[i].getAluno(), tmpNota, tmpNotaEE, tmpFaltas);
    }
}
}
