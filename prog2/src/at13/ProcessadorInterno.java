package at13;

public class ProcessadorInterno implements ProcessadorPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Processador interno: cobrando R$ " + valor);
    }
}
