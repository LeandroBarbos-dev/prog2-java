package sistema.model.Usuarios;

public class UsuarioAdmin extends Usuario {
    String ultimoLogin;

    public UsuarioAdmin(String nome, String login, String senha) {
        super(nome, login, senha);
        this.ultimoLogin = null;
    }

    public String getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(String ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }
}
