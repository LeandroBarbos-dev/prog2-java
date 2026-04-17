package lista1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		double a,b,c;
		double delta, x1, x2;
		Scanner scn = new Scanner(System.in);
		System.out.println("Insira os valores:");
		System.out.println("a: ");
		a = scn.nextDouble();
		System.out.println("b: ");
		b = scn.nextDouble();
		System.out.println("c: ");
		c = scn.nextDouble();
		
		System.out.println("\nEquação: "+a+"x² "+sign(b)+"x "+sign(c)+"\n");
		delta = calcDelta(a,b,c);
		x1 = calcX1(a,b,delta);
		x2 = calcX2(a,b,delta);
		System.out.println("Delta = "+delta);
		System.out.println("x1 = "+x1);
		System.out.println("x2 = "+x2);
		
	}
	
	public static double calcDelta(double a, double b, double c) {
		return b*b - 4*a*c;
	}
	
	public static double calcX1(double a, double b, double delta) {
		return (-b +Math.sqrt(delta))/2*a;
	}
	
	public static double calcX2(double a, double b, double delta) {
		return (-b -Math.sqrt(delta))/2*a;
	}
	
	public static String sign(double x){
		if(x<0) {
			return("- "+(-1*x));
		}
		return("+ "+x);
	}

}
