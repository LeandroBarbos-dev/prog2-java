package sistema.control;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import sistema.model.Usuarios.Usuario;
import sistema.model.Usuarios.UsuarioAdmin;
import sistema.model.Usuarios.UsuarioAtendente;
import sistema.view.ViewPrincipal;

public class Sistema {
	private static Sistema instance;
	private ViewPrincipal viewPrincipal;
	private ControleProduto controleProduto;
	private ControleUsuario controleUsuario;
	private ControleVenda controleVenda;
	private ControleCarrinho controleCarrinho;

	private Sistema() {
		viewPrincipal = new ViewPrincipal();
		controleProduto = ControleProduto.getInstance();
		controleUsuario = ControleUsuario.getInstance();
		controleVenda = ControleVenda.getInstance();
		controleCarrinho = new ControleCarrinho();
	}

	public static Sistema getInstance() {
		if (instance == null) {
			instance = new Sistema();
		}
		return instance;
	}

	public void iniciar() {
		int escolha = 0;
		int opcao = 0;
		int sair = 0;
		Usuario log;// = controleUsuario.buscarUsuario("att", "123");
		
		init();
		
		do {
			log = null;
			if (sair == 0) {
				opcao = viewPrincipal.menu();
				while (opcao <= 0 || opcao > 2) {
					viewPrincipal.print("Opção inválida, insira novamente: ");
					opcao = viewPrincipal.menu();
				}
				if (opcao == 1) {
					List<String> logins = new ArrayList<>();
					logins = viewPrincipal.login();
					String login = logins.get(0);
					String senha = logins.get(1);
					log = controleUsuario.buscarUsuario(login, senha);
					while (log == null) {
						viewPrincipal.print("Usuário não encontrado");
						logins = viewPrincipal.login();
						login = logins.get(0);
						senha = logins.get(1);
						log = controleUsuario.buscarUsuario(login, senha);
					}
					viewPrincipal.print("\n" + "\t \t \t" + login);

					if (log instanceof UsuarioAdmin) {
						UsuarioAdmin uAdm = (UsuarioAdmin) log;
						String dateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy, hh:mm:ss a")
								.format(LocalDateTime.now());
						uAdm.setUltimoLogin(dateTime);
						opcao = 1;
					} else {
						opcao = 2;
					}

				} else {
					opcao = 4;
					viewPrincipal.print("Programa encerrado!");
				}
				switch (opcao) {
					case 1: {
						do {
							escolha = viewPrincipal.menuADM();
							while (escolha <= 0 || escolha > 13) {
								System.out.println("Algo deu errado, insira novamente a opção");
								escolha = viewPrincipal.menuADM();
							}

							switch (escolha) {
								case 1: {
									// Inserindo produto
									controleProduto.inserir();

									break;
								}
								case 2: {
									// Excluir
									controleProduto.excluir();
									break;
								}
								case 3: {
									// Alterar
									controleProduto.alterar();
									break;
								}
								case 4: {
									// Listagem por nome/código
									controleProduto.listarUmProduto();
									break;
								}
								case 5: {
									// Listagem de todos os produtos
									controleProduto.listar();
									break;
								}

								case 6: {
									// Buscar venda
									controleVenda.listarVenda();
									break;
								}

								case 7: {
									// Listagem de todas as vendas
									controleVenda.listar();
									break;
								}

								case 8: {
									// Listagem das vendas no dia
									controleVenda.listarVendasDoDia();
									break;
								}

								case 9: {
									// Adicionando um novo usuario
									controleUsuario.inserir();
									break;
								}

								case 10: {
									// Listagem dos usuários
									controleUsuario.listar();
									break;
								}

								case 11: {
									// Removendo usuário
									controleUsuario.excluir();
									break;
								}

								case 12: {
									log = null;
									viewPrincipal.print("Usuário desconectado!");
									// Usuário desconectado!
									break;
								}
								case 13: {
									log = null;
									sair = 1;
									viewPrincipal.print("Programa encerrado!");
									// Programa encerrado!
									break;
								}
							}
						} while (escolha < 12);
						break;
					}
					case 2: {
						do {

							escolha = viewPrincipal.menuATT();
							while (escolha <= 0 || escolha > 5) {
								System.out.println("Algo deu errado, insira novamente a opção");
								escolha = viewPrincipal.menuATT();
							}

							switch (escolha) {
								case 1: {
									// Carrinho");
									UsuarioAtendente uAtt;
									if (log instanceof UsuarioAtendente) {
										uAtt = (UsuarioAtendente) log;
										controleCarrinho.carrinho(uAtt);
									}
									break;
								}
								case 2: {
									controleProduto.listar();
									break;
								}
								case 3: {
									controleProduto.listarUmProduto();
									break;
								}
								case 4: {
									log = null;
									viewPrincipal.print("Usuário desconectado!");
									// Usuário desconectado!
									break;
								}
								case 5: {
									log = null;
									sair = 1;
									viewPrincipal.print("Programa encerrado!");
									// Programa encerrado!
									break;
								}
							}
						} while (escolha < 4);
						break;
					}

				}
			} else {
				break;
			}

		} while (opcao < 4);
	}

	public void init() {
		controleUsuario.inicializarUsuario();
		controleProduto.inicializarProduto();
		controleVenda.inicializarVenda();
	}

}
