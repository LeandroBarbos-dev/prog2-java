package lista4.ex4;

/* Sistema Biblioteca versão 2: definição da classe Aluno como subclasse de Usuario */
public class Aluno extends Usuario {

	// atributos de objeto
	private String matricula;
	private String curso;

	public Aluno(String cpf, String nome, String mat, String curso) {
		super(cpf, nome);
		System.out.println(
				"Instanciando um objeto da classe Aluno usando construtor com parâmetros para inicialização dos atributos.\n");
		this.matricula = mat;
		this.curso = curso;
	}

	public void setMatricula(String str) {
		this.matricula = str;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return this.matricula;
	}

	@Override
	public void imprimeInfo() {
		System.out.println(super.getId() + " - " + super.getNome() + " (" + super.getCpf() + ") (" + this.matricula
				+ " - " + this.curso + "): saldo = " + super.getSaldo());
	}
}
