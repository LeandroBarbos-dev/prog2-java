package sistema.view;

import java.util.Scanner;

import sistema.model.Usuarios.Usuario;
import sistema.model.Usuarios.UsuarioAdmin;
import sistema.model.Usuarios.UsuarioAtendente;
import java.util.List;

public class ViewUsuario {
	private Scanner scan;
	private Scanner leia;
	private Scanner scn;

	public ViewUsuario() {
		scan = new Scanner(System.in);
		leia = new Scanner(System.in);
		scn = new Scanner(System.in);
	}

	public Usuario ler(int tipo) {
		Usuario u;
		System.out.print("Nome do usuário: ");
		String nome = scn.nextLine();

		System.out.print("Login: ");
		String login = leia.next();

		System.out.print("Senha: ");
		String senha = leia.next();

		if (tipo == 1) {
			u = new UsuarioAdmin(nome, login, senha);
		} else {
			u = new UsuarioAtendente(nome, login, senha);
		}

		return u;
	}

	public int escolherTipo() {
		System.out.println("1 - Administrador");
		System.out.println("2 - Atendente");
		return scan.nextInt();
	}

	public int excluir() {
		System.out.println("Código do usuário a ser excluido:");
		return scan.nextInt();
	}

	public void listar(List<Usuario> lista, int espaco) {
		int maxColCod = calculoDasLetras("CÓDIGO");
		int maxColNome = calculoDasLetras("PRODUTO");
		int maxColLogin = calculoDasLetras("MARCA");
		int maxColUL = calculoDasLetras("ÚLTIMO LOGIN");
		int maxColTVV = calculoDasLetras("TOTAL VALOR VENDAS");
		for (Usuario usuario : lista) {
			if (usuario != null) {
				int cellWidth = calculoDasLetras(String.valueOf(usuario.getCodigo()));
				maxColCod = Math.max(maxColCod, cellWidth);
				cellWidth = calculoDasLetras(usuario.getNome());
				maxColNome = Math.max(maxColNome, cellWidth);
				cellWidth = calculoDasLetras(usuario.getLogin());
				maxColLogin = Math.max(maxColLogin, cellWidth);
				if (usuario instanceof UsuarioAdmin) {
					UsuarioAdmin uAdm = (UsuarioAdmin) usuario;
					if (uAdm.getUltimoLogin() == null) {
						uAdm.setUltimoLogin("...");
					}
					cellWidth = calculoDasLetras(String.valueOf(uAdm.getUltimoLogin()));
					maxColUL = Math.max(maxColUL, cellWidth);
					cellWidth = calculoDasLetras("...");
					maxColTVV = Math.max(maxColTVV, cellWidth);
				} else {
					UsuarioAtendente uAtt = (UsuarioAtendente) usuario;
					cellWidth = calculoDasLetras(String.valueOf(uAtt.getTotalValorVendas()));
					maxColTVV = Math.max(maxColTVV, cellWidth);
					cellWidth = calculoDasLetras("...");
					maxColUL = Math.max(maxColUL, cellWidth);
				}
			}

		}
		

		System.out.println("");
		String format = " | %-" + (maxColCod + espaco) + "s | %-" + (maxColNome + espaco) + "s | %-"
				+ (maxColLogin + espaco) + "s | %-" + (maxColUL + espaco) + "s | %-" + (maxColTVV + espaco) + "s |%n";
		System.out.printf(format, "CÓDIGO", "NOME", "LOGIN", "ULTIMO LOGIN", "TOTAL VALOR VENDAS");

		for (Usuario usuario : lista) {
			if (usuario != null) {
				if (usuario instanceof UsuarioAdmin) {
					UsuarioAdmin uAdm = (UsuarioAdmin) usuario;
					System.out.printf(format, uAdm.getCodigo(), uAdm.getNome(),
							uAdm.getLogin(), uAdm.getUltimoLogin(), "...");
				} else {
					UsuarioAtendente uAtt = (UsuarioAtendente) usuario;
					System.out.printf(format, uAtt.getCodigo(), uAtt.getNome(),
							uAtt.getLogin(), "...", uAtt.getTotalValorVendas());
				}
			}
		}
		System.out.print("\n Digite alguma coisa e aperte enter: ");
		scan.next(); // isso serve para não ir direto para o menu
	}

	public void print(String msg) {
		System.out.println(msg);
	}
	
	public int lerTamanho() {
		System.out.print("\n Digite o espaço que deseja para a tabela: ");
		return scan.nextInt();
	}

	public int calculoDasLetras(String s) {
		return (s.length());
	}
}
