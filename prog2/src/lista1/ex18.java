package lista1;

import java.util.Random;
import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		int v1[] = new int[5];
		int v2[] = new int[5];
		int v3[] = new int[10];
		Scanner scn = new Scanner(System.in);
		Random rdn = new Random();
		
		for(int i = 0; i < v1.length; i++) {
			//v2[i] = scn.nextInt();
			v1[i] = rdn.nextInt(10);
		}
		for(int i = 0; i < v2.length; i++) {
			//v2[i] = scn.nextInt();
			v2[i] = rdn.nextInt(10);
		}
		
		for(int i = 0; i < (10); i+=2) {
			v3[i] = v1[i/2];
		}
		for(int i = 1; i < (10); i+=2) {
			v3[i] = v2[i/2];
		}
		System.out.println("\nv1");
		for(int i = 0; i < v1.length; i++) {
			System.out.print("["+v1[i]+"]");
		}
		System.out.println("\nv2");
		for(int i = 0; i < v2.length; i++) {
			System.out.print("["+v2[i]+"]");
		}
		System.out.println("\nv3");
		for(int i = 0; i < v3.length; i++) {
			System.out.print("["+v3[i]+"]");
		}

	}

}
