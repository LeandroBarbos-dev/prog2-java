package sistema.model;

public class Item {
	private Produto produto;
	private double preco;
	private int quantidade;

	private Item(Produto produto, double preco, int quantidade) {
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public static Item getInstance(Produto produto, double preco, int quantidade) {
		if (produto != null && preco > 0 && quantidade >= 0) {
			return new Item(produto, preco, quantidade);
		}
		return null;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto p) {
		this.produto.setNome(p.getNome());
		this.produto.setMarca(p.getMarca());
		this.produto.setPreco(p.getPreco());
		this.produto.setQuantEstoque(p.getQuantEstoque());
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
