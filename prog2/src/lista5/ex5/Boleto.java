package lista5.ex5;

import java.time.LocalDate;

public class Boleto extends Pagamento{

	LocalDate dataVencimento;
	
	
	
	public Boleto(String pagador, double valor, LocalDate dataVencimento) {
		super(pagador, valor, false);
		this.dataVencimento = dataVencimento;
	}



	@Override
	public void processarPagamento() {
		if(!pago) {
			this.valorPago = this.valor;
			this.pago = true;
			System.out.println("Conta paga no boleto");
		}else
			System.out.println("Essa conta ja foi paga");
		

	}


	@Override
	public void imprime() {
		
		if(pago) {
			System.out.println(" -- Conta paga -- "
					+" Metodo: Boleto"
					+" Pagador: "+ this.pagador
					+" Valor: R$"+ this.valor
					+" Desconto: R$"+ 0
					+" Valor pago: R$"+this.valorPago);
		}else {
			System.out.println(" -- Conta NÃo paga -- "
					+" Metodo: Boleto"
					+" Pagador: "+ this.pagador
					+" Valor: R$"+ this.valor
					+" Desconto: R$"+ 0
					+" Valor pago: R$"+this.valorPago);
		}
		
	}
	
	

}
