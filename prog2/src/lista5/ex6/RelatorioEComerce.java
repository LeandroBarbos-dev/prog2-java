package lista5.ex6;

public class RelatorioEComerce extends Relatorio{
	
	private double valorTotal;
	private double freteTotal;
	
	public RelatorioEComerce(String titulo) {
		super(titulo);
	}
	@Override
	public void carregarDados() {
		super.dados.clear();
		super.dados.add("Venda 1 - R$120 - Frete: R$20,00");
		super.dados.add("Venda 2 - R$100 - Frete: R$25,00");
		super.dados.add("Venda 3 - R$35 - Frete: R$15,00");
		super.dados.add("Venda 4 - R$90 - Frete: R$30,00");
		super.dados.add("Venda 5 - R$220 - Frete: R$10,00");
		this.valorTotal = 565;
		this.freteTotal = 100;
		
	}
	@Override
	public void gerarCabecalho() {
		System.out.println("\n === "+super.titulo+" ===");
		
	}
	@Override
	public void gerarCorpo() {
		System.out.println("\t|  VENDA  |  VALOR  |  FRETE  |");
		for (String dado : dados) {
			System.out.println("\t - "+dado);
		}
		System.out.println("Total valor de vendas - R$"+valorTotal);
		System.out.println("Total valor de frete - R$"+freteTotal);
		System.out.println("Total  - R$"+(valorTotal+freteTotal));
		
	}
	@Override
	public void gerarRodape() {
		System.out.println(" *** Numero de vendas: "+(dados.size())+" ***");
		
	}

}



