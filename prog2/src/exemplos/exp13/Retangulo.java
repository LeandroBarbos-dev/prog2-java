package exemplos.exp13;

public class Retangulo extends FiguraGeometrica implements IFigura2D {
    
    private int comprimento, largura;
    
    public Retangulo(int comprimento, int largura, String cor) {
        super("RETANGULO", cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public double perimetro() {
        return 2 * this.comprimento + 2 * this.largura;
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public double area() {
        return this.comprimento * this.largura;
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public void desenha() {
    	for (int i = 0; i < this.comprimento; i++) {
    		for (int j = 0; j < this.largura; j++) {
    			System.out.print("..");
    		}
    		System.out.println();
		}
    } 
   
    public String toString() {
        return "Figura " + this.getID() + ": " + this.getTipo() + "(" + this.getCor() + ")\n\tPerimetro:"+this.perimetro()+"\n\tArea: "+this.area();
    }
}
