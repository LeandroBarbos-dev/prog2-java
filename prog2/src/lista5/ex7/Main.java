package lista5.ex7;

public class Main {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente("Leandro", 1000);
		cc.exibirDados();
		cc.depositar(300);
		cc.sacar(200);
		System.out.println("Saldo atual: R$ " + cc.getSaldo());
		System.out.println();

		
		ContaPoupanca cp = new ContaPoupanca("Padrim", 2000, 0.05);
		cp.exibirDados();
		cp.depositar(500);
		cp.render();
		cp.sacar(300);
		System.out.println("Saldo atual: R$ " + cp.getSaldo());
	}
}
