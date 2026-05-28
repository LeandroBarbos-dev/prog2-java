package lista5.ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class GeradorRelatorio {
	protected String titulo;
	protected List<String> dados;
	
	

	public GeradorRelatorio(String titulo) {
		super();
		this.titulo = titulo;
		this.dados = new ArrayList<>();
	}

	public abstract void processarDados();
	
	public void gerar(Formatador formatador) {
		
		processarDados();
		System.out.println(formatador.formatarCabecalho(this.titulo)+formatador.formatarCorpo(dados)+
				formatador.formatarRodape(dados.size())+"\n\n");
		
	}
	
}
