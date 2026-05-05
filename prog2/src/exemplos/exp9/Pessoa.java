package exemplos.exp9;

/*
Sistema acadêmico versão 8: herança
*/

public class Pessoa {

	private String cpf;
	private String nome;
	private String endereco;

	public Pessoa() {
		System.out.println("Instanciando um objeto da classe Pessoa com construtor sem argumentos.");
	}

	public Pessoa(String cpf, String nome, String end) {
		System.out.println("Instanciando um objeto da classe Pessoa com parâmetros de inicialização dos atributos.");
		this.setCpf(cpf);
		this.setNome(nome);
		this.setEndereco(end);
	}

	public void setCpf(String str) {
		this.cpf = str;
	}

	public void setNome(String str) {
		this.nome = str;
	}

	public void setEndereco(String end) {
		this.endereco = end;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void imprimeInfo() {
		System.out.println(this.getNome() + "(" + this.getCpf() + ") : " + this.getEndereco());
	}
}
