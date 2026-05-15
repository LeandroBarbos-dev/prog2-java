package prova1.questao8;

public class Aluno extends Usuario{
	private String matricula;
	private String curso;
	
	
	public Aluno(String cpf, String nome, String matricula, String curso) {
		super(cpf, nome);
		this.matricula = matricula;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return ("Aluno - nome: "+super.getNome() +"("+this.matricula+") - Curso: "
	+ this.curso +" - Saldo:  "+super.getSaldo());
	}
	
	
	
	
}
