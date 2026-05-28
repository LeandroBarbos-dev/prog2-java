package lista5.ex4;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public abstract double calcularBonus();
	
	public void exibirDados() {
		System.out.println("Funcionario: "+nome+ "("+cpf+") - Slario:"+salario+ "\n");
	}
	
}
