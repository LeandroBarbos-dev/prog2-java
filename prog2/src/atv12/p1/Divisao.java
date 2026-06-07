package atv12.p1;

public class Divisao {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30};
        System.out.println("Início");
        try {
            System.out.println(valores[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
        	e.printStackTrace();
        }
        System.out.println("Fim");
        
        
    }
}
