package exemplos.exp19;


public abstract class Pessoa {
    
    private String cpf;
    private String nome;
    private String endereco;
    
    // perceba que foi utilizada sobrecarga de métodos no construtor da classe Pessoa e no método setCpf
    
    public Pessoa(String cpf, String nome, String end) {
        System.out.println("Instanciando um objeto da classe Pessoa com parâmetros de inicialização dos atributos.");
        this.setCpf(cpf);
        this.setNome(nome);
        this.setEndereco(end);
    }
    
    public Pessoa(int cpf, String nome, String end) {
        System.out.println("Instanciando um objeto da classe Pessoa com parâmetros de inicialização dos atributos.");
        this.setCpf(cpf);
        this.setNome(nome);
        this.setEndereco(end);
    }
    
    public void setCpf(String str) {
        this.cpf = str;
    }
    
    public void setCpf(int cpf) {
        this.cpf = String.valueOf(cpf);
    }
    
    public void setNome(String str) {
        this.nome = str;
    }
    
    public void setEndereco(String end) {
        this.endereco = end;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    // método abstrato -> qual implicação ao se definir um método como abstrato?
    public abstract void imprimeInfo();
}
