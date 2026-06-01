package atv11.ex1;

public class Square {
    
	 public static double square(int a) {
	        System.out.println("Square of int: " + a);
	        return a * a;
	    }
    public static double square(double a) {
        System.out.println("Square of double: " + a);
        return a * a;
    }
    public static long square(long a) {
    	 System.out.println("Square of long: " + a);
         return a * a;
    }
    public static void main(String[] args) {
        square(1);
        square(1L);
        square(1.0);
        square('a');
    }
}
