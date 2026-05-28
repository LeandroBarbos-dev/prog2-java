package exemplos.exp13;

public class Esfera extends FiguraGeometrica implements IFigura3D{
	  private int raio;
	    
	    public Esfera(int raio, String cor) {
	        super("Cubo", cor);
	        this.raio =raio;
	    }
	    
	    @Override
	    public double volume() {
	        return 4/3*3.14*raio*raio*raio;
	    }
	    
	    @Override
	  
	    public void desenha() {

	        int r = this.raio;

	        double luzX = r * 1.7;
	        double luzY = r * 0.3;

	        for (int i = 0; i < r * 2; i++) {

	            for (int j = 0; j < r * 2; j++) {

	                double dx = j - r;
	                double dy = i - r;

	                double distCentro = Math.sqrt(dx * dx + dy * dy);

	                if (distCentro < r) {

	                    double distLuz = Math.sqrt(
	                        (j - luzX) * (j - luzX) +
	                        (i - luzY) * (i - luzY)
	                    );

	                    double brilho = distLuz / (r * 2);

	                    if (brilho < 0.30)
	                        System.out.print("░░");
	                    else if (brilho < 0.45)
	                        System.out.print("▒▒");
	                    else if (brilho < 0.65)
	                        System.out.print("▓▓");
	                    else
	                        System.out.print("██");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	    
	    public String toString() {
	        return "Figura " + this.getID() + ": " + this.getTipo() + "(" + this.getCor() + ")\n\tVolume:"+this.volume();
	    }
}
