package sistema.view;

import java.util.Scanner;

public class ViewItem {
	private Scanner scan;

	public ViewItem() {
		scan = new Scanner(System.in);
	}

	public int lerCod() {

		System.out.println("Informe o codigo do produto a ser adicionado ao carrinho");
		int cod = scan.nextInt();

		return cod;
	}

	public double lerPreco() {

		System.out.println("Informe o preço unitario do produto a ser adicionado ao carrinho");
		double preco = scan.nextDouble();

		return preco;
	}

	public int lerQuant() {

		System.out.println("Informe a quantidade do produto a ser adicionado ao carrinho");
		int quant = scan.nextInt();

		return quant;
	}

	public void print(String msg) {
		System.out.println(msg);
	}
}
