package exemplos.exp8;

import java.util.Scanner;

public class Sistema {
	// método principal 
    public static void main(String args[]) {
        
        final int QTDALUNOS = 12;
        final int QTDDISCIPLINAS = 6;
        final int QTDPROFESSORES = 7;
        final int QTDTURMAS = 7;
        final int QTDMATRICULAS = 21;
        
        Scanner entrada = new Scanner(System.in);
        
        Aluno listaAlunosUFOP[] = new Aluno[QTDALUNOS];
        Professor listaProfs[] = new Professor[QTDPROFESSORES];
        Turma listaTurmas[] = new Turma[QTDTURMAS];
        Matricula listaMatriculas[] = new Matricula[QTDMATRICULAS];
        
        System.out.println("----- Cadastro dos alunos -----\n");
        System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");
        
        // instanciando um objeto utilizando construtor sem parâmetros
        listaAlunosUFOP[0] = new Aluno();
        listaAlunosUFOP[0].setMatricula("00.0.0000");
        listaAlunosUFOP[0].setNome("Maria");
        
        // instanciando um objeto utilizando construtor com parâmetros
        listaAlunosUFOP[1] = new Aluno("11.1.1111", "Jose");
        listaAlunosUFOP[2] = new Aluno("22.2.2222", "Leandro");
        listaAlunosUFOP[3] = new Aluno("33.3.3333", "Padrim");
        listaAlunosUFOP[4] = new Aluno("44.4.4444", "Isabella");
        listaAlunosUFOP[5] = new Aluno("55.5.5555", "Fabio");
        listaAlunosUFOP[6] = new Aluno("66.6.6666", "João");
        listaAlunosUFOP[7] = new Aluno("77.7.7777", "Rafael");
        listaAlunosUFOP[8] = new Aluno("88.8.8888", "Guilherme");
        listaAlunosUFOP[9] = new Aluno("99.9.9999", "Barbara");
        listaAlunosUFOP[10] = new Aluno("10.1.1010", "Juan");
        listaAlunosUFOP[11] = new Aluno("12.1.1212", "Maria Clara");
        
        System.out.println("\n----- Relatorios - lista de alunos cadastrados -----");
        imprimeAlunosCadastrados(listaAlunosUFOP);
        
        
        Disciplina gradeCurricular[] = new Disciplina[QTDDISCIPLINAS];
        
        System.out.println("\n\n----- Cadastro das disciplinas -----\n");
        System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");
        gradeCurricular[0] = new Disciplina("CSI101", "Programação de Computadores I");
        gradeCurricular[1] = new Disciplina("CSI102", "Fundamentos de Calculo");
        gradeCurricular[2] = new Disciplina("CSI103", "Fundamentos de Geometria Analitica e Algebra Linear");
        gradeCurricular[3] = new Disciplina("CSI104", "Fundamentos de Sistemas da Informação");
        gradeCurricular[4] = new Disciplina("CSI105", "Informatica e Sociedade");
        gradeCurricular[5] = new Disciplina("CSI106", "Metodologia de Pesquisa");
        
        System.out.println("\n----- Relatorios - lista de disciplinas cadastradas -----");
        imprimeDisciplinas(gradeCurricular);
        
        
        
        System.out.println("----- Cadastro dos professores -----\n");
        System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");
        listaProfs[0] = new Professor("10.1.1112", "Marcos");
        listaProfs[1] = new Professor("10.1.1113", "Felipo");
        listaProfs[2] = new Professor("10.1.1114", "Hugo");
        listaProfs[3] = new Professor("10.1.1115", "Marcia");
        listaProfs[4] = new Professor("10.1.1116", "Alexandre");
        listaProfs[5] = new Professor("10.1.1117", "Carlos");
        listaProfs[6] = new Professor("10.1.1118", "Thiago");
        
        imprimeProfsCadastrados(listaProfs);
        
        System.out.println("\n\n----- Cadastro das turmas -----\n");
        System.out.println("Criando objetos 'manualmente', diretamente no código-fonte do programa.\n");
        
        listaTurmas[0] = new Turma(gradeCurricular[0],listaProfs[0], 11, 3);
        
        listaTurmas[0].adicionarMatricula(new Matricula(listaAlunosUFOP[0], 9,4));
        
        listaTurmas[0].adicionarMatricula(new Matricula(listaAlunosUFOP[1], 8,2));
        listaTurmas[0].adicionarMatricula(new Matricula(listaAlunosUFOP[2], 5,6));

        listaTurmas[1] = new Turma(gradeCurricular[1],listaProfs[1], 12, 3);
        listaTurmas[1].adicionarMatricula(new Matricula(listaAlunosUFOP[3], 6,4));
        listaTurmas[1].adicionarMatricula(new Matricula(listaAlunosUFOP[4], 7,6));
        listaTurmas[1].adicionarMatricula(new Matricula(listaAlunosUFOP[5], 9,4));

        listaTurmas[2] = new Turma(gradeCurricular[2],listaProfs[2], 13, 3);
        listaTurmas[2].adicionarMatricula(new Matricula(listaAlunosUFOP[6], 3,6));
        listaTurmas[2].adicionarMatricula(new Matricula(listaAlunosUFOP[7], 4,8));
        listaTurmas[2].adicionarMatricula(new Matricula(listaAlunosUFOP[8], 2,2));

        listaTurmas[3] = new Turma(gradeCurricular[3],listaProfs[3], 14, 3);
        listaTurmas[3].adicionarMatricula(new Matricula(listaAlunosUFOP[9], 6,10));
        listaTurmas[3].adicionarMatricula(new Matricula(listaAlunosUFOP[10], 5,4));
        listaTurmas[3].adicionarMatricula(new Matricula(listaAlunosUFOP[11], 10,6));

        listaTurmas[4] = new Turma(gradeCurricular[4],listaProfs[4], 15, 3);
        listaTurmas[4].adicionarMatricula(new Matricula(listaAlunosUFOP[2], 9,4));
        listaTurmas[4].adicionarMatricula(new Matricula(listaAlunosUFOP[3], 8,6));
        listaTurmas[4].adicionarMatricula(new Matricula(listaAlunosUFOP[4], 5,6));

        listaTurmas[5] = new Turma(gradeCurricular[5],listaProfs[5], 16, 3);
        listaTurmas[5].adicionarMatricula(new Matricula(listaAlunosUFOP[4], 6,2));
        listaTurmas[5].adicionarMatricula(new Matricula(listaAlunosUFOP[5], 5,2));
        listaTurmas[5].adicionarMatricula(new Matricula(listaAlunosUFOP[6], 3,4));

        listaTurmas[6] = new Turma(gradeCurricular[0],listaProfs[6], 17, 3);
        listaTurmas[6].adicionarMatricula(new Matricula(listaAlunosUFOP[7], 2,6));
        listaTurmas[6].adicionarMatricula(new Matricula(listaAlunosUFOP[8], 3,8));
        listaTurmas[6].adicionarMatricula(new Matricula(listaAlunosUFOP[9], 8,4));
        
	    	imprimeTurmas(listaTurmas);
        
//        prog1.matricularAluno(listaAlunosUFOP[0]);
//        prog1.matricularAluno(listaAlunosUFOP[1]);
      
    }
    
    public static void imprimeAlunosCadastrados(Aluno[] lista) {
        System.out.println("\nRelação de alunos cadastrados:");
        for(int i = 0; i < lista.length; i++) {
            lista[i].imprimeInfo();
        }
    }
    
    public static void imprimeProfsCadastrados(Professor[] lista) {
        System.out.println("\nRelação de Professores cadastrados:");
        for(int i = 0; i < lista.length; i++) {
            lista[i].imprimeInfo();
        }
    }
    
    public static void imprimeDisciplinas(Disciplina[] listaDisc) {
        System.out.println("\nRelação de disciplinas:");
        for(int i = 0; i < listaDisc.length; i++) {
            listaDisc[i].imprimeInfo();
        }
    }
    
    public static void imprimeTurmas(Turma[] listaTurma) {
        System.out.println("\nMatriculas:");
        for(int i = 0; i < listaTurma.length; i++) {
        	listaTurma[i].imprimeInfo();
        	
        	for (int j = 0; j < listaTurma[i].getQtdAlunos() ; j++) {
        		listaTurma[i].getMatricula(j).imprimeInfo();
			}
        	System.out.println();
        }
    }
}
