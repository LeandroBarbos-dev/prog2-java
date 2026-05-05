package exemplos.exp10;

/*
Sistema acadêmico versão 9: herança, sobrescrita, ocultação de atributos, sobrecarga, polimorfismo, vinculação dinâmica de métodos, classes e métodos abstratos
*/

public class Turma {

private Disciplina disciplina;
private int ano;
private int semestre;
private int turma;
private int qtdVagas;
private int qtdAlunosMatriculados = 0;
private int totalAulas = 18;
private MatriculaAlunoTurma[] listaMatriculas;

public Turma(Disciplina disc, int ano, int semestre, int numeroTurma, int qtdVagas) {
    this.setDisciplina(disc);
    this.setAno(ano);
    this.setSemestre(semestre);
    this.setTurma(numeroTurma);
    this.setQtdVagas(qtdVagas);
    this.listaMatriculas = new MatriculaAlunoTurma[qtdVagas];
}

public void setDisciplina(Disciplina d) { this.disciplina = d; } 
public void setAno(int a) { this.ano = a; } 
public void setSemestre(int s) { this.semestre = s; } 
public void setTurma(int t) { this.turma = t; } 
public void setQtdVagas(int qtd) { this.qtdVagas = qtd; }

public int getQtdAlunosMatriculados() { return this.qtdAlunosMatriculados; }
public MatriculaAlunoTurma[] getListaMatriculas() { return this.listaMatriculas; }

public void matricularAluno(Aluno aluno) {
    this.listaMatriculas[qtdAlunosMatriculados] = new MatriculaAlunoTurma(aluno);
    this.qtdAlunosMatriculados++;
}

public String getCodDisciplina() { return this.disciplina.getCodigo(); }
public String getNomeDisciplina() { return this.disciplina.getNome(); }
public int getTurma() { return this.turma; }
public int getQtdMatriculados() { return this.qtdAlunosMatriculados; } 
public MatriculaAlunoTurma getMatricula(int i) { return this.listaMatriculas[i]; }


public void lancarNota(Aluno a, float nota, float notaEE, int faltas) {
    // verificar para qual dos alunos matriculados será lançada a nota
    for(int i = 0; i < qtdAlunosMatriculados; i++) {
        if (a == listaMatriculas[i].getAluno()) {
            listaMatriculas[i].lancamentoNotas(nota, notaEE, faltas);
        }
    }
}

public void imprimirDiarioClasse() {
    System.out.println("Turma: " + this.getNomeDisciplina() + "(" + this.getCodDisciplina() + " - " + this.getTurma() + ")");
    if (this.qtdAlunosMatriculados > 0) {
        System.out.println("Alunos matriculados: " + this.qtdAlunosMatriculados + "\tQuantidade de vagas: " + this.qtdVagas);
        for(int i = 0; i < this.qtdAlunosMatriculados; i++) {
            System.out.println("\t" + (i+1) + ". " + this.listaMatriculas[i].getMatricula() + "\t" +  this.listaMatriculas[i].infoSituacao());
        }
    } else
        System.out.println("Não há alunos matriculados");
}

public void imprimeInfo() {
    System.out.println("Turma: " + this.getNomeDisciplina() + "(" + this.getCodDisciplina() + " - " + this.getTurma() + ")");
    if (this.qtdAlunosMatriculados > 0) {
        System.out.println("Alunos matriculados: " + this.qtdAlunosMatriculados + "\tQuantidade de vagas: " + this.qtdVagas);
        for(int i = 0; i < this.qtdAlunosMatriculados; i++) {
            System.out.println("\t" + (i+1) + ". " + this.listaMatriculas[i].getMatricula());
        }
    } else
        System.out.println("Não há alunos matriculados");
}
}

