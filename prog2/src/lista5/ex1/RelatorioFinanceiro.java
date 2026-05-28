package lista5.ex1;

public class RelatorioFinanceiro extends GeradorRelatorio{

	public RelatorioFinanceiro(String titulo) {
		super(titulo);
		
	}

	public void processarDados() {
		
		super.dados.clear();
		
		super.dados.add("Lucro total - R$50.000,00");
		super.dados.add("Despesa total - R$28.000,00");
		super.dados.add("Lucro liquido - R$22.000,00");
		
	}
	
}
