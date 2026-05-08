package exemplos.exp10;

/*
Sistema acadêmico versão 9: herança, sobrescrita, ocultação de atributos, sobrecarga, polimorfismo, vinculação dinâmica de métodos, classes e métodos abstratos
*/
public class Aluno extends Pessoa {

	private String matricula = "";
	private String curso;
	private int periodo;
	private static int qtdAlunosCadastrados = 0;

	public Aluno(String cpf, String nome, String mat, String end, String curso, int periodo) {
		super(cpf, nome, end);
		this.setMatricula(mat);
		this.setCurso(curso);
		this.setPeriodo(periodo);
		Aluno.qtdAlunosCadastrados++;
	}

	public void setMatricula(String mat) {
		this.matricula = mat;
	}

	public String getMatricula() {
		return this.matricula;
	}

	@Override
	public void imprimeInfo() {
		System.out.println(super.getID() + ". " + this.getMatricula() + ": " + super.getNome());
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public static int getQtdAlunosCadastrados() {
		return qtdAlunosCadastrados;
	}

	public static void setQtdAlunosCadastrados(int qtdAlunosCadastrados) {
		Aluno.qtdAlunosCadastrados = qtdAlunosCadastrados;
	}

}
