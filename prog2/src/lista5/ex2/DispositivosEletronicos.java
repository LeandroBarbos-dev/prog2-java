package lista5.ex2;

public abstract class DispositivosEletronicos {
	protected String marca;
	protected boolean ligado;
	
	
	
	public DispositivosEletronicos(String marca) {
		this.marca = marca;
		this.ligado = false;
	}

	public void ligar() {
		ligado = true;
		System.out.println("Aparelho ligado!");
	}
	
	public void desligar() {
		ligado = false;
		System.out.println("Aparelho desligado!");
	}

	public abstract double consumoEnergetico();
}
