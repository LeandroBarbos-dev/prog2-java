package lista5.ex5;

public class Pix extends Pagamento{
	
	private int desconto;
	
	public Pix(String pagador, double valor, int desconto) {
		super(pagador, valor, false);
		this.desconto = desconto;
	}

	@Override
	public void imprime() {
		if(pago) {
			System.out.println(" -- Conta paga -- "
					+" Metodo: Pix"
					+" Pagador: "+ this.pagador
					+" Valor: R$"+ this.valor
					+" Desconto: R$"+ this.valor*(desconto/100)
					+" Valor pago: R$"+(this.valor-this.valor*(desconto/100)));
		}else {
			System.out.println(" -- Conta NÃo paga -- "
					+" Metodo: Pix"
					+" Pagador: "+ this.pagador
					+" Valor: R$"+ this.valor
					+" Desconto: R$"+ this.valor*(desconto/100)
					+" Valor pago: R$"+this.valorPago);
		}
		
	}

	@Override
	public void processarPagamento() {
		if(!pago) {
			this.valorPago = valor - valor*desconto;
			this.pago = true;
			System.out.println("Conta paga no pix");
		}else
			System.out.println("Essa conta ja foi paga");
		

	}

}
