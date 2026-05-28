package lista5.ex1;

public class Main {

	public static void main(String[] args) {
		RelatorioFinanceiro rf = new RelatorioFinanceiro("Relatorio Financeiro");
		
		RelatorioVendas rv = new RelatorioVendas("Relatorio Vendas");

		FormatadorHTML f1 = new FormatadorHTML();
		FormatadorTextoSimples f2 = new FormatadorTextoSimples();
		
		rf.gerar(f1);
		rf.gerar(f2);
		
		rv.gerar(f1);
		rv.gerar(f2);
		
	}

}
