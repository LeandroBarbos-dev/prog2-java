package lista5.ex6;

public class RelatorioEComerce extends Relatorio{
	
	
	
	
	public RelatorioEComerce(String titulo) {
		super(titulo);
	}

	@Override
	public void carregarDados() {
		super.dados.clear();
		super.dados.add("Venda 1 - R$100");
		super.dados.add("Venda 2 - R$130");
		super.dados.add("Venda 3 - R$30");
		super.dados.add("Venda 4 - R$80");
		super.dados.add("Venda 5 - R$200");
		super.dados.add("Toal - R$540,00");
	}

	@Override
	public void gerarCabecalho() {
		System.out.println("\n === "+super.titulo+" ===");
		
	}

	@Override
	public void gerarCorpo() {
		for (String dado : dados) {
			System.out.println("\t - "+dado);
		}
		
	}

	@Override
	public void gerarRodape() {
		System.out.println(" *** Numero de vendas: "+(dados.size()-1)+" ***");
		
	}

}
{

}
