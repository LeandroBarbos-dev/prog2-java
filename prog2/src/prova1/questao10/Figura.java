package prova1.questao10;

public abstract class Figura {
	private String cor;

	public Figura(String cor) {
		this.cor = cor;
	}
	
	public abstract double perimetro();
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	
	
}
