package exemplos.exp13;

public abstract class FiguraGeometrica {
    
    private int id;
    private String cor;
    private String tipo;
    
    // contador de figuras criadas, usado para gerar ids únicos
    private static int count = 0;
    
    private FiguraGeometrica() {}
    
    protected FiguraGeometrica(String tipo, String cor) {
        FiguraGeometrica.count++;
        this.id = FiguraGeometrica.count;
        this.tipo = tipo;
        this.cor = cor;
    }
    
    public int getID() {
        return this.id;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    @Override
    public String toString() {
        return "Figura " + this.getID() + ": " + this.getTipo() + "(" + this.getCor() + ")";
    }
    
    
    
}
