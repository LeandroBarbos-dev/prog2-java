package exemplos.exp9;

/*
Sistema acadêmico versão 8: herança
*/

public class Aluno extends Pessoa {

	private String matricula = "";

	public Aluno() {
		System.out.println("Instanciando um objeto da classe Aluno com construtor sem argumentos.\n");
	}

	public Aluno(String cpf, String nome, String mat, String end) {
		super(cpf, nome, end);
		System.out.println("Instanciando um objeto da classe Aluno com parâmetros de inicialização dos atributos.\n");
		this.setMatricula(mat);
	}

	public void setMatricula(String mat) {
		this.matricula = mat;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void imprimeInfo() {
		// o que acontece se tentarmos fazer a chamada como no comando abaixo? Por que
		// isso acontece?
		// System.out.println(this.nome + "(" + this.matricula + ") : " + this.nota);
		System.out.println(super.getNome() + "(" + this.getMatricula() + ")");
	}
}
