package atv13;

public class Logger {
    public static Logger instancia;      // (2) atributo estático
    private int contador = 0;

    private Logger() {                     // (1) construtor privado
        System.out.println(">> Criando a instância de Logger");
    }

    public static Logger getInstancia() {  // (3) acesso estático (lazy)
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String mensagem) {
        contador++;
        System.out.println("[" + contador + "] " + mensagem);
    }

   
}
