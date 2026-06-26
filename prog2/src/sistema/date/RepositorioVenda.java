package sistema.date;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import sistema.model.Venda;

public class RepositorioVenda {
	private List<Venda> vendas;

	public RepositorioVenda() {
		vendas = new ArrayList<Venda>();
	}

	public boolean inserir(Venda v) {
		if (v != null) {
			this.vendas.add(v);
			return true;
		}
		return false;
	}

	public Venda buscarPorCodigo(int codigo) {
		for (Venda venda : vendas) {
			if (venda.getCodigo() == codigo) {
				return venda;
			}
		}
		return null;
	}

	public List<Venda> vendasDoDia(LocalDate data) {
		List<Venda> copiaVendas = new ArrayList<Venda>();
		for (Venda venda : vendas) {
			if (venda.getData().compareTo(data) == 0) {
				copiaVendas.add(venda);
			}
		}
		return copiaVendas;
	}

	public List<Venda> getLista() {
		List<Venda> copiaVendas = new ArrayList<Venda>();
		for (Venda venda : vendas) {
			copiaVendas.add(venda);
		}
		return copiaVendas;
	}
}
