package at13;

public class Loja {
    private final ProcessadorPagamento processador;

    public Loja(ProcessadorPagamento processador) {
        this.processador = processador;
    }

    public void finalizarCompra(double total) {
        System.out.println("Finalizando compra de R$ " + total);
        processador.pagar(total);
    }

    public static void main(String[] args) {
    	
//        Loja loja = new Loja(new ProcessadorInterno());
//        loja.finalizarCompra(150.0);
    	
    	Loja loja = new Loja(new GatewayPagSeguro());
    	
    	
    }
}