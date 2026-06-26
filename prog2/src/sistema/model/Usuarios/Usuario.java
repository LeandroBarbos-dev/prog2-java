package sistema.model.Usuarios;

public class Usuario {
	protected int codigo;
	protected String nome;
	protected String login;
	protected String senha;
	protected boolean ativo;
	private static int contCodigo;

	protected Usuario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.codigo = ++contCodigo;
		this.ativo = true;
	}

	public static Usuario getInstance(String nome, String login, String senha) {
		if (nome != null && nome.length() > 2 && login != null && senha != null) {
			return new Usuario(nome, login, senha);
		}
		return null;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
}
