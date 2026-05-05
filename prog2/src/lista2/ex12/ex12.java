package lista2.ex12;

import java.util.Scanner;

public class ex12 {
	 public static void main(String args[]) {
	        
	        final int QTDAtividades = 2;
	        Scanner entrada = new Scanner(System.in);
	        
	        Atividade listaAtividades[] = new Atividade[QTDAtividades];
	    
	        System.out.println("\nNome da atividade:  ");
	        String nomeAtividade = entrada.nextLine();
	        for(int i = 0; i < QTDAtividades; i++) {
	            // instanciação do objeto da classe funcionario para cada elemento do vetor
	            listaAtividades[i] = new Atividade();
	            listaAtividades[i].nomeAtividade = nomeAtividade;
	            System.out.println("\nAtividade aluno " + (i+1) );
	            System.out.println("Nome do aluno: ");
	            listaAtividades[i].aluno = entrada.nextLine();
	            System.out.println("Matricula: ");
	            listaAtividades[i].matricula = entrada.nextLine();
	            System.out.println("Nota:");
	            listaAtividades[i].nota = entrada.nextFloat();
	            entrada.nextLine(); // esvazia o buffer do teclado
	        } 
	        
	        gerarRelatorioAtividade(listaAtividades);        
	        System.out.printf("\nA media da nota da atividade é: %.1f\n", calcularMedia(listaAtividades));
	    }
	    
	    public static void gerarRelatorioAtividade(Atividade[] listaAtividades) {
	        // IMPRIMIR TODAS AS INFORMAÇÕES DOS FUNCIONÁRIOS
	    	System.out.println("------------------------------------");
	        System.out.println(listaAtividades[0].nomeAtividade+":");
	        System.out.println("------------------------------------");
	        for (int i = 0; i < listaAtividades.length; i++) {
	        	System.out.println("Nome: "+listaAtividades[i].aluno+"("+listaAtividades[i].aluno+")");
	        	System.out.printf("Nota: %.1f\n",listaAtividades[i].nota);
	        	System.out.println("--------------");
			}
	        
	    }
	    
	    public static double calcularMedia(Atividade[] listaAtividades) {
	        // CALCULAR E RETORNAR O TOTAL DA FOLHA DE PAGAMENTO
	    	double media=0;
	    	for (int i = 0; i < listaAtividades.length; i++) {
	    		media+=listaAtividades[i].nota;
				
			}
	        return media/listaAtividades.length;
	    }
}
