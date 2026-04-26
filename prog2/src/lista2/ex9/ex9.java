package lista2.ex9;

import java.util.Scanner;



public class ex9 {
	 public static void main(String args[]) {
	        
	        final int QntVeiculos = 2;
	        Scanner entrada = new Scanner(System.in);
	        
	        Veiculo listaVeiculos[] = new Veiculo[QntVeiculos];
	        
	        for(int i = 0; i < QntVeiculos; i++) {
	        	
	            
	            listaVeiculos[i] = new Veiculo();
	            System.out.println("\nVeiculo " + (i+1) );
	            System.out.println("Modelo: ");
	            listaVeiculos[i].modelo = entrada.nextLine();
	            System.out.println("Marca: ");
	            listaVeiculos[i].marca = entrada.nextLine();
	            System.out.println("Preço:");
	            listaVeiculos[i].preco = entrada.nextFloat();
	            
	           
	            entrada.nextLine(); 
	        } 
	        entrada.close();
	        gerarRelatorioVendas(listaVeiculos);        
	        System.out.printf("\n\nPreço total das vendas: R$%.2f\n", calcularTotalVendas(listaVeiculos));
	    }
	 
	    public static void gerarRelatorioVendas(Veiculo[] listaVeic) {
	        System.out.println("\nFolha:");
	        for (int i = 0; i < listaVeic.length; i++) {
	        	listaVeic[i].imprimeInfo();
	        	//System.out.println("Veiculo: "+listaVeic[i].modelo+" ( "+listaVeic[i].marca +" )");
	        	//System.out.printf("Preço: R$%.2f\n\n",listaVeic[i].preco);
			}
	        
	    }
	    
	    public static double calcularTotalVendas(Veiculo[] listaVeic) {
	    	double valor=0;
	    	for (int i = 0; i < listaVeic.length; i++) {
	    		valor+=listaVeic[i].preco;
				
			}
	        return valor;
	    }
}
