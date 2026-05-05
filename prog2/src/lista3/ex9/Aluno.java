package lista3.ex9;

/* Sistema Biblioteca versão 4: definição da classe Aluno */
public class Aluno {
    
    private String cpf = "";
    private String matricula = "";
    private String nome = "";
    private double saldo = 0;
    private boolean inadimplente = false;
    private boolean possuiEmprestimo = false;
    private boolean possuiReserva = false;
    
    public Aluno() {
        System.out.println("Instanciando um objeto da classe Aluno - construtor vazio.\n");
    }
    
    public Aluno(String cpf, String mat, String nome) {
        System.out.println("Instanciando um objeto da classe Aluno usando construtor com parâmetros para inicialização dos atributos.\n");
        this.cpf = cpf;
        this.matricula = mat;
        this.nome = nome;
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

	public void multar(double valor) {
		this.saldo -= valor;
		if(this.saldo < 0) {
	        this.inadimplente = true;
	    }
	}
	
	public void pagar(double valor) {
		this.saldo += valor;
		if(this.saldo > 0) {
	        this.inadimplente = false;
	    }
	}
	
	// metodo para imprimir informacoes do aluno
    public void imprimeInfo() {
        System.out.println(this.matricula + " - " + this.nome + "(" + this.cpf + "): saldo = " + this.saldo + 
            ". Status = " + this.inadimplente + ". Possui emprestimo: " + this.possuiEmprestimo + ". Possui reserva: " + this.possuiReserva);
    }
}
