package atv13;

public class ConfigEager {
    private static final ConfigEager INSTANCIA = new ConfigEager(); // criada no carregamento da classe

    private ConfigEager() { System.out.println(">> Criando ConfigEager"); }

    public static ConfigEager getInstancia() { return INSTANCIA; }

    
}
