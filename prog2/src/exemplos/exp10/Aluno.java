package exemplos.exp10;

/*
Sistema acadêmico versão 9: herança, sobrescrita, ocultação de atributos, sobrecarga, polimorfismo, vinculação dinâmica de métodos, classes e métodos abstratos
*/
public class Aluno extends Pessoa {

private String matricula = "";
private static int qtdAlunosCadastrados = 0;

public Aluno(String cpf, String nome, String mat, String end) {
    super(cpf, nome, end);
    this.setMatricula(mat);
    Aluno.qtdAlunosCadastrados++;
}    
public void setMatricula(String mat) { this.matricula = mat; }
public String getMatricula() { return this.matricula; }    
// o que acontece se removermos esse método? O que acontece se sobrescrevermos o método herdado com o uso da notação @override e sem o uso da notação?
/*
public void imprimeInfo() {
    //super.imprimeInfo();  // o que esse comando irá fazer?
    System.out.println(super.getID() + ". " + this.getMatricula() + ": " + super.getNome());
}
*/
}

