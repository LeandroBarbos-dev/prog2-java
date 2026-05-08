package exemplos.exp10;

public class Professor extends Pessoa {
	
	private String codigoProfessor;
	private String departamento;
	
	
	public Professor(String cpf, String nome, String end, String codigoProfessor, String departamento) {
		super(cpf, nome, end);
		this.codigoProfessor = codigoProfessor;
		this.departamento = departamento;
	}

	public String getCodigoProfessor() {
		return codigoProfessor;
	}

	public void setCodigoProfessor(String codigoProfessor) {
		this.codigoProfessor = codigoProfessor;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public void imprimeInfo() {
		System.out.println("Professor: "+ super.getNome() + "(" + this.getCodigoProfessor() + ") - Departamento: "+this.departamento );
	}
	
	
	
}
