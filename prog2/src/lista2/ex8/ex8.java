package lista2.ex8;

/* Sistema de folha de pagamentos */
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class ex8 {
    public static void main(String args[]) {
        
        final int QTDFUNCIONARIOS = 2;
        Scanner entrada = new Scanner(System.in);
        
        Funcionario listaFuncionarios[] = new Funcionario[QTDFUNCIONARIOS];
    
        // leitura das informações dos funcionários
        for(int i = 0; i < QTDFUNCIONARIOS; i++) {
            // instanciação do objeto da classe funcionario para cada elemento do vetor
            listaFuncionarios[i] = new Funcionario();
            System.out.println("\nFuncionario " + (i+1) );
            System.out.println("CPF: ");
            listaFuncionarios[i].cpf = entrada.nextLine();
            System.out.println("Nome: ");
            listaFuncionarios[i].nome = entrada.nextLine();
            System.out.println("Diaria:");
            listaFuncionarios[i].diaria = entrada.nextFloat();
            System.out.println("Dias Trabalhados:");
            listaFuncionarios[i].diasTrab = entrada.nextInt();
            entrada.nextLine(); // esvazia o buffer do teclado
        } 
        
        gerarFolhaPagamento(listaFuncionarios);        
        System.out.printf("\n\nTotal da folha de pagamentos: R$%.2f\n", calcularTotalFolha(listaFuncionarios));
    }
    
    public static void gerarFolhaPagamento(Funcionario[] listaFunc) {
        // IMPRIMIR TODAS AS INFORMAÇÕES DOS FUNCIONÁRIOS
        System.out.println("\nFolha:");
        for (int i = 0; i < listaFunc.length; i++) {
        	System.out.println("Nome: "+listaFunc[i].nome);
        	System.out.printf("Valor da Diaria: R$%.2f\n",listaFunc[i].diaria);
        	System.out.printf("Salario: R$%.2f\n",listaFunc[i].diaria * listaFunc[i].diasTrab);
		}
        
    }
    
    public static double calcularTotalFolha(Funcionario[] listaFunc) {
        // CALCULAR E RETORNAR O TOTAL DA FOLHA DE PAGAMENTO
    	double valor=0;
    	for (int i = 0; i < listaFunc.length; i++) {
    		valor+=listaFunc[i].diaria * listaFunc[i].diasTrab;
			
		}
        return valor;
    }
}
