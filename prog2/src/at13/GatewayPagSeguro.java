package at13;

public class GatewayPagSeguro {
    // recebe centavos (long) e a moeda, não reais (double)
    public void realizarTransacao(long centavos, String moeda) {
        System.out.println("PagSeguro: transação de " + centavos
            + " centavos (" + moeda + ")");
    }
}
