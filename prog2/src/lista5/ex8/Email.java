package lista5.ex8;

public class Email extends Mensagem {

    public Email(String texto) {
        super(texto);
    }

    @Override
    public void enviar() {
        System.out.println("Email enviado: " + texto);
    }
}
