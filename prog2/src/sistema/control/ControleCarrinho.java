package sistema.control;

import sistema.model.Item;
import sistema.model.Carrinho;
import sistema.model.Usuarios.UsuarioAtendente;
import sistema.view.ViewCarrinho;

import java.util.List;

public class ControleCarrinho {
	private ViewCarrinho viewCarrinho;
	private ControleItem controleItem;
	private ControleProduto controleProduto;
	private ControleVenda controleVenda;
	private int escolha;

	public ControleCarrinho() {
		viewCarrinho = new ViewCarrinho();
		controleItem = new ControleItem();
		controleProduto = ControleProduto.getInstance();
		controleVenda = ControleVenda.getInstance();
	}

	public void carrinho(UsuarioAtendente usu) {
		Carrinho c = new Carrinho();
		do {
			escolha = viewCarrinho.carrinho();
			while (escolha <= 0 || escolha > 5) {
				System.out.println("Algo deu errado, insira novamente a opção");
				escolha = viewCarrinho.carrinho();
			}
			switch (escolha) {
				case 1: {
					Item item = controleItem.ler();
					c.addItem(item);
					break;
				}
				case 2: {
					// Ver Produtos
					controleProduto.listar();
					break;
				}
				case 3: {
					// Ver itens
					List<Item> itens = c.getItens();
					int espaco = viewCarrinho.lerTamanho();
					while (espaco < 0) {
						System.out.println("Espaço inválido, digite novamente:");
						espaco = viewCarrinho.lerTamanho();
					}
					viewCarrinho.verItens(itens, espaco);
					break;
				}
				case 4: {
					// Finalizar compra
					controleVenda.inserir(usu, c);
					break;
				}
				case 5: {
					// Cancelar
					break;
				}
			}
		} while (escolha < 4);
	}
}
