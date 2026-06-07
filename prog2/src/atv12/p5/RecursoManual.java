package atv12.p5;

public class RecursoManual implements AutoCloseable {
    private final String nome;
    public RecursoManual(String nome) {
        this.nome = nome;
        System.out.println("Abrindo recurso: " + nome);
    }
    public void usar() { System.out.println("Usando recurso: " + nome); }
    
    @Override public void close() { System.out.println("Fechando recurso: " + nome); }

    public static void main(String[] args) {
    	try (RecursoManual a = new RecursoManual("A");
    		     RecursoManual b = new RecursoManual("B")) {
    		    a.usar();
    		    b.usar();
    		}

    }

}

