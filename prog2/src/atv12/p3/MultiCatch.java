package atv12.p3;

public class MultiCatch {
    public static void processar(int caso) {
        try {
            if (caso == 1) {
                int x = 10 / 0;                    // ArithmeticException
            } else if (caso == 2) {
                int[] v = new int[2];
                v[5] = 1;                          // ArrayIndexOutOfBoundsException
            } else {
                String s = null;
                s.length();                        // NullPointerException
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora dos limites");
        } catch (Exception e) {
            System.out.println("Outra exceção: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Bloco finally do caso " + caso);
        }
    }

    public static void main(String[] args) {
        processar(1);
        processar(2);
        processar(3);
    }
}

