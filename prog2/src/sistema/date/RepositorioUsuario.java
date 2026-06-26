package sistema.date;

import java.util.ArrayList;
import java.util.List;

import sistema.model.Usuarios.Usuario;

public class RepositorioUsuario {
	private List<Usuario> usuarios;

	public RepositorioUsuario() {
		usuarios = new ArrayList<Usuario>();
	}

	public boolean inserir(Usuario u) {
		if (u != null && verificLogin(u.getLogin())) {
			this.usuarios.add(u);
			return true;
		}
		return false;
	}

	public boolean verificLogin(String login) {
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login)) {
				return false;
			}
		}
		return true;
	}

	public boolean excluir(Usuario u) {
		if (u != null) {
			for (Usuario usuario : usuarios) {
				if (usuario.getCodigo() == u.getCodigo() && usuario.getAtivo()) {
					usuario.setAtivo(false);
					return true;
				}
			}
		}
		return false;
	}

	public Usuario buscarPorCodigo(int codigo) {
		for (Usuario usuario : usuarios) {
			if (usuario.getCodigo() == codigo && usuario.getAtivo()) {
				return usuario;
			}
		}
		return null;
	}

	public Usuario buscarUsuarioLoginSenha(String login, String senha) {
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login) && usuario.getAtivo() && usuario.getSenha().equals(senha)) {
				return usuario;
			}
		}
		return null;
	}

	public List<Usuario> getLista() {
		List<Usuario> copiaUsuarios = new ArrayList<Usuario>();
		for (Usuario usuario : usuarios) {
			if (usuario.getAtivo()) {
				copiaUsuarios.add(usuario);
			}
		}
		return copiaUsuarios;
	}
}
