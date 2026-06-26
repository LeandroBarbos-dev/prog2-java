package sistema.model.Usuarios;

public class UsuarioAtendente extends Usuario {
    protected double totalValorVendas;

    public UsuarioAtendente(String nome, String login, String senha) {
        super(nome, login, senha);
        this.totalValorVendas = 0;
    }

    public double getTotalValorVendas() {
        return totalValorVendas;
    }

    public void setTotalValorVendas(double totalValorVendas) {
        this.totalValorVendas += totalValorVendas;
    }

}
