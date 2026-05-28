package lista5.ex6;

import java.util.List;

public class RelatorioLFisica extends Relatorio{
	private double valorTotal;
	
	
	
	public RelatorioLFisica(String titulo) {
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
		valorTotal = 540;
	}

	@Override
	public void gerarCabecalho() {
		System.out.println("\n === "+super.titulo+" ===");
		
	}

	@Override
	public void gerarCorpo() {
		System.out.println("\t|  VENDA  |  VALOR  |");
		for (String dado : dados) {
			System.out.println("\t - "+dado);
		}
		System.out.println("Total - R$"+valorTotal);
		
	}

	@Override
	public void gerarRodape() {
		System.out.println(" *** Numero de vendas: "+(dados.size())+" ***");
		
	}

}
