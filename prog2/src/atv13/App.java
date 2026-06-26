package atv13;

public class App {
    public static void main(String[] args) {
        TelaInicial tela = new TelaInicial();
        Preferencias prefs = new Preferencias();

        tela.mostrar();              // lê o valor inicial
       // prefs.mudarParaEscuro();     // altera em outra classe
        tela.mostrar();              // lê de novo
    }
}
