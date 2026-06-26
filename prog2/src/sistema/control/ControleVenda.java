package sistema.control;

import sistema.date.RepositorioVenda;
import sistema.model.Venda;
import sistema.model.Item;
import sistema.model.Carrinho;
import sistema.model.Usuarios.UsuarioAtendente;
import sistema.model.Produto;
import sistema.view.ViewVenda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ControleVenda {
	private RepositorioVenda repoVenda;
	private ViewVenda viewVenda;
	private ControleProduto controleProduto;
	private ControleUsuario controleUsuario;
	private static ControleVenda instance;

	private ControleVenda() {
		repoVenda = new RepositorioVenda();
		viewVenda = new ViewVenda();
		controleProduto = ControleProduto.getInstance();
		controleUsuario = ControleUsuario.getInstance();
	}

	public static ControleVenda getInstance() {
		if (instance == null) {
			instance = new ControleVenda();
		}
		return instance;
	}

	public void inserir(UsuarioAtendente log, Carrinho c) {
		List<String> vendaInfo = new ArrayList<>();
		vendaInfo = viewVenda.ler();
		String client = vendaInfo.get(0);
		String data = vendaInfo.get(1);
		LocalDate dataFormat = formatarData(data);
		List<Item> itens = c.getItens();
		double preco = precoVenda(itens);
		Venda v = Venda.getInstance(dataFormat, client, itens, log, preco);
		if (verificarInserir(v)) {
			log.setTotalValorVendas(preco);
			viewVenda.print("Venda cadastrada com sucesso!");
		} else {
			viewVenda.print("Erro ao registrar venda!");
		}
	}

	public double precoVenda(List<Item> itens) {
		double precoTotal = 0;
		if (itens != null) {
			for (Item item : itens) {
				if (item != null) {
					precoTotal += item.getPreco() * item.getQuantidade();
				}
			}
		}
		return precoTotal;
	}

	public LocalDate formatarData(String data) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFormatada = LocalDate.parse(data, formato);
		return dataFormatada;
	}

	public void listar() {
		viewVenda.listar(repoVenda.getLista());
	}

	public void listarVendasDoDia() {
		String data = viewVenda.informarData();
		LocalDate dataFormatada = formatarData(data);
		viewVenda.listarVendasDoDia(repoVenda.vendasDoDia(dataFormatada));
	}

	public void listarVenda() {
		int codigo = viewVenda.informarCod();
		viewVenda.listarUmaVenda(repoVenda.buscarPorCodigo(codigo));
	}

	public boolean verificarInserir(Venda v) {
		if (controleProduto.verificarEstoque(v.getItensVendidos())) {
			repoVenda.inserir(v);
			return true;
		}
		return false;
	}

	public void inicializarVenda() {
		List<Produto> produtos = controleProduto.receberProdutos();
		List<UsuarioAtendente> uAtts = controleUsuario.buscarAtendente();
		Carrinho c = new Carrinho();
		c.addItem(Item.getInstance(produtos.get(0), 12, 5));
		c.addItem(Item.getInstance(produtos.get(4), 15, 10));

		String dataInformada = "22/01/2012";
		LocalDate data = formatarData(dataInformada);

		verificarInserir(
				Venda.getInstance(data, "Maria", c.getItens(), uAtts.get(0), precoVenda(c.getItens())));
		uAtts.get(0).setTotalValorVendas(precoVenda(c.getItens()));

		Carrinho c2 = new Carrinho();
		c2.addItem(Item.getInstance(produtos.get(1), 12, 5));
		c2.addItem(Item.getInstance(produtos.get(3), 20, 8));
		c2.addItem(Item.getInstance(produtos.get(2), 12, 5));
		dataInformada = "29/12/2023";
		data = formatarData(dataInformada);

		verificarInserir(Venda.getInstance(data, "João", c2.getItens(), uAtts.get(0),
				precoVenda(c2.getItens())));
		uAtts.get(0).setTotalValorVendas(precoVenda(c2.getItens()));
	}
}
