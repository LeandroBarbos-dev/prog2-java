package prova1.questao10;


public class Retangulo extends Figura{
	private double lado, base;

	public Retangulo(String cor, double lado, double base) {
		super(cor);
		this.lado = lado;
		this.base = base;
	}

	@Override
	public double perimetro() {
		return ((this.lado*2)+(base*2));
	}

	@Override
	public String toString() {
		return ("A figura é um Retangulo de cor "+super.getCor()+" e prerimetro "+this.perimetro());
	}
	
	
	
}