package lista2.ex8;

public class Funcionario {
    String cpf;
    String nome;
    String cargo;
    double salario;
    
    public void imprimeInfo() {
        System.out.println(this.nome + "(" + this.cpf + ") - " + this.cargo + " : " + this.salario);
    }
    
    public double calculaSalario(int qtdDiasTrabalhados, double valorDiaria) {
        // IMPLEMENTAR
    	this.salario = qtdDiasTrabalhados * valorDiaria;
    	return this.salario;
    }
}
