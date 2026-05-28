package lista5.ex4;

public class Garcom extends Funcionario{
private int mesasAtendidas;
	
	

	public Garcom(String nome, String cpf, int pratos) {
		super(nome, cpf, 2000);
		this.mesasAtendidas = pratos;
	}

	@Override
	public double calcularBonus() {
		
		return 8*mesasAtendidas;
	}

	@Override
	public void exibirDados() {
		System.out.println("Garçom: "+nome+ "("+cpf+") - Slario:"+(salario+this.calcularBonus())+ "\n");
		
	}
}
