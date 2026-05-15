package prova1.questao8;

public class Professor extends Usuario{
	private String siape;
	private String departamento;
	
	
	public Professor(String cpf, String nome, String siape, String departamento) {
		super(cpf, nome);
		this.siape = siape;
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return ("Professor - nome: "+super.getNome() +"("+this.siape+") - Departamento: "
	+ this.departamento +" - Saldo:  "+super.getSaldo());
	}
}
