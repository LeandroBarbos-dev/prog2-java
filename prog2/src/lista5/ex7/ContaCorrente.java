package lista5.ex7;

public class ContaCorrente extends Conta {

	

	public ContaCorrente(String titular, double saldoInicial) {
		super(titular, saldoInicial);
	}

	@Override
	public double sacar(double valor) {

		double valorTotal = valor;
		if (valorTotal > saldo) {
			System.out.println("Saldo insuficiente.");
			return 0;
		}
		saldo -= valorTotal;
		System.out.println("Saque realizado.");

		return valor;
	}

	@Override
	public void depositar(double valor) {

		saldo += valor;
		System.out.println("Depósito de R$ " + valor + " realizado.");
	}
}
