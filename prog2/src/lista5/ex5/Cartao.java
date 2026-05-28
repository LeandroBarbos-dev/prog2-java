package lista5.ex5;

public class Cartao extends Pagamento{
	
	private int totalParcelas;
	private int parcelasPagas;
	private double valorTotal;
	
	
	
	
	public Cartao(String pagador, double valor, int desconto) {
		super(pagador, valor, false);
		this.totalParcelas = totalParcelas;
		this.parcelasPagas = 0;
		this.valorTotal = this.valor+valor*0.02;
	}



	@Override
	public void imprime() {
		if(pago) {
			System.out.println(" -- Conta paga -- "
					+"Metodo: Pix"
					+"Pagador: "+ this.pagador
					+"Valor: R$"+ this.valor
					+"Juros: 2%" 
					+"Total de parcelas: "+ this.totalParcelas
					+"Parcelas pagas: "+ this.parcelasPagas
					+"Valor Total: R$"+ this.valorTotal
					+"Valor pago: R$"+(this.valorPago));
		}else {
			System.out.println(" -- Conta NÃo paga -- "
					+"Metodo: Pix"
					+"Pagador: "+ this.pagador
					+"Valor: R$"+ this.valor
					+"Juros: 2%" 
					+"Total de parcelas: "+ this.totalParcelas
					+"Parcelas pagas: "+ this.parcelasPagas
					+"Valor Total: R$"+ this.valorTotal
					+"Valor pago: R$"+(this.valorPago));
		}
		
	}



	@Override
	public void processarPagamento() {
		if(!pago) {
			this.valorPago +=this.valorTotal/this.totalParcelas;
			this.parcelasPagas++;
			if(this.totalParcelas == this.parcelasPagas) {
				this.pago = true;
			}
			System.out.println("Parcela paga no cartão de credito");
		}else
			System.out.println("Essa conta ja foi paga");
		

	}

}