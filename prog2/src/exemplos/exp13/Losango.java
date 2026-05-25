package exemplos.exp13;

public class Losango extends FiguraGeometrica implements IFigura2D{
private int lado;
	
	
	public Losango(int l, String cor) {
		super("Losango", cor);
		this.lado = l;
	}  
	
	public double perimetro() {
        return this.lado * 4;
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public double area() {
    	
        return this.lado*this.lado;
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public void desenha() {
    	int r = (int)Math.sqrt((lado*lado)/2);
    	for (int i = r; i > 0; i--) {
    		for (int j = 0; j < i ; j++) {
    			System.out.print("  ");
    		}
    		for (int j = r; j > i ; j--) {
    			System.out.print("..");
    		}
    		for (int j = r; j > i-1 ; j--) {
    			System.out.print("..");
    		}
    		System.out.println();
		}
    	for (int i = 0; i <= r; i++) {
    		for (int j = 0; j < i ; j++) {
    			System.out.print("  ");
    		}
    		for (int j = r; j > i ; j--) {
    			System.out.print("..");
    		}
    		for (int j = r; j > i-1 ; j--) {
    			System.out.print("..");
    		}
    		System.out.println();
		}
    }
    public String toString() {
        return "Figura " + this.getID() + ": " + this.getTipo() + "(" + this.getCor() + ")\n\tPerimetro:"+this.perimetro()+"\n\tArea: "+this.area();
    }
}
