package lista5.ex1;

import java.util.List;

public class FormatadorTextoSimples implements Formatador{
	@Override
	public String formatarCabecalho(String titulo) {
		return " === "+titulo+" === \n";
	}

	@Override
	public String formatarCorpo(List<String> dados) {
		String dadosFormatados = "";
		for (String dado : dados) {
			dadosFormatados+="\t-"+dado+"\n";
		}
		return dadosFormatados;
	}

	@Override
	public String formatarRodape(int totalRegistros) {
		
		return "\n *** Total dados registrados: "+totalRegistros+" ***";
	}
}
