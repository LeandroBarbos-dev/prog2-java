package lista2.ex7;

public class Funcionario {
    String cpf;
    String nome;
    String cargo;
    double salario;
    
    public void imprimeInfo() {
        System.out.println(this.nome + "(" + this.cpf + ") - " + this.cargo + " : " + this.salario);
    }
}
