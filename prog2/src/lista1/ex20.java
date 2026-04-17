package lista1;

import java.util.Random;
import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		int vet[] = new int[20];
		int num, qnt = 0;
		Scanner scn = new Scanner(System.in);
		Random rdn = new Random();
		
		
		for(int i = 0; i < vet.length; i++) {
			//vet[i] = scn.nextInt();
			vet[i] = rdn.nextInt(10);
		}
		
		
		
		System.out.println("[ Numeros ]");
		for(int i = 0; i < vet.length; i++) {
			
			System.out.printf("[ %d ]\n", vet[i]);
		}
		System.out.println("Buscar pelo numero:");
		num = scn.nextInt();
		for(int i = 0; i < vet.length; i++) {
			if(num == vet[i]) {
				qnt++;
			}
			
		}
		System.out.printf("[ Quantidade encontrada ] [ %d ]\n",qnt);

	}
}
