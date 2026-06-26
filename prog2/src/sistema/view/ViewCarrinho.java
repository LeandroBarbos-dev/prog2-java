package sistema.view;

import java.util.List;
import java.util.Scanner;

import sistema.model.Item;

public class ViewCarrinho {
	private Scanner scan;

	public ViewCarrinho() {
		scan = new Scanner(System.in);
	}

	public int carrinho() {
		System.out.println("_______________________________________________");
		System.out.println("|               -Carrinho-                    |");
		System.out.println("|                                             |");
		System.out.println("|     -1-Adicionar item                       |");
		System.out.println("|     -2-Ver Produtos                         |");
		System.out.println("|     -3-Ver itens                            |");
		System.out.println("|     -4-Finalizar Compra                     |");
		System.out.println("|     -5-Cancelar                             |");
		System.out.println("|                                             |");
		System.out.println("|                                             |");
		System.out.println("|_____________________________________________|");
		System.out.println("Selecione uma opção:");
		return scan.nextInt();
	}

	public int lerTamanho() {
		System.out.print("\n Digite o espaço que deseja para a tabela: ");
		return scan.nextInt();
	}

	public void verItens(List<Item> itens, int espaco) {
		System.out.println("----------------------------------------");

		if (itens != null) {
			int maxColProduto = calculoDasLetras("PRODUTO");
			int maxColPreco = calculoDasLetras("PREÇO");
			int maxColEst = calculoDasLetras("QUANTIDADE");
			for (Item item : itens) {
				if (item != null) {
					int cellWidth = calculoDasLetras(item.getProduto().getNome());
					maxColProduto = Math.max(maxColProduto, cellWidth);
					cellWidth = calculoDasLetras(String.valueOf(item.getPreco()));
					maxColPreco = Math.max(maxColPreco, cellWidth);
					cellWidth = calculoDasLetras(String.valueOf(item.getQuantidade()));
					maxColEst = Math.max(maxColEst, cellWidth);
				}

			}

			System.out.println("");
			String format = "| %-" + (maxColProduto + espaco) + "s | %-" + (maxColPreco + espaco) + "s | %-"
					+ (maxColEst + espaco) + "s |%n";
			System.out.printf(format, "PRODUTO", "PREÇO", "QUANTIDADE");

			for (Item item : itens) {
				if (item != null) {
					System.out.printf(format, item.getProduto().getNome(), item.getPreco(),
							item.getQuantidade());
				}
			}

		}
	}

	public void print(String msg) {
		System.out.println(msg);
	}

	public int calculoDasLetras(String s) {
		return (s.length());
	}
}
