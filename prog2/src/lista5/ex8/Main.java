package lista5.ex8;

public class Main {

    public static void main(String[] args) {

        Mensagem m1 = new Email("Olá Padrim");
        Mensagem m2 = new WhatsApp("Sua senha é 123");
        Mensagem m3 = new Sms("Mensagem secreta");

        m1.enviar();
        m2.enviar();
        m3.enviar();

    }
}
