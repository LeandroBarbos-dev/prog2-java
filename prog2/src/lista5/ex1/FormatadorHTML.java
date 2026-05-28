package lista5.ex1;

import java.util.List;

public class FormatadorHTML implements Formatador{

	@Override
	public String formatarCabecalho(String titulo) {
		return "<h1>"+titulo+"<\\h1>\n";
	}

	@Override
	public String formatarCorpo(List<String> dados) {
		String dadosFormatados = "";
		for (String dado : dados) {
			dadosFormatados+="<p>"+dado+"<\\p>\n";
		}
		return dadosFormatados;
	}

	@Override
	public String formatarRodape(int totalRegistros) {
		
		return "<p>Total dados registrados: "+totalRegistros+"<\\p>";
	}

}
