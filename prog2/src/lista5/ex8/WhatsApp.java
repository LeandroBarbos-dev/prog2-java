package lista5.ex8;

public class WhatsApp extends Mensagem {

    public WhatsApp(String texto) {
        super(texto);
    }

    @Override
    public void enviar() {
        String criptografada = Criptografia.criptografar(texto);

        System.out.println("WhatsApp enviado: " + criptografada);
    }
}
