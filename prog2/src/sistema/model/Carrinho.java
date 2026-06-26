package sistema.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Item> itens = new ArrayList<>();

	public boolean addItem(Item item) {
		if (item != null) {
			for (Item items : itens) {
				if (items != null) {
					if (items.getProduto().getCodigo() == item.getProduto().getCodigo()) {
						items.setQuantidade((items.getQuantidade() + item.getQuantidade()));
						if (items.getQuantidade() <= items.getProduto().getQuantEstoque()) {
							return true;
						} else {
							return false;
						}

					}
				}
			}
			if (item.getQuantidade() <= item.getProduto().getQuantEstoque()) {
				itens.add(item);
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public List<Item> getItens() {
		List<Item> copiaItens = new ArrayList<>();
		for (Item item : itens) {
			copiaItens.add(item);
		}
		return copiaItens;
	}
}