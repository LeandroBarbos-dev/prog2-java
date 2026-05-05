package exemplos.exp8;

public class Aluno {
    
    private String matricula = "";
    private String nome = "";
    
    public Aluno() {
        System.out.println("\t[DEBUG]Instanciando um objeto da classe Aluno com construtor sem parâmetros.\n");
    }
    
    public Aluno(String mat, String nome) {
        System.out.println("\t[DEBUG]Instanciando um objeto da classe Aluno com parâmetros de inicialização dos atributos.\n");
        this.setMatricula(mat);
        this.setNome(nome);
    }
    
    public void setMatricula(String mat) {
        this.matricula = mat;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public String toString() {
        return this.nome + "(" + this.matricula + ") ";
    }
    
    public void imprimeInfo() {
        System.out.println(this.toString());
    }
}

