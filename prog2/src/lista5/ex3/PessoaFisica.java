package lista5.ex3;

public class PessoaFisica extends Pessoa implements Tributavel{
	private double gastosSaude;
	
	public PessoaFisica(String nome, double rendaAnual, double gastosSaude ) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public void imprimirDetalhesImposto() {
		System.out.println("Nome: "+this.nome+"\nTributo: "+this.calcularTributo()+"\n");
	}
	
	public void imprimirDetalhesImposto(boolean detalhado) {
		if(detalhado){
			System.out.println("Nome: "+this.nome+"\nTributo: "+this.calcularTributo()+"\nRenda: "
					+this.rendaAnual+"\nGastos com saude: "+this.gastosSaude+"\n");
		}else {
			System.out.println("Nome: "+this.nome+"\nTributo: "+this.calcularTributo()+"\n");
		}
		
	}
	
	@Override
	public double calcularTributo() {
		return 0.15*(rendaAnual-gastosSaude);
	}

	

}
