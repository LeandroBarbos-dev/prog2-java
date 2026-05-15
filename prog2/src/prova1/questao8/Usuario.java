package prova1.questao8;

public abstract class Usuario {
	private String cpf;
	private String nome;
	private double saldo = 0;
	private boolean inadiplente = false;
	private boolean possuiEmprestimo = false;
	private boolean possuiReserva = false;
	
	public Usuario(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public boolean isInadiplente() {
		return inadiplente;
	}

	public void setInadiplente(boolean inadiplente) {
		this.inadiplente = inadiplente;
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

	public void imprimeInfo() {
		System.out.println(this.nome+"("+this.cpf+") - Saldo: "+this.saldo);
	}

}
