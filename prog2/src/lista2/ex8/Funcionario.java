package lista2.ex8;

public class Funcionario {
    String cpf;
    String nome;
    String cargo;
    double diaria;
    int diasTrab;
    
    public void imprimeInfo() {
        System.out.println(this.nome + "(" + this.cpf + ") - " + this.cargo + " : " + this.diaria + ":" + this.diasTrab);
    }
}
