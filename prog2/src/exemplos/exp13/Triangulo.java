package exemplos.exp13;

public class Triangulo extends FiguraGeometrica implements IFigura2D {
    
    private int lado1, lado2, lado3;
    
    public Triangulo(int l1, int l2, int l3, String cor) {
        super("TRIANGULO", cor);
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public double perimetro() {
        return this.lado1+this.lado2+this.lado3;
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public double area() {
    	double s = this.perimetro()/2;
        return Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public void desenha() {
    	for (int i = this.lado1; i > 0; i--) {
    		for (int j = 0; j < i ; j++) {
    			System.out.print("  ");
    		}
    		for (int j = this.lado1; j > i ; j--) {
    			System.out.print("..");
    		}
    		for (int j = this.lado1; j > i-1 ; j--) {
    			System.out.print("..");
    		}
    		System.out.println();
		}
    }
    public String toString() {
        return "Figura " + this.getID() + ": " + this.getTipo() + "(" + this.getCor() + ")\n\tPerimetro:"+this.perimetro()+"\n\tArea: "+this.area();
    }
    
}
