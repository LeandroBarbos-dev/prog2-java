package lista1;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		double alcool, gasolina;
		Scanner scn = new Scanner(System.in);
		System.out.println("Alcool x Gasolina");
		
		System.out.println("Insira valo do Alcool:");
		alcool = scn.nextDouble();
		
		System.out.println("Insira valo da gasolina:");
		gasolina = scn.nextDouble();
		
		if (alcool <= 0.7*gasolina) {
			System.out.println("Alcool tem melhor custo-beneficio");
		}else {
			System.out.println("Gasolina tem melhor custo-beneficio");
		}
	}

}
