package exemplos.exp8;

public class Professor {
	private String matricula = "";
	private String nome = "";
	
	public Professor() {
        System.out.println("\t[DEBUG]Instanciando um objeto da classe Aluno com construtor sem parâmetros.\n");
    }
    
    public Professor(String mat, String nome) {
        System.out.println("\t[DEBUG]Instanciando um objeto da classe Aluno com parâmetros de inicialização dos atributos.\n");
        this.matricula = mat;
        this.nome = nome;
    }

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return this.nome + "(" + this.matricula + ") ";
	}
	    
	public void imprimeInfo() {
		System.out.println(this.toString());
	}
}
