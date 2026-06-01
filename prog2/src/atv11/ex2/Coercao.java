package atv11.ex2;

public class Coercao {
    public static void f(double x) {
        System.out.println(x);
    }
    public static void main(String[] args) {
        f(3.1416); 		// V  double -> double
        f((byte) 1);	// V  byte -> double
        f((short) 2);	// V  short -> double
        f('a');			// V  char -> double
        f(3);			// V  int -> double
        f(4L);			// V  long -> double
        f(5.6F);		// V  float -> double
        
    }
}
