package lista1;

import java.util.Random;
import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		double notas[] = new double[40];
		double media = 0;
		int qntAbaixo = 0;
		Scanner scn = new Scanner(System.in);
		Random rdn = new Random();
		
		
		for(int i = 0; i < notas.length; i++) {
			//notas[i] = scn.nextDouble();
			notas[i] = rdn.nextDouble(10);
			media += notas[i];
		}
		media/=notas.length;
		
		System.out.printf("[ Media ] [ %.2f ]\n",media);
		System.out.println("[ Notas ] [ Estado ]");
		for(int i = 0; i < notas.length; i++) {
			String estado;
			if(notas[i]>=media) {
				estado = "Acima";
			}else {
				estado = "Abaixo";
				qntAbaixo++;
			}
			System.out.printf("[ %.2f ] [ %s ]\n", notas[i], estado);
		}
		System.out.printf("[ Alunos abaixo da media ] [ %d ]\n",qntAbaixo);

	}

}
