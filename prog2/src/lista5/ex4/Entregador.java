package lista5.ex4;

public class Entregador extends Funcionario{
	
	private int entrgasFeitas;
	
	public Entregador(String nome, String cpf, int pratos) {
		super(nome, cpf, 1500);
		this.entrgasFeitas = pratos;
	}

	@Override
	public double calcularBonus() {
		
		return 15*entrgasFeitas;
	}

	@Override
	public void exibirDados() {
		System.out.println("Entregador: "+nome+ "("+cpf+") - Slario:"+(salario+this.calcularBonus())+ "\n");
		
	}
}
