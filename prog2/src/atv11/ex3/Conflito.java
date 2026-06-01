package atv11.ex3;

public class Conflito {
    public static void sum(int a, int b) {
        System.out.println("Sum of int: " + (a + b));
    }
    public static void sum(double a, double b) {
        System.out.println("Sum of double: " + (a + b));
    }
    public static void main(String[] args) {
        sum(1, 2);					//int    3
        sum(1.1, 2.2);				//double 3.3000000000000003
        sum(1, 2.2);				//double 3.2
        sum((int) 1.1, (int) 2.2);	//int	 3
    }
}

