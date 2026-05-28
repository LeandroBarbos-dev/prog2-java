package lista5.ex1;

public class RelatorioVendas extends GeradorRelatorio{

	
	public RelatorioVendas(String titulo) {
		super(titulo);
		
	}

	public void processarDados() {
		
		super.dados.clear();
		
		super.dados.add("Venda 1 - Arroz 5kg - R$25,00");
		super.dados.add("Venda 2 - Feijão 1kg - R$9,00");
		super.dados.add("Venda 3 - Maçã 500g - R$2,00");
		super.dados.add("Venda 4 - Laranja 1,5kg - R$5,00");
		
	}
	
	
}
