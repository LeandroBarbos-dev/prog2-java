package lista3.ex7;

/* Sistema Biblioteca versão 3: definição da classe Aluno */
public class Aluno {
    
    private String cpf = "";
    private String matricula = "";
    private String nome = "";
    private double saldo = 0;
    private String email = "";
    private String telefone = "";
    private boolean inadimplente = false;
    private boolean possuiEmprestimo = false;
    private boolean possuiReserva = false;
    
    
    public Aluno() {
        System.out.println("Instanciando um objeto da classe Aluno - construtor vazio.\n");
    }
   
    public Aluno(String cpf, String matricula, String nome, double saldo, String email, String telefone) {
    	 System.out.println("Instanciando um objeto da classe Aluno usando construtor com parâmetros para inicialização dos atributos.\n");
    	this.cpf = cpf;
    	this.matricula = matricula;
    	this.nome = nome;
    	this.saldo = saldo;
    	this.email = email;
    	this.telefone = telefone;
    }
    
   
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
    
    public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isInadimplente() {
		return inadimplente;
	}

	public void setInadimplente(boolean inadimplente) {
		this.inadimplente = inadimplente;
	}

	public boolean isPossuiEmprestimo() {
		return possuiEmprestimo;
	}

	public void setPossuiEmprestimo(boolean possuiEmprestimo) {
		this.possuiEmprestimo = possuiEmprestimo;
	}

	public boolean isPossuiReserva() {
		return possuiReserva;
	}

	public void setPossuiReserva(boolean possuiReserva) {
		this.possuiReserva = possuiReserva;
	}

	
	// metodo para imprimir informacoes do aluno
    public void imprimeInfo() {
        System.out.println(this.matricula + " - " + this.nome + "(" + this.cpf + "): saldo = " + this.saldo + 
            ". Status = " + this.inadimplente + ". Possui emprestimo: " + this.possuiEmprestimo + ". Possui reserva: " + this.possuiReserva+ ". Contato email: " + this.email+ ". telefone: " + this.telefone);
    }
}

