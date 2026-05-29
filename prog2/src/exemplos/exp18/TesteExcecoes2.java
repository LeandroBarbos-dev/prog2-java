package exemplos.exp18;


import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TesteExcecoes2  {
    
    public static void main(String args[]) {
        
        Scanner entrada = new Scanner(System.in);
        
        double num1 = 0, num2 = 0, result = 0;
        
        try {
            System.out.println("Informe o valor do numero 1: ");
            num1 = entrada.nextInt();
            System.out.println("Informe o valor do numero 2: ");
            num2 = entrada.nextInt();
            
            result = divisao(num1, num2);
            System.out.println("Resultado: " + result);
        } catch(InputMismatchException  e) {
            System.out.println("Entrada de dados invalida.");
        } catch(ArithmeticException e) {
            System.out.println("Divisao por zero.");
        } finally {
            System.out.println("Esse trecho de codigo sempre sera executado, com ou sem ocorrencia de excecao.");
        }
        
        System.out.println("Fim do programa, bye...");
      
    }
    
    public static double divisao(double a, double b) {
        if(b == 0.0)    
            throw new ArithmeticException();
        return a / b;
    }
}
