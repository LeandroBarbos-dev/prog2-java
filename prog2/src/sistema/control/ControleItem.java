package sistema.control;

import sistema.model.Item;
import sistema.model.Produto;
import sistema.view.ViewItem;

public class ControleItem {
	private ViewItem viewItem;
	private ControleProduto controleProduto;

	public ControleItem() {
		viewItem = new ViewItem();
		controleProduto = ControleProduto.getInstance();
	}

	public Item ler() {
		int codItem = viewItem.lerCod();
		double preco = viewItem.lerPreco();
		int quant = viewItem.lerQuant();
		Produto produto = controleProduto.buscarProduto(codItem);
		Item item;
		if (produto == null) {
			viewItem.print("Produto não encontrado");
			item = null;
		} else {
			item = Item.getInstance(produto, preco, quant);
		}
		return item;
	}
}
