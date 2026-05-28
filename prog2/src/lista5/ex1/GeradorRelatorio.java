package lista5.ex1;

import java.util.List;

public abstract class GeradorRelatorio {
	private String titulo;
	private List<String> dados;

	public abstract void processarDados();
	
	public void gerar(Formatador formatador) {
		
	}
	
}
