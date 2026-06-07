package atv12.p4;

public class SaldoInsuficienteException extends Exception {
    private final double faltam;

    public SaldoInsuficienteException(double faltam) {
        super("Saldo insuficiente. Faltam R$ " + faltam);
        this.faltam = faltam;
    }
    public SaldoInsuficienteException(double faltam, Throwable causa) {
        super("Saldo insuficiente. Faltam R$ " + faltam, causa);
        this.faltam = faltam;
    }


    public double getFaltam() { return faltam; }
}
