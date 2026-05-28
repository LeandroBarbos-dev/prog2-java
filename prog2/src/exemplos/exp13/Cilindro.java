package exemplos.exp13;

public class Cilindro extends FiguraGeometrica implements IFigura3D{
	  private int raio,altura;
	    
	    public Cilindro(int raio,int altura, String cor) {
	        super("Cilindro", cor);
	        this.raio =raio;
	        this.altura = altura;
	    }
	    
	    @Override
	    public double volume() {
	        return altura*raio*raio*3.14;
	    }
	   
	    @Override
	  
	    public void desenha() {
	    	int r = this.raio;
	    	for (int i = 0; i < this.raio; i++) {
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
	    	for (int i = 0; i < this.altura; i++) {
	    		System.out.print("  ");
	    		for (int j = 1; j < this.raio*2; j++) {
	    			System.out.print("..");
	    		}
	    		System.out.println();
			}
	    	for (int i = this.raio; i < this.raio*2; i++) {
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
