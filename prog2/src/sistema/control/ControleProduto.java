package sistema.control;

import sistema.date.RepositorioProduto;
import sistema.model.Produto;
import sistema.model.Item;
import sistema.view.ViewProduto;

import java.util.ArrayList;
import java.util.List;

public class ControleProduto {
	private RepositorioProduto repoProduto;
	private ViewProduto viewProduto;
	private static ControleProduto instance;

	private ControleProduto() {
		repoProduto = new RepositorioProduto();
		viewProduto = new ViewProduto();
	}

	public static ControleProduto getInstance() {
		if (instance == null) {
			instance = new ControleProduto();
		}
		return instance;
	}

	public void inserir() {
		Produto p = viewProduto.ler();
		while(p.getPreco() <= 0 || p.getQuantEstoque() < 0) {
			p = viewProduto.ler();
		}
		if (repoProduto.inserir(p)) {
			viewProduto.print("Produto cadastrado com sucesso!");
		} else {
			viewProduto.print("Falha em cadastrar produto");
		}
	}

	public boolean verificarEstoque(List<Item> c) {
		if (repoProduto.verificarEstoque(c)) {
			viewProduto.print("Não há produtos suficiente!");
			return true;
		}
		return false;
	}

	public void alterar() {
		String nome = "";
		int codigo = 0;
		int opcao = viewProduto.escolhaAlterar();
		while (opcao < 1 || opcao > 2) {
			viewProduto.print("Opção inválida");
			opcao = viewProduto.escolhaAlterar();
		}
		Produto c1;
		Produto p;
		if (opcao == 1) {
			codigo = viewProduto.alterarPorCod();
			c1 = repoProduto.buscarPorCodigo(codigo);
		} else {
			nome = viewProduto.alterarPorNome();
			c1 = repoProduto.buscarPorNome(nome);
		}
		if (c1 == null) {
			viewProduto.print("Produto não encontrado");
			p = null;
		} else {
			p = new Produto(c1);
		}
		int opAlt = viewProduto.oqAlterar();
		while (opAlt < 1 || opAlt > 4) {
			viewProduto.print("Opção inválida");
			opAlt = viewProduto.oqAlterar();
		}
		switch (opAlt) {
			case 1: {
				nome = viewProduto.alterarNome();
				if (p != null) {
					p.setNome(nome);
				}
				break;
			}
			case 2: {
				String marca = viewProduto.alterarMarca();
				if (p != null) {
					p.setMarca(marca);
				}
				break;
			}

			case 3: {
				double preco = viewProduto.alterarPreco();
				while (preco <= 0) {
					preco = viewProduto.alterarPreco();
				}
				if (p != null) {
					p.setPreco(preco);
				}
				break;

			}
			case 4: {
				int estoque = viewProduto.alterarEstoque();
				while (estoque < 0) {
					estoque = viewProduto.alterarEstoque();
				}
				if (p != null) {
					p.setQuantEstoque(estoque);
				}
				break;
			}
		}
		if (repoProduto.alterar(p)) {
			viewProduto.print("Produto alterado com sucesso!");
		} else {
			viewProduto.print("Falha em alterar este produto");
		}
	}

	public void excluir() {
		String nome = "";
		int codigo = 0;
		int opcao = viewProduto.escolhaExcluir();
		while (opcao < 1 || opcao > 2) {
			System.out.println("Opção inválida");
			opcao = viewProduto.escolhaExcluir();
		}
		Produto p;
		if (opcao == 1) {
			codigo = viewProduto.excluirPorCod();
			p = repoProduto.buscarPorCodigo(codigo);
		} else {
			nome = viewProduto.excluirPorNome();
			p = repoProduto.buscarPorNome(nome);
		}
		if(p == null) {
			viewProduto.print("Produto não encontrado");
		}

		if (repoProduto.excluir(p)) {
			viewProduto.print("Produto excluido com sucesso!");
		} else {
			viewProduto.print("Falha em excluir este produto");
		}
	}

	public void listar() {
		List<Produto> produtos = new ArrayList<Produto>();
		produtos = ordenarLista(repoProduto.getLista());
		int espaco = viewProduto.lerTamanho();
		while (espaco < 0) {
			System.out.println("Tamanho inválido, digite novamente");
			espaco = viewProduto.lerTamanho();
		}
		viewProduto.listar(produtos, espaco);
	}

	public void listarUmProduto() {
		String nome = "";
		int codigo = 0;
		int opcao = viewProduto.escolhaListar();
		while (opcao < 1 || opcao > 2) {
			System.out.println("Opção inválida");
			opcao = viewProduto.escolhaListar();
		}
		Produto c1;
		Produto p;
		if (opcao == 1) {
			codigo = viewProduto.listarPorCod();
			c1 = repoProduto.buscarPorCodigo(codigo);
		} else {
			nome = viewProduto.listarPorNome();
			c1 = repoProduto.buscarPorNome(nome);
		}
		if (c1 == null) {
			viewProduto.print("Produto não encontrado");
			p = null;
		} else {
			p = new Produto(c1);
			int espaco = viewProduto.lerTamanho();
			while (espaco < 0) {
				System.out.println("Tamanho inválido, digite novamente");
				espaco = viewProduto.lerTamanho();
			}
			viewProduto.listarProduto(p, espaco);
		}
	}

	public Produto buscarProduto(int cod) {
		return repoProduto.buscarPorCodigo(cod);
	}

	public List<Produto> receberProdutos() {
		List<Produto> produtos = new ArrayList<Produto>();
		produtos = repoProduto.getLista();
		return produtos;
	}

	public List<Produto> ordenarLista(List<Produto> p) {
		List<Produto> pO = new ArrayList<Produto>();
		pO = p;
		int n = pO.size();
		boolean verificador;
		Produto x;
		do {
			verificador = false;

			for (int i = 1; i < n; i++) {
				if (pO.get(i - 1).getCodigo() > pO.get(i).getCodigo()) {
					x = pO.get(i - 1);
					pO.set(i - 1, pO.get(i));
					pO.set(i, x);
					verificador = true;
				}
			}
			n--;
		} while (verificador);
		return pO;
	}
	
	public void inicializarProduto() {
		Produto p = Produto.getInstance("Feijao", "Supang", 7, 10);
		repoProduto.inserir(p);

		p = Produto.getInstance("Arroz", "Vó Maria", 6, 8);
		repoProduto.inserir(p);

		p = Produto.getInstance("Ruffles", "Elma", 14, 12);
		repoProduto.inserir(p);

		p = Produto.getInstance("Doritos", "Elma", 17, 10);
		repoProduto.inserir(p);

		p = Produto.getInstance("Leite", "Minas", 5, 13);
		repoProduto.inserir(p);
	}
}
