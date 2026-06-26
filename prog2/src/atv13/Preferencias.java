package atv13;

class Preferencias {
    void mudarParaEscuro() {
        Configuracao.getInstancia().set("tema", "escuro");
        System.out.println("Tema alterado em Preferencias");
    }
}
