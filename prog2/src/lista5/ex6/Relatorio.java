package lista5.ex6;

import java.util.ArrayList;
import java.util.List;

public abstract class Relatorio {
	protected String titulo;
	protected List<String> dados;
	
	
	
	 	public Relatorio(String titulo) {
	 		this.titulo = titulo;
	 		this.dados = new ArrayList<>();
	 	}
	   
	 	public abstract void carregarDados();

	 	public final void gerar() {
	 		carregarDados();
	 		gerarCabecalho();
	 		gerarCorpo(); 
	 		gerarRodape();
	 	}
	   
	 	public abstract void gerarCabecalho();
	 	public abstract void gerarCorpo();
	 	public abstract void gerarRodape();
	}


