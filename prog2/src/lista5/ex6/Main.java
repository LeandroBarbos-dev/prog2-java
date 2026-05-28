package lista5.ex6;

public class Main {
	
	
	public static void main(String[] args) {
		RelatorioEComerce r1 = new RelatorioEComerce("EComerce");
		RelatorioLFisica r2 = new RelatorioLFisica("Loja Fisica");
		RelatorioEstoque r3 = new RelatorioEstoque("Estoque");
		
		r1.gerar();
		r2.gerar();
		r3.gerar();
	}
}
