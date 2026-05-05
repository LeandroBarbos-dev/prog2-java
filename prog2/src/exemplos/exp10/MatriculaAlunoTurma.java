package exemplos.exp10;

/*
Sistema acadêmico versão 9: herança, sobrescrita, ocultação de atributos, sobrecarga, polimorfismo, vinculação dinâmica de métodos, classes e métodos abstratos
*/

public class MatriculaAlunoTurma {
private Aluno aluno;
private float notaFinal = -1;
private float notaExameEspecial = -1;
private int qtdFaltas = -1;

public MatriculaAlunoTurma(Aluno a) {
    this.aluno = a;
}

public void setNotaFinal(float n) { this.notaFinal = n; }
public void setNotaExameEspecial(float n) { this.notaExameEspecial = n; }
public void setQtdFaltas(int n) { this.qtdFaltas = n; }

public String getMatricula() { return this.aluno.getMatricula(); }
public Aluno getAluno() { return this.aluno; }

public String infoSituacao() {
    return ("NF: " + this.notaFinal + "\tNEE: " + this.notaExameEspecial + "\tFaltas:"  + this.qtdFaltas);
}

public void lancamentoNotas(float nf, float nee, int f) {
    this.setNotaFinal(nf);
    this.setNotaExameEspecial(nee);
    this.setQtdFaltas(f);
}
}

