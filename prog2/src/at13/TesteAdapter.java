package at13;

public class TesteAdapter {
    public static void main(String[] args) {
        GatewayPagSeguro gateway = new GatewayPagSeguro();
        ProcessadorPagamento adaptado = new AdaptadorPagSeguro(gateway);

        Loja loja = new Loja(adaptado);   // agora a Loja aceita!
        loja.finalizarCompra(150.0);
    }
}
