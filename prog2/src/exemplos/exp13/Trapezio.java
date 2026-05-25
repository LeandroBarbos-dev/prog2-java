package exemplos.exp13;

public class Trapezio extends FiguraGeometrica implements IFigura2D{
	int base, topo, altura;
	
	public Trapezio(int b,int t,int a, String cor) {
		super("Trapezio", cor);
		this.base = b;
		this.topo = t;
		this.altura = a;
	}  
	
	public double perimetro() {
		double aux = (this.base - this.topo)/2.0;
        return  (Math.sqrt(aux*aux+altura*altura)*2+this.base+this.topo);
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public double area() {
        return ((this.base + this.topo)/2)*this.altura;
    }
    
    // o que acontecerá se excluir esse método?
    @Override
    public void desenha() {
    	 double passo = (double)(base - topo) / altura;

    	    for (int i = 0; i < altura; i++) {
    	    	double espacos;
    	        double largura = (topo + passo * i);
    	        if(largura%2==0)
    	        	largura++;
    	        if(base>topo)
    	        	espacos = (base - largura) / 2;
    	        else
    	        	espacos = (topo - largura) / 2;

    	        for (int j = 0; j < espacos; j++) {
    	            System.out.print("  ");
    	        }

    	        for (int j = 0; j < largura; j++) {
    	            System.out.print("..");
    	        }

    	        System.out.println();
    	    }
    	
    }
    public String toString() {
        return "Figura " + this.getID() + ": " + this.getTipo() + "(" + this.getCor() + ")\n\tPerimetro:"+this.perimetro()+"\n\tArea: "+this.area();
    }
}
