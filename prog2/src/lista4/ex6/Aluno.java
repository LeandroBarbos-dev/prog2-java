package lista4.ex6;

/* Sistema Biblioteca versão 4: definição da classe Aluno como subclasses de Usuario */
public class Aluno extends Usuario {
    
    // atributos de objeto
    private String matricula;
    private String curso;
    
    public Aluno(String cpf, String nome, String mat, String curso) {
        super(cpf, nome);
        System.out.println("Instanciando um objeto da classe Aluno usando construtor com parâmetros para inicialização dos atributos.\n");
        this.matricula = mat;
        this.curso = curso;
    }
    
    public void setMatricula(String str) {
        this.matricula = str;
    }
    public void setCurso(String str) {
        this.curso = str;
    }
    
    public String getMatricula() {
        return this.matricula;
    }
    public String getCurso() {
        return this.curso;
    }
    
    @Override
    public void imprimeInfo() {
        System.out.println(super.getId() + " - " + super.getNome() + " (" + super.getCpf() + ") (" + this.getMatricula() + " - " + this.getCurso() + "): saldo = " + super.getSaldo());
    }
}

