package atv12.p4;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) { this.saldo = saldoInicial; }

    public void sacar(double valor) throws SaldoInsuficienteException {
    	try {
            if (valor > saldo) {
                // Simulando uma falha técnica interna (ex: divisão por zero)
                int quebraCalculo = 10 / 0; 
            }
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo: R$ " + saldo);
        } catch (ArithmeticException erroOriginal) {
            // Captura o erro técnico e relança como SaldoInsuficienteException,
            // passando o 'erroOriginal' como a causa raiz do problema.
            throw new SaldoInsuficienteException(valor - saldo, erroOriginal);
        }
    }

    public static void main(String[] args) {
        Conta c = new Conta(100.0);
        try {
            c.sacar(30.0);
            c.sacar(90.0);   // deve falhar
        } catch (SaldoInsuficienteException e) {
            System.out.println("Operação negada: " + e.getMessage());
            System.out.println("Valor faltante: R$ " + e.getFaltam());
            System.out.println("Causa raiz original: " + e.getCause());
        }
    }
}

