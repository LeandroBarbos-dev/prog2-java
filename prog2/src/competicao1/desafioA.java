package competicao1;

import java.util.Scanner;

public class desafioA {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int[] entrada = new int[n];

	        for (int i = 0; i < n; i++) {
	            entrada[i] = sc.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            int y = entrada[i];
	            int x = 0;

	            // bit menos significativo é igual
	            int prevBit = y & 1;
	            System.out.println(prevBit);
	            x |= prevBit;
	            System.out.println(x);

	            // reconstruir os outros bits
	            for (int b = 1; b < 8; b++) {
	            	System.out.println("rodadno "+b);
	                int yBit = (y >> b) & 1;
	                System.out.println(yBit);
	                int xBit = yBit ^ prevBit; // depende do bit anterior de x
	                System.out.println(xBit);
	                x |= (xBit << b);
	                System.out.println(x);
	                prevBit = xBit;
	                System.out.println(prevBit);
	            }

	            System.out.print(x + " ");
	        }

	        sc.close();
	    }
}
