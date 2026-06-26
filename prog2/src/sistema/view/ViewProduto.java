package sistema.view;

import java.util.Scanner;

import sistema.model.Produto;
import java.util.List;

public class ViewProduto {
	private Scanner scan;
	private Scanner leia;

	public ViewProduto() {
		scan = new Scanner(System.in);
		leia = new Scanner(System.in);
	}

	public Produto ler() {
		System.out.print("Nome do produto: ");
		String nome = scan.next();

		System.out.print("Marca: ");
		String marca = scan.next();

		System.out.print("Preço: ");
		double preco = scan.nextDouble();

		System.out.print("Quantidade de estoque: ");
		int quantEstoque = scan.nextInt();

		Produto p = Produto.getInstance(nome, marca, preco, quantEstoque);

		return p;
	}

	public int escolhaAlterar() {
		System.out.println("1 - Buscar pelo código");
		System.out.println("2 - Buscar pelo nome");
		return scan.nextInt();
	}

	public int alterarPorCod() {
		System.out.println("Código do poduto a ser alterado:");
		return scan.nextInt();
	}

	public String alterarPorNome() {
		System.out.println("Nome do poduto a ser alterado:");
		return leia.nextLine();
	}

	public int oqAlterar() {
		System.out.println("O que deseja alterar?");
		System.out.println("-1-Nome");
		System.out.println("-2-Marca");
		System.out.println("-3-Preço");
		System.out.println("-4-Estoque");
		return scan.nextInt();
	}

	public String alterarNome() {
		System.out.println("Insira o novo nome:");
		String nome = leia.nextLine();
		while (nome == "" || nome == null) {
			nome = leia.nextLine();
		}
		return nome;
	}

	public String alterarMarca() {
		System.out.println("Insira a nova marca:");
		String marca = leia.nextLine();
		while (marca == "" || marca == null) {
			marca = leia.nextLine();
		}
		return marca;
	}

	public double alterarPreco() {
		System.out.println("Insira o novo preço:");
		return scan.nextDouble();
	}

	public int alterarEstoque() {
		System.out.println("Insira a nova quantidade do estoque:");
		return scan.nextInt();
	}

	public int escolhaExcluir() {
		System.out.println("1 - Buscar pelo código");
		System.out.println("2 - Buscar pelo nome");
		return scan.nextInt();
	}

	public int excluirPorCod() {
		System.out.println("Código do poduto a ser excluido:");
		return scan.nextInt();
	}

	public String excluirPorNome() {
		System.out.println("Nome do poduto a ser excluido:");
		return leia.nextLine();
	}

	public void listar(List<Produto> lista, int espaco) {
		int maxColCod = calculoDasLetras("CÓDIGO");
		int maxColNome = calculoDasLetras("PRODUTO");
		int maxColMarca = calculoDasLetras("MARCA");
		int maxColPreco = calculoDasLetras("PREÇO");
		int maxColEst = calculoDasLetras("QUANTIDADE");
		for (Produto produto : lista) {
			if (produto != null) {
				int cellWidth = calculoDasLetras(String.valueOf(produto.getCodigo()));
				maxColCod = Math.max(maxColCod, cellWidth);
				cellWidth = calculoDasLetras(produto.getNome());
				maxColNome = Math.max(maxColNome, cellWidth);
				cellWidth = calculoDasLetras(produto.getMarca());
				maxColMarca = Math.max(maxColMarca, cellWidth);
				cellWidth = calculoDasLetras(String.valueOf(produto.getPreco()));
				maxColPreco = Math.max(maxColPreco, cellWidth);
				cellWidth = calculoDasLetras(String.valueOf(produto.getQuantEstoque()));
				maxColEst = Math.max(maxColEst, cellWidth);
			}

		}

		System.out.println("");
		String format = " | %-" + (maxColCod + espaco) + "s | %-" + (maxColNome + espaco) + "s | %-"
				+ (maxColMarca + espaco) + "s | %-" + (maxColPreco + espaco) + "s | %-" + (maxColEst + espaco)
				+ "s |%n";
		System.out.printf(format, "CÓDIGO", "PRODUTO", "MARCA", "PREÇO", "QUANTIDADE");

		for (Produto produto : lista) {
			if (produto != null) {
				System.out.printf(format, produto.getCodigo(), produto.getNome(),
						produto.getMarca(), produto.getPreco(),
						produto.getQuantEstoque());
			}
		}
		System.out.print("\n Digite alguma coisa e aperte enter: ");
		scan.next(); // isso serve para não ir direto para o menu
	}

	public int escolhaListar() {
		System.out.println("1 - Buscar pelo código");
		System.out.println("2 - Buscar pelo nome");
		return scan.nextInt();
	}

	public int listarPorCod() {
		System.out.println("Código do poduto que deseja buscar:");
		return scan.nextInt();
	}

	public String listarPorNome() {
		System.out.println("Nome do poduto que deseja buscar:");
		return leia.nextLine();
	}

	public void listarProduto(Produto p, int espaco) {
		int maxColCod = calculoDasLetras("CÓDIGO");
		int maxColNome = calculoDasLetras("PRODUTO");
		int maxColMarca = calculoDasLetras("MARCA");
		int maxColPreco = calculoDasLetras("PREÇO");
		int maxColEst = calculoDasLetras("QUANTIDADE");
		if (p != null) {
			int cellWidth = calculoDasLetras(String.valueOf(p.getCodigo()));
			maxColCod = Math.max(maxColCod, cellWidth);
			cellWidth = calculoDasLetras(p.getNome());
			maxColNome = Math.max(maxColNome, cellWidth);
			cellWidth = calculoDasLetras(p.getMarca());
			maxColMarca = Math.max(maxColMarca, cellWidth);
			cellWidth = calculoDasLetras(String.valueOf(p.getPreco()));
			maxColPreco = Math.max(maxColPreco, cellWidth);
			cellWidth = calculoDasLetras(String.valueOf(p.getQuantEstoque()));
			maxColEst = Math.max(maxColEst, cellWidth);
		}
		
		String format = "| %-" + (maxColCod + espaco) + "s | %-" + (maxColNome + espaco) + "s | %-"
				+ (maxColMarca + espaco) + "s | %-" + (maxColPreco + espaco) + "s | %-" + (maxColEst + espaco)
				+ "s |%n";
		System.out.printf(format, "CÓDIGO", "PRODUTO", "MARCA", "PREÇO", "QUANTIDADE");
		System.out.printf(format, p.getCodigo(), p.getNome(), p.getMarca(), p.getPreco(), p.getQuantEstoque());
	}

	public void print(String msg) {
		System.out.println(msg);
	}

	public int calculoDasLetras(String s) {
		return (s.length());
	}
	
	public int lerTamanho() {
		System.out.print("\n Digite o espaço que deseja para a tabela: ");
		return scan.nextInt();
	}
}
