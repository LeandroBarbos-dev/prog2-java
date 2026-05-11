package lista4.ex5;

/* Sistema Biblioteca versão 3: definição da classe Professor como subclasse de Usuario */
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

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
    
	@Override
    public void imprimeInfo() {
        System.out.println(this.getId() + " - " + this.getNome() + " (" + this.getCpf() + ") - SIAPE: "+this.siape+" -saldo = " + this.getSaldo());
    }
    
}

