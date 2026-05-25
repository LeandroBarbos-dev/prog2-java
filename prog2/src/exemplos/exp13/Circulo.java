package exemplos.exp13;

public class Circulo extends FiguraGeometrica implements IFigura2D{
	private int raio;
	
	
	public Circulo(int r, String cor) {
		super("Circulo", cor);
		this.raio = r;
	}  
	
	public double perimetro() {
        return this.raio * 3.14 * 2;
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public double area() {
    	
        return 3.14*this.raio*this.raio;
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public void desenha() {
    	int r = this.raio;
    	for (int i = 0; i < this.raio*2; i++) {
    		for (int j = 0; j < this.raio*2; j++) {
    			if(Math.sqrt((i-r)*(i-r)+(j-r)*(j-r))<r) {
    				System.out.print("..");
    				//░ ▒ ▓  ▦ ▧ ▨ ▩
    			}else {
    				System.out.print("  ");
    			}
    		}
    		System.out.println();
		}
    }
    public String toString() {
        return "Figura " + this.getID() + ": " + this.getTipo() + "(" + this.getCor() + ")\n\tPerimetro:"+this.perimetro()+"\n\tArea: "+this.area();
    }
}
