package lista5.ex7;

public class ContaPoupanca extends Conta implements Rentavel {

	private double taxaRendimento;

	public ContaPoupanca(String titular, double saldoInicial, double taxaRendimento) {
		super(titular, saldoInicial);
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public double sacar(double valor) {

		if (valor > saldo) {
			System.out.println("Saldo insuficiente.");
			return 0;
		}

		saldo -= valor;
		System.out.println("Saque realizado.");
		return valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$ " + valor + " realizado.");
	}

	@Override
	public void render() {
		double rendimento = saldo * taxaRendimento;
		saldo += rendimento;
		System.out.println("Rendimento aplicado: R$ " + rendimento);
	}
}
