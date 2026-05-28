package lista5.ex5;

public abstract class Pagamento {

	protected String pagador;
	protected double valor;
	protected double valorPago;
	protected boolean pago;
	
	
	
	public Pagamento(String pagador, double valor, boolean pago) {
		this.pagador = pagador;
		this.valor = valor;
		this.pago = pago;
		this.valorPago = 0;
	}



	public abstract void processarPagamento();
	
	public abstract void imprime();
}
