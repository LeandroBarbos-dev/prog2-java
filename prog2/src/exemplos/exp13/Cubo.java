package exemplos.exp13;

public class Cubo extends FiguraGeometrica implements IFigura3D{
	  private int lado;
	    
	    public Cubo(int lado, String cor) {
	        super("Cubo", cor);
	        this.lado =lado;
	    }
	    
	    // o que acontecerá se excluir esse método?
	   
	    
	    // o que acontecerá se excluir esse método?
	    @Override
	    public double volume() {
	        return lado*lado*lado;
	    }
	    
	    // o que acontecerá se excluir esse método?
	    @Override
	  
	    public void desenha() {
	    	for (int i = 0; i < 1.5*this.lado; i++) {
	    		for (int j = 0; j < 1.5*this.lado; j++) {
	    			if((i>this.lado && j<i-this.lado)||(j>this.lado+i))
	    				System.out.print("  ");
	    			else
	    				System.out.print("..");
	    		}
	    		System.out.println();
			}
	    } 
	    
	    public String toString() {
	        return "Figura " + this.getID() + ": " + this.getTipo() + "(" + this.getCor() + ")\n\tVolume:"+this.volume();
	    }
}
