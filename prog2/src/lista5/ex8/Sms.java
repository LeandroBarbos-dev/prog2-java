package lista5.ex8;

class Sms extends Mensagem {

    public Sms(String texto) {
        super(texto);
    }

    @Override
    public void enviar() {
        String criptografada = Criptografia.criptografar(texto);

        System.out.println("SMS enviado: " + criptografada);
    }
}