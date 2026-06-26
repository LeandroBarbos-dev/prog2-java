package sistema.view;

import java.util.Scanner;

import sistema.model.Item;
import sistema.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class ViewVenda {
	private Scanner scan;
	private Scanner leia;

	public ViewVenda() {
		scan = new Scanner(System.in);
		leia = new Scanner(System.in);
	}

	public List<String> ler() {
		List<String> vendaInfo = new ArrayList<>();
		System.out.print("Nome do cliente: ");
		String nome = scan.nextLine();
		System.out.println("Informe a data da venda(formato: dd/MM/yyyy)");
		String data = leia.next();
		vendaInfo.add(nome);
		vendaInfo.add(data);
		return vendaInfo;
	}

	public int informarCod() {
		System.out.println("Informe o cóodigo da venda que deseja buscar:");
		return scan.nextInt();
	}
	
	public void listar(List<Venda> lista) {
		int maxColCodigo = calculoDasLetras("CÓDIGO");
		int maxColData = calculoDasLetras("DATA");
		int maxColPrecoVenda = calculoDasLetras("PREÇO TOTAL DA VENDA");
		int maxColAtendente = calculoDasLetras("ATENDENTE");
		for (Venda venda : lista) {
			if (venda != null) {
				int cellWidth = calculoDasLetras(String.valueOf(venda.getCodigo()));
				maxColCodigo = Math.max(maxColCodigo, cellWidth);
				cellWidth = calculoDasLetras(String.valueOf(venda.getData()));
				maxColData = Math.max(maxColData, cellWidth);
				cellWidth = calculoDasLetras(String.valueOf(venda.getValorTotal()));
				maxColPrecoVenda = Math.max(maxColPrecoVenda, cellWidth);
				cellWidth = calculoDasLetras(String.valueOf(venda.getAtd().getNome()));
				maxColAtendente = Math.max(maxColAtendente, cellWidth);
			}

		}
		System.out.print("\n Digite o espaço que deseja para a tabela: ");
		int espaco = scan.nextInt();
		while (espaco < 0) {
			System.out.println("Tamanho inválido, digite novamente");
			espaco = scan.nextInt();
		}

		System.out.println("");
		String format = " | %-" + (maxColCodigo + espaco) + "s | %-" + (maxColData + espaco) + "s | %-"
				+ (maxColPrecoVenda + espaco) + "s | %-" + (maxColAtendente + espaco) + "s | %n";
		for (Venda venda : lista) {
			if (venda != null) {
				System.out.printf(format, "CÓDIGO", "DATA", "PREÇO TOTAL DA VENDA", "ATENDENTE");
				System.out.printf(format, venda.getCodigo(), venda.getData(),
						venda.getValorTotal(), venda.getAtd().getNome());
				System.out.println();
			}
		}

		System.out.print("\n Digite alguma coisa e aperte enter: ");
		scan.next(); // isso serve para não ir direto para o menu
	}

	public void listarVendasDoDia(List<Venda> vendas) {
		if(vendas == null) {
			System.out.println("Não há vendas nesse dia!");
		}
		int maxColCodigo = calculoDasLetras("CÓDIGO");
		int maxColData = calculoDasLetras("DATA");
		int maxColPrecoVenda = calculoDasLetras("PREÇO TOTAL DA VENDA");
		int maxColAtendente = calculoDasLetras("ATENDENTE");
		for (Venda venda : vendas) {
			if (venda != null) {
				int cellWidth = calculoDasLetras(String.valueOf(venda.getCodigo()));
				maxColCodigo = Math.max(maxColCodigo, cellWidth);
				cellWidth = calculoDasLetras(String.valueOf(venda.getData()));
				maxColData = Math.max(maxColData, cellWidth);
				cellWidth = calculoDasLetras(String.valueOf(venda.getValorTotal()));
				maxColPrecoVenda = Math.max(maxColPrecoVenda, cellWidth);
				cellWidth = calculoDasLetras(String.valueOf(venda.getAtd().getNome()));
				maxColAtendente = Math.max(maxColAtendente, cellWidth);
			}
		}
		System.out.print("\n Digite o espaço que deseja para a tabela: ");
		int espaco = scan.nextInt();
		while (espaco < 0) {
			System.out.println("Tamanho inválido, digite novamente");
			espaco = scan.nextInt();
		}

		System.out.println("");
		String format = " | %-" + (maxColCodigo + espaco) + "s | %-" + (maxColData + espaco) + "s | %-"
				+ (maxColPrecoVenda + espaco) + "s | %-" + (maxColAtendente + espaco) + "s | %n";
		for (Venda venda : vendas) {
			if (venda != null) {
				System.out.printf(format, "CÓDIGO", "DATA", "PREÇO TOTAL DA VENDA", "ATENDENTE");
				System.out.printf(format, venda.getCodigo(), venda.getData(),
						venda.getValorTotal(), venda.getAtd().getNome());
				System.out.println();
			}
		}

		System.out.print("\n Digite alguma coisa e aperte enter: ");
		scan.next(); // isso serve para não ir direto para o menu
	}

	public void listarUmaVenda(Venda v) {
		if(v == null) {
			System.out.println("Venda não encontrada");
		}
		int maxColCodigo = calculoDasLetras("CÓDIGO");
		int maxColData = calculoDasLetras("DATA");
		int maxColNomeC = calculoDasLetras("NOME CLIENTE");
		int maxColPrecoVenda = calculoDasLetras("PREÇO TOTAL DA VENDA");
		int maxColAtendente = calculoDasLetras("ATENDENTE");
		int cellWidth = calculoDasLetras(String.valueOf(v.getCodigo()));
		if (v != null) {
			maxColCodigo = Math.max(maxColCodigo, cellWidth);
			cellWidth = calculoDasLetras(String.valueOf(v.getData()));
			maxColData = Math.max(maxColData, cellWidth);
			cellWidth = calculoDasLetras(String.valueOf(v.getNomeC()));
			maxColNomeC = Math.max(maxColNomeC, cellWidth);
			cellWidth = calculoDasLetras(String.valueOf(v.getValorTotal()));
			maxColPrecoVenda = Math.max(maxColPrecoVenda, cellWidth);
			cellWidth = calculoDasLetras(String.valueOf(v.getAtd().getNome()));
			maxColAtendente = Math.max(maxColAtendente, cellWidth);
		}

		System.out.print("\n Digite o espaço que deseja para a tabela: ");

		int espaco = scan.nextInt();
		while (espaco < 0) {
			System.out.println("Tamanho inválido, digite novamente");
			espaco = scan.nextInt();
		}

		System.out.println("");
		String format = " | %-" + (maxColCodigo + espaco) + "s | %-" + (maxColData + espaco) + "s | %-"
				+ (maxColNomeC + espaco) + "s | %-" + (maxColPrecoVenda + espaco) + "s | %-"
				+ (maxColAtendente + espaco) + "s | %n";
		if (v != null) {
			System.out.printf(format, "CÓDIGO", "DATA", "NOME CLIENTE", "PREÇO TOTAL DA VENDA", "ATENDENTE");
			System.out.printf(format, v.getCodigo(), v.getData(),
					v.getNomeC(), v.getValorTotal(), v.getAtd().getNome());
			nomesProdutos(v.getItensVendidos(), espaco);
			System.out.println();
		}

		System.out.print("\n Digite alguma coisa e aperte enter: ");
		scan.next(); // isso serve para não ir direto para o menu
	}

	public void nomesProdutos(List<Item> itensVendidos, int espaco) {
		System.out.println("----------------------------------------");

		if (itensVendidos != null) {
			int maxColProduto = calculoDasLetras("Produto");
			int maxColPreco = calculoDasLetras("PREÇO");
			int maxColEst = calculoDasLetras("QUANTIDADE");
			for (Item item : itensVendidos) {
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

			for (Item item : itensVendidos) {
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

	public String informarData() {
		System.out.println("Informe a data que deseja saber as vendas");
		String data = leia.next();
		return data;
	}

	public int calculoDasLetras(String s) {
		return (s.length());
	}
}
