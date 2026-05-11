package exemplos.exp10;

/*
Sistema acadêmico versão 9: herança, sobrescrita, ocultação de atributos, sobrecarga, polimorfismo, vinculação dinâmica de métodos, classes e métodos abstratos
*/

public class MatriculaAlunoTurma {
	private Aluno aluno;
	private float notaFinal = -1;
	private float notaExameEspecial = -1;
	private int qtdFaltas = -1;
	private String situacao = "Em curso";

	public MatriculaAlunoTurma(Aluno a) {
		this.aluno = a;
	}

	public String getSituacao() {
		return situacao;
	}

	public float getNotaFinal() {
		return notaFinal;
	}

	public float getNotaExameEspecial() {
		return notaExameEspecial;
	}

	public int getQtdFaltas() {
		return qtdFaltas;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getMatricula() {
		return this.aluno.getMatricula();
	}

	public Aluno getAluno() {
		return this.aluno;
	}

	public String infoSituacao() {

		String situ = ("\n\t Situação: " + this.situacao + "\n\t Nota Final: " + this.notaFinal);
		if (this.situacao.equals("Aprovado no exame especial") || this.situacao.equals("Reprovado"))
			situ += ("\n\t Nota Exame Especial: " + this.notaExameEspecial);
		situ += ("\n\t Faltas: " + this.qtdFaltas);

		return (situ);
	}

	public void lancamentoNotas(float nf, float nee, int f) {
		this.notaFinal = nf;
		this.notaExameEspecial = nee;
		this.qtdFaltas = f;
		if (this.notaFinal >= 60 && this.qtdFaltas < 17)
			this.situacao = "Aprovado";
		else if (this.notaFinal >= 60 && this.qtdFaltas >= 17)
			this.situacao = "Reprovado por falta";
		else if (this.notaFinal < 60 && this.qtdFaltas < 17 && this.notaExameEspecial >= 60)
			this.situacao = "Aprovado no exame especial";
		else
			this.situacao = "Reprovado";
	}

}
