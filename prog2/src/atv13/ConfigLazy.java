package atv13;

public class ConfigLazy {
    private static ConfigLazy instancia;

    private ConfigLazy() { System.out.println(">> Criando ConfigLazy"); }

    public static ConfigLazy getInstancia() {
        if (instancia == null) {
            instancia = new ConfigLazy();
        }
        return instancia;
    }

    public static void main(String[] args) {
        System.out.println("main começou");
        ConfigLazy c = ConfigLazy.getInstancia();
        System.out.println("Instância obtida");
    }
}