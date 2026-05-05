package lista3.ex6;
/* Sistema Biblioteca versão 2: definição da classe Aluno */
public class Aluno {
    
    private String cpf = "";
    private String matricula = "";
    private String nome = "";
    private double saldo = 0;
    private boolean inadimplente = false;
    private boolean possuiEmprestimo = false;
    private boolean possuiReserva = false;
    
    public Aluno() {
        System.out.println("Instanciando um objeto da classe Aluno - construtor vazio.\n");
    }
    
    public Aluno(String cpf, String mat, String nome) {
        System.out.println("Instanciando um objeto da classe Aluno usando construtor com parâmetros para inicialização dos atributos.\n");
        this.cpf = cpf;
        this.matricula = mat;
        this.nome = nome;
    }
    
    public void setCpf(String str) {
        this.cpf = str;
    }
    
    public void setMatricula(String str) {
        this.matricula = str;
    }
    
    public void setNome(String str) {
        this.nome = str;
    }
    
    public void setSaldo(double valor) {
        this.saldo = valor;
    }
    
    public void setInadimplente(boolean status) {
        this.inadimplente = status;
    }
    
    public void setPossuiEmprestimo(boolean status) {
        this.possuiEmprestimo = status;
    }
    
    public void setPossuiReserva(boolean status) {
        this.possuiReserva = status;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public boolean getInadimplente() {
        return this.inadimplente;
    }
    
    public boolean getPossuiEmprestimo() {
        return this.possuiEmprestimo;
    }
    
    public boolean getPossuiReserva() {
        return this.possuiReserva;
    }
    
    public void imprimeInfo() {
        System.out.println(this.matricula + " - " + this.nome + "(" + this.cpf + "): saldo = " + this.saldo + 
            ". Status = " + this.inadimplente + ". Possui emprestimo: " + this.possuiEmprestimo + ". Possui reserva: " + this.possuiReserva + ".\n");
    }
}

