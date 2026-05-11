package lista4.ex6;

/* Sistema Biblioteca versão 4: definição da classe Professor como subclasse de Usuario */
public class Professor extends Usuario {
    
    // atributos de objeto
    private String siape; // codigo de identificacao unico para identificar servidores da UFOP
    private String departamento;
    
    public Professor(String cpf, String nome, String siape, String dept) {
        super(cpf, nome);
        System.out.println("Instanciando um objeto da classe Professor usando construtor com parâmetros para inicialização dos atributos.\n");
        this.siape = siape;
        this.departamento = departamento;
    }
    
    public void setSiape(String str) {
        this.siape = str;
    }
    public void setDepartamento(String str) {
        this.departamento = str;
    }
    
    
    public String getSiape() {
        return this.siape;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    
    @Override
    public void imprimeInfo() {
       System.out.println(super.getId() + " - " + super.getNome() + " (" + super.getCpf() + ") (" + this.getSiape() + " - " + this.getDepartamento() + "): saldo = " + super.getSaldo());
    }
}
