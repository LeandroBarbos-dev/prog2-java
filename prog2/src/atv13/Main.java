package atv13;

public class Main {

	 public static void main(String[] args) {
	        Logger a = Logger.getInstancia();
	        a.log("Primeira mensagem");
	        
	        Logger b = Logger.getInstancia();
	        b.log("Segunda mensagem");

	        
	        
	        System.out.println("a == b ? " + (a == b));
	        System.out.println("Mesmo objeto (hashCode): "
	            + (a.hashCode() == b.hashCode()));
	    }
	
}
