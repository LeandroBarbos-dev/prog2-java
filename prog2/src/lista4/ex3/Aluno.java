package lista4.ex3;

/* Sistema Biblioteca versão 1: definição da classe Aluno */
public class Aluno extends Usuario {

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

	public void setCurso(String str) {
		this.curso = str;
	}

	// perceba que nao foi criado um metodo setId. Por qual motivo ele não foi
	// criado?
	// porque não é o usuario q define o ID

	public String getCurso() {
		return this.curso;
	}

	@Override
	public void imprimeInfo() {
		System.out.println(super.getId() + " - " + super.getNome() + " (" + super.getCpf() + ") (" + this.matricula
				+ " - " + this.curso + "): saldo = " + super.getSaldo());
	}
}
