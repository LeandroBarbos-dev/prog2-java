package sistema.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewPrincipal {
	private Scanner scan;
	private Scanner leia;

	public ViewPrincipal() {
		scan = new Scanner(System.in);
		leia = new Scanner(System.in);
	}

	int escolha = 0;

	public int menu() {
		System.out.println("Logar(1) ou sair(2)?");
		return scan.nextInt();
	}

	public List<String> login() {
		List<String> logins = new ArrayList<>();
		String login;
		String senha;
		System.out.println("_______________________________________________");
		System.out.println("|                  -Login-                    |");
		System.out.println("|_____________________________________________|");
		System.out.println("Login:");
		login = leia.nextLine();
		System.out.println("Senha:");
		senha = leia.nextLine();
		logins.add(login);
		logins.add(senha);
		return logins;
	}

	public int menuADM() {

		System.out.println("_______________________________________________");
		System.out.println("|                   -Menu-                    |");
		System.out.println("|               Adiministrador                |");
		System.out.println("|                                             |");
		System.out.println("|     -1-Inserir produto                      |");
		System.out.println("|     -2-Excluir produto                      |");
		System.out.println("|     -3-Alterar produto                      |");
		System.out.println("|     -4-Buscar produto                       |");
		System.out.println("|     -5-Listar produtos                      |");
		System.out.println("|     -6-Buscar venda                         |");
		System.out.println("|     -7-Listar vendas                        |");
		System.out.println("|     -8-Listar vendas no dia                 |");
		System.out.println("|     -9-Adicionar Usuário                    |");
		System.out.println("|     -10-Listar Usuários                     |");
		System.out.println("|     -11-Remover Usuário                     |");
		System.out.println("|     -12-Desconectar                         |");
		System.out.println("|     -13-Fechar Programa                     |");
		System.out.println("|                                             |");
		System.out.println("|_____________________________________________|");
		System.out.println("Selecione uma opção:");
		return scan.nextInt();
	}

	public int menuATT() {

		System.out.println("_______________________________________________");
		System.out.println("|                   -Menu-                    |");
		System.out.println("|                 Atendente                   |");
		System.out.println("|                                             |");
		System.out.println("|     -1-Carrinho de compras                  |");
		System.out.println("|     -2-Ver Produtos                         |");
		System.out.println("|     -3-Buscar produto                       |");
		System.out.println("|     -4-Desconectar                          |");
		System.out.println("|     -5-Fechar Programa                      |");
		System.out.println("|                                             |");
		System.out.println("|                                             |");
		System.out.println("|_____________________________________________|");
		System.out.println("Selecione uma opção:");
		
		return scan.nextInt();
	}

	public void print(String msg) {
		System.out.println(msg);
	}

}
