package exemplos.exp17;


import java.io.*;
import java.util.Scanner;

public class TesteExcecoes {
    
    public static void main(String args[]) {
        
        Scanner entrada = new Scanner(System.in);
        
        final int QTDPALAVRAS = 5;
        String listaPalavras[] = new String[QTDPALAVRAS];
        
        try {
            // imprimir o tamanho da string na posição zero
            System.out.println("Teste inicial: " + listaPalavras[0].length());
        } catch(NullPointerException e) {
            System.out.println("Ocorreu um erro inesperado.");
        }    
        
        try {
            // leitura das palavras pelo teclado
            for (int i = 0; i < QTDPALAVRAS; i++) {
                System.out.println("Digite a palavra " + (i+1) + ": ");
                listaPalavras[i] = entrada.nextLine();
            }
        
            // imprime quantidade de caracteres de cada palavra
            for (int i = 0; i <= QTDPALAVRAS; i++) {
                System.out.println("Palavra " + (i+1) + ": " + listaPalavras[i].length());
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocorreu um outro erro inesperado.");    
        }
        
        System.out.println("Fim do programa, bye...");
      
    }
}

