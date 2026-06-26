package sistema.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import sistema.model.Usuarios.UsuarioAtendente;

public class Venda {
	private int codigo;
	private LocalDate data;
	private List<Item> itensVendidos = new ArrayList<>();
	private String nomeCliente;
	private UsuarioAtendente atd;
	private double valorTotal;
	private static int contCodigo;

	private Venda(LocalDate data, String nomeCliente, List<Item> itensVendidos, UsuarioAtendente atd,
			double valorTotal) {
		this.codigo = ++contCodigo;
		this.data = data;
		this.nomeCliente = nomeCliente;
		this.atd = atd;
		for (Item itemVendido : itensVendidos) {
			if (itemVendido != null) {
				this.itensVendidos.add(Item.getInstance(itemVendido.getProduto(), itemVendido.getPreco(),
						itemVendido.getQuantidade()));
			}
		}
		this.valorTotal = valorTotal;
	}

	public static Venda getInstance(LocalDate data, String nome, List<Item> itensVendidos, UsuarioAtendente atd,
			double valorTotal) {
		if (data != null && itensVendidos != null && nome != null && nome.length() > 2 && atd != null) {
			return new Venda(data, nome, itensVendidos, atd, valorTotal);
		}
		return null;
	}

	public int getCodigoVenda() {
		return codigo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<Item> getItensVendidos() {
		List<Item> copiaItens = new ArrayList<>();
		for (Item item : itensVendidos) {
			copiaItens.add(item);
		}
		return copiaItens;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setNomeC(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeC() {
		return nomeCliente;
	}

	public UsuarioAtendente getAtd() {
		return atd;
	}

	public void setAtd(UsuarioAtendente atd) {
		this.atd = atd;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setItens(List<Item> itensVendidos) {
		for (Item itemVendido : itensVendidos) {
			itensVendidos.add(
					Item.getInstance(itemVendido.getProduto(), itemVendido.getPreco(), itemVendido.getQuantidade()));
		}
	}
}
