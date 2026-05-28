package lista5.ex6;

public class RelatorioEstoque extends Relatorio{
	
	public RelatorioEstoque(String titulo) {
		super(titulo);
	}

	@Override
	public void carregarDados() {
		super.dados.clear();
		super.dados.add("Produto 1 - 56");
		super.dados.add("Produto 2 - 123");
		super.dados.add("Produto 3 - 67");
		super.dados.add("Produto 4 - 0");
		super.dados.add("Produto 5 - 24");
	}

	@Override
	public void gerarCabecalho() {
		System.out.println("\n === "+super.titulo+" ===");
		
	}

	@Override
	public void gerarCorpo() {
		System.out.println("\t| PRODUTO | QUANTIDADE |");
		for (String dado : dados) {
			System.out.println("\t - "+dado);
		}
		
	}

	@Override
	public void gerarRodape() {
		System.out.println(" *** Numero de Produtos registrados: "+(dados.size())+" ***");
		
	}
}
