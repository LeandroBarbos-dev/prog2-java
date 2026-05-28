package lista5.ex4;

public class Cozinheiro extends Funcionario{
	private int pratosPreparados;
	
	

	public Cozinheiro(String nome, String cpf, int pratos) {
		super(nome, cpf, 3000);
		this.pratosPreparados = pratos;
	}

	@Override
	public double calcularBonus() {
		
		return 5*pratosPreparados;
	}

	@Override
	public void exibirDados() {
		System.out.println("Cozinheiro: "+nome+ "("+cpf+") - Slario:"+(salario+this.calcularBonus())+ "\n");
		
	}

}
