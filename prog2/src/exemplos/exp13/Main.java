package exemplos.exp13;

public class Main {
    
    public static void main(String args[]) {
        
        IFigura2D figuras[] = new IFigura2D[8];
        IFigura3D figuras3d[]= new IFigura3D[3];
        
        // criando diferentes datas
        figuras[0] = new Retangulo(5, 3, "azul");
        
        figuras[1] = new Retangulo(5, 10, "amarelo");
        figuras[2] = new Retangulo(15, 3, "verde");
        figuras[3] = new Triangulo(5, 6, 8, "preto");
        figuras[4] = new Triangulo(3, 5, 3, "vermelho");
        
        figuras[5] = new Circulo(14, "vermelho");
        figuras[6] = new Trapezio(15,5,5, "azul");
        figuras[7] = new Losango(5, "Roxo");
        
        figuras3d[0] = new Cubo(5, "Amarelo");
        figuras3d[1] = new Esfera(5, "Roxo");
        figuras3d[2] = new Cilindro(5,10, "Rosa");
        
        
        
        
        
        //t.desenha();
        //System.out.println(figuras[4].area());
        
        System.out.println("Figuras criadas:");
        imprimeListaDeFiguras(figuras);
        imprimeDesenhoDeFiguras(figuras);
        
        imprimeListaDeFiguras(figuras3d);
        imprimeDesenhoDeFiguras(figuras3d);
        
    }
    
    public static void imprimeListaDeFiguras(IFigura2D listaFiguras[]) { 
    	System.out.println("Figuras 2d:");
        for (int i = 0; i < listaFiguras.length; i++)
            System.out.println(listaFiguras[i].toString() );
    }   
    
    public static void imprimeDesenhoDeFiguras(IFigura2D listaFiguras[]) { 
    	System.out.println("Figuras 2d:");
        for (int i = 0; i < listaFiguras.length; i++) {
        	System.out.println();
        	listaFiguras[i].desenha();
        }
    }   
    
    public static void imprimeListaDeFiguras(IFigura3D listaFiguras[]) { 
    	System.out.println("Figuras 3d:");
        for (int i = 0; i < listaFiguras.length; i++)
            System.out.println(listaFiguras[i].toString() );
    }   
    
    public static void imprimeDesenhoDeFiguras(IFigura3D listaFiguras[]) { 
    	System.out.println("Figuras 3d:");
        for (int i = 0; i < listaFiguras.length; i++) {
        	System.out.println();
        	listaFiguras[i].desenha();
        }
    }   
}

