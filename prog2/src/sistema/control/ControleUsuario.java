package sistema.control;

import sistema.date.RepositorioUsuario;
import sistema.model.Usuarios.Usuario;
import sistema.model.Usuarios.UsuarioAdmin;
import sistema.model.Usuarios.UsuarioAtendente;
import sistema.view.ViewUsuario;
import java.util.ArrayList;
import java.util.List;

public class ControleUsuario {
	private RepositorioUsuario repoUsuario;
	private ViewUsuario viewUsuario;
	private static ControleUsuario instance;

	private ControleUsuario() {
		repoUsuario = new RepositorioUsuario();
		viewUsuario = new ViewUsuario();
	}

	public static ControleUsuario getInstance() {
		if (instance == null) {
			instance = new ControleUsuario();
		}
		return instance;
	}

	public void inserir() {
		int tipo = viewUsuario.escolherTipo();
		while (tipo < 1 || tipo > 2) {
			viewUsuario.print("Opção inválida, escolha novamente:");
			tipo = viewUsuario.escolherTipo();
		}
		Usuario u = viewUsuario.ler(tipo);
		if (repoUsuario.inserir(u)) {
			viewUsuario.print("Usuário cadastrado com sucesso!");
		} else {
			viewUsuario.print("Falha em cadastrar usuário");
		}
	}

	public void excluir() {
		int codigo = viewUsuario.excluir();
		Usuario u = repoUsuario.buscarPorCodigo(codigo);
		if(u == null) {
			viewUsuario.print("Usuário não encontrado");
		}
		if (repoUsuario.excluir(u)) {
			viewUsuario.print("Usuário excluido com sucesso!");
		} else {
			viewUsuario.print("Falha em excluir este usuário");
		}
	}

	public void listar() {
		int espaco = viewUsuario.lerTamanho();
		while (espaco < 0) {
			System.out.println("Tamanho inválido, digite novamente");
			espaco = viewUsuario.lerTamanho();
		}
		viewUsuario.listar(repoUsuario.getLista(), espaco);
	}

	public void inicializarUsuario() {
		Usuario uAd = new UsuarioAdmin("João", "admin", "123");
		repoUsuario.inserir(uAd);
		Usuario uAt = new UsuarioAtendente("Maria", "att", "123");
		repoUsuario.inserir(uAt);
	}

	public Usuario buscarUsuario(String login, String senha) {
		return repoUsuario.buscarUsuarioLoginSenha(login, senha);
	}

	public List<UsuarioAtendente> buscarAtendente() {
		List<UsuarioAtendente> uAtts = new ArrayList<UsuarioAtendente>();
		List<Usuario> usuarios = repoUsuario.getLista();
		for (Usuario usuario : usuarios) {
			if (usuario instanceof UsuarioAtendente) {
				uAtts.add((UsuarioAtendente) usuario);
			}
		}
		return uAtts;
	}
}
