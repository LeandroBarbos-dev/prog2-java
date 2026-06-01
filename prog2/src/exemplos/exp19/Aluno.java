package exemplos.exp19;


public class Aluno extends Pessoa {
    
    private String matricula = "";
    private float nota = -99;
    
    // perceba que foi utilizada sobrecarga de métodos no construtor da classe Aluno e no método setMatricula
    
    public Aluno(String cpf, String nome, String end, String mat) {
        super(cpf, nome, end);
        System.out.println("Instanciando um objeto da classe Aluno com parâmetros de inicialização dos atributos.\n");
        this.setMatricula(mat);
    }
    
    public Aluno(String cpf, String nome, String end, int mat) {
        super(cpf, nome, end);
        System.out.println("Instanciando um objeto da classe Aluno com parâmetros de inicialização dos atributos.\n");
        this.setMatricula(mat);
    }
    
    public void setMatricula(String mat) {
        this.matricula = mat;
    }
    
    public void setMatricula(int mat) {
        this.matricula = String.valueOf(mat);
    }
    
    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public float getNota() {
        return this.nota;
    }
    
    // o que acontece se removermos esse método?
    public void imprimeInfo() {
        // o que acontece se tentarmos fazer a chamada como no comando abaixo? Por que isso acontece?
        //System.out.println(this.nome + "(" + this.matricula + ") : " + this.nota);
        System.out.println(super.getNome() + "(" + this.getMatricula() + ") : " + this.getNota());
    }
}


