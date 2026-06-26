package sistema.date;

import java.util.ArrayList;
import java.util.List;

import sistema.model.Item;
import sistema.model.Produto;

public class RepositorioProduto {

	private List<Produto> produtos;

	public RepositorioProduto() {
		produtos = new ArrayList<Produto>();
	}

	public boolean verificarEstoque(List<Item> c) {
		int v = 0;
		for (Item item : c) {
			Produto p = item.getProduto();
			if (p.tirarEstoque(item.getQuantidade())) {
				v++;
			}
		}
		if (v == c.size()) {
			return true;
		}
		return false;
	}

	public boolean inserir(Produto p) {
		if (p != null && verificNome(p.getNome())) {
			this.produtos.add(p);
			return true;
		}
		return false;
	}

	public boolean verificNome(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().toUpperCase().equals(nome.toUpperCase())) {
				return false;
			}
		}
		return true;
	}

	public boolean altera(Produto p) {
		if (p != null) {
			for (Produto produto : produtos) {
				if (produto.getCodigo() == p.getCodigo()) {
					produto.setAtivo(false);
					produtos.add(p);
				}

			}
		}
		return true;
	}

	public boolean excluir(Produto p) {
		if (p != null) {
			for (Produto produto : produtos) {
				if (produto.getCodigo() == p.getCodigo() && produto.getAtivo() == true) {
					produto.setAtivo(false);
				}
			}
		}
		return true;
	}

	public boolean alterar(Produto p) {
		if (p != null) {
			System.out.println(p.getNome());
			for (Produto produto : produtos) {
				System.out.println(produto.getNome());
				if (produto.getCodigo() == p.getCodigo() && produto.getAtivo() == true) {
					produto.setAtivo(false);
					produtos.add(p);
					return true;
				}
			}
		}
		return false;
	}

	public Produto buscarPorNome(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().toUpperCase().equals(nome.toUpperCase()) && produto.getAtivo() == true) {
				return produto;
			}
		}
		return null;
	}

	public Produto buscarPorCodigo(int codigo) {
		for (Produto produto : produtos) {
			if (produto.getCodigo() == codigo && produto.getAtivo() == true) {
				return produto;
			}
		}
		return null;
	}

	public List<Produto> getLista() {
		List<Produto> copiaProdutos = new ArrayList<Produto>();
		for (Produto produto : produtos) {
			if (produto.getAtivo()) {
				copiaProdutos.add(produto);
			}
		}
		return copiaProdutos;
	}
}
