package atv13;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {
    private static final Configuracao INSTANCIA = new Configuracao();
    private final Map<String, String> valores = new HashMap<>();

    private Configuracao() {
        // valores padrão carregados uma única vez
        valores.put("idioma", "pt-BR");
        valores.put("tema", "claro");
    }

    public static Configuracao getInstancia() { return INSTANCIA; }

    public String get(String chave) { return valores.get(chave); }
    public void set(String chave, String valor) { valores.put(chave, valor); }
}