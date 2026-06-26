package prova2.q2;

public class Main {
	public static void main(String[] args) {
		FiguraGeometrica2D figs[] = new FiguraGeometrica2D[4];
		figs[0] = new Quadrado(4);
		figs[1] = new Retangulo(3,5);
		figs[2] = new Quadrado(6);
		figs[3] = new Retangulo(2,7);
		
		for (int i = 0; i < figs.length; i++) {
			System.out.println("Figura "+i+" - Perimetro: "+figs[i].calcPerimetro());
		}
 	}
}
