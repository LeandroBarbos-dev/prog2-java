package lista5.ex1;

import java.util.List;

public interface Formatador {
	public String formatarCabecalho(String titulo);
	public String formatarCorpo(List<String> dados);
	public String formatarRodape(int totalRegistros);

}
