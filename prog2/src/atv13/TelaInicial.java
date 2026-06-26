package atv13;

class TelaInicial {
    void mostrar() {
        System.out.println("Tema atual: " + Configuracao.getInstancia().get("tema"));
    }
}
