package lista5.ex3;

import java.util.List;

public class ProcessadorTributos {

	public static double totalizarTributos(List<Tributavel> lista) {
		double valor = 0;
		for (Tributavel tributavel : lista) {
			valor+= tributavel.calcularTributo();
		}
		return valor;
	}
}
