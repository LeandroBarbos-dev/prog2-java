package lista4.ex6;

/* Sistema Biblioteca versão 4: definição da classe Usuario */
public class Usuario {

	// atributos de classe utilizado para contar quantos objetos são criados
	private static int contador = 0;

	// atributos de objeto
	private int id = 0; // identificador único atribuido a cada objeto criado com base no contador
	private String cpf;
	private String nome;
	private double saldo = 0;
	private boolean inadimplente = false;
	private boolean possuiEmprestimo = false;
	private boolean possuiReserva = false;

	public Usuario(String cpf, String nome) {
		System.out.println(
				"Instanciando um objeto da classe Usuario usando construtor com parâmetros para inicialização dos atributos.\n");
		Usuario.contador++;
		this.id = Usuario.contador;
		this.cpf = cpf;
		this.nome = nome;
	}

	public void setCpf(String str) {
		this.cpf = str;
	}

	public void setNome(String str) {
		this.nome = str;
	}

	// perceba que nao foi criado um metodo setId. Por qual motivo ele não foi
	// criado?
	public int getId() {
		return this.id;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void imprimeInfo() {
		System.out.println(
				this.getId() + " - " + this.getNome() + " (" + this.getCpf() + "): saldo = " + this.getSaldo());
	}
}
