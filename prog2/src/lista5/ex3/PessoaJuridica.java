package lista5.ex3;

public class PessoaJuridica extends Pessoa implements Tributavel{
	
	private int numFuncionario;
	
	public PessoaJuridica(String nome, double rendaAnual, int num) {
		super(nome, rendaAnual);
		this.numFuncionario = num;
	}

	@Override
	public double calcularTributo() {
		return 0.1*super.rendaAnual;
	}

	

}
