package sistema.model;

public class Produto {
	private String nome;
	private String marca;
	private double preco;
	private int quantEstoque;
	private int codigo;
	private static int contCodigo;
	private boolean ativo;

	private Produto(String nome, String marca, double preco, int quantEstoque) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.quantEstoque = quantEstoque;
		this.ativo = true;
		this.codigo = ++contCodigo;
	}

	public static Produto getInstance(String nome, String marca, double preco, int quantEstoque) {
		if (nome != null && nome.length() > 2 && preco > 0 && quantEstoque >= 0) {
			return new Produto(nome, marca, preco, quantEstoque);
		}
		return null;
	}

	public Produto(Produto p) {
		this.nome = p.nome;
		this.marca = p.marca;
		this.preco = p.preco;
		this.quantEstoque = p.quantEstoque;
		this.ativo = p.ativo;
		this.codigo = p.codigo;
	}

	public boolean tirarEstoque(int valor) {
		if (valor > 0 && valor <= this.quantEstoque) {
			this.quantEstoque -= valor;
			return true;
		} else
			return false;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}

	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
