package exemplos.exp8;


public class Disciplina {
    
    private String codigo;
    private String nome;
    
    public Disciplina(String cod, String nome) {
        System.out.println("\t[DEBUG]Instanciando um objeto da classe Disciplina.\n");
        this.setCodigo(cod);
        this.setNome(nome);
    }
    
    public void setCodigo(String cod) {
        this.codigo = cod;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void imprimeInfo() {
        System.out.println(this.getNome() + "(" + this.getCodigo() + ")");
    }
}

