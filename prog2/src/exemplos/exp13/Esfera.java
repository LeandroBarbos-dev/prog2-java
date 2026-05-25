package exemplos.exp13;

public class Esfera extends FiguraGeometrica implements IFigura3D{
	  private int raio;
	    
	    public Esfera(int raio, String cor) {
	        super("Cubo", cor);
	        this.raio =raio;
	    }
	    
	    // o que acontecerá se excluir esse método?
	   
	    
	    // o que acontecerá se excluir esse método?
	    @Override
	    public double volume() {
	        return 4/3*3.14*raio*raio*raio;
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
	        return "Figura " + this.getID() + ": " + this.getTipo() + "(" + this.getCor() + ")\n\tVolume:"+this.volume();
	    }
}
