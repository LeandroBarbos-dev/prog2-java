package lista5.ex7;

public abstract class Conta {

	protected String titular;
	protected int numeroConta;
	protected double saldo;
	private static int contador = 1000;

	public Conta(String titular, double saldoInicial) {
		contador++;
		this.titular = titular;
		this.numeroConta = contador;
		this.saldo = saldoInicial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void exibirDados() {

		System.out.println("Titular: " + titular);
		System.out.println("Conta: " + numeroConta);
		System.out.println("Saldo: R$ " + saldo);
	}

	public abstract double sacar(double valor);

	public abstract void depositar(double valor);
}
