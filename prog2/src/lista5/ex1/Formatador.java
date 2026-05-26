package lista5.ex1;

import java.util.List;

public interface Formatador {
	public String formatarCabecalho(String titulo);// que retorna uma String.
	public String formatarCorpo(List<String> dados);// que retorna uma String.
	public String formatarRodape(int totalRegistros);// que retorna uma String.

}
