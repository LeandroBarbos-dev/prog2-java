package at13;

public class AdaptadorPagSeguro implements ProcessadorPagamento {
    private final GatewayPagSeguro gateway;   // composição: contém o Adaptado

    public AdaptadorPagSeguro(GatewayPagSeguro gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pagar(double valor) {
        // TRADUÇÃO: reais (double) -> centavos (long) + moeda
        long centavos = Math.round(valor * 100);
        gateway.realizarTransacao(centavos, "BRL");
    }
}
