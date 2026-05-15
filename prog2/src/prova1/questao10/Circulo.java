package prova1.questao10;

public class Circulo extends Figura{
	private double raio;

	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double perimetro() {
		return (this.raio*3.14*2);
	}

	@Override
	public String toString() {
		return ("A figura é um Circulo de cor "+super.getCor()+" e prerimetro "+this.perimetro());
	}
	
	
	
}
