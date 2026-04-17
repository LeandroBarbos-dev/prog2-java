package lista1;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		double num1, num2, resultado;
		int op;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println(" Calculadora ");
		System.out.println("Primeiro numero:");
		num1 = scn.nextDouble();
		System.out.println("Segundo numero:");
		num2 = scn.nextDouble();
		
		do {
			System.out.println("Escolha a operação:");
			System.out.println(" 1 - ( + ) ");
			System.out.println(" 2 - ( - ) ");
			System.out.println(" 3 - ( * ) ");
			System.out.println(" 4 - ( / ) ");
			
			op = scn.nextInt();
		}while(op >4 || op <=0);
		
		System.out.println("\nResultado:");
		
		switch(op) {
		case 1:
			resultado = num1+num2; 
			System.out.printf("%.2f + %.2f = %.2f \n", num1, num2, resultado);
			break;
		
		case 2:
			resultado = num1-num2;
			System.out.printf("%.2f - %.2f = %.2f \n", num1, num2, resultado);
			break;
			
		case 3:
			resultado = num1*num2;
			System.out.printf("%.2f * %.2f = %.2f \n", num1, num2, resultado);
			break;
			
		case 4:
			if(num2 !=0) {
				resultado = num1+num2;
				System.out.printf("%.2f / %.2f = %.2f \n", num1, num2, resultado);
			}else {
				System.out.println("Não é possivel fazer divisão por 0");
			}
			break;
			
		}
			
	}
}
