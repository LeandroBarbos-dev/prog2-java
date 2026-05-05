package exemplos.exp8;

public class Matricula {
	private Aluno aluno;
	private double nota;
	private int frequencia;
	
	public Matricula(Aluno aluno, double nota, int frequencia) {
		this.aluno = aluno;
		this.nota = nota;
		this.frequencia = frequencia;
	}
	
	public void imprimeInfo() {
        System.out.println("Aluno: " + this.aluno.getNome() + "(" + this.aluno.getMatricula() +")\n\tNota:"+this.nota+ "\n\tfrequnecia:"+this.frequencia);
        
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	
	
	
}
