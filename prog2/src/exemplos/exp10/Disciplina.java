package exemplos.exp10;

/*
Sistema acadêmico versão 9: herança, sobrescrita, ocultação de atributos, sobrecarga, polimorfismo, vinculação dinâmica de métodos, classes e métodos abstratos
*/
public class Disciplina {

private String codigo;
private String nome;

public Disciplina(String cod, String nome) {
    this.setCodigo(cod);
    this.setNome(nome);
}

public void setCodigo(String cod) { this.codigo = cod; }
public void setNome(String nome) { this.nome = nome; }
public String getCodigo() { return this.codigo; }
public String getNome() { return this.nome; }

public void imprimeInfo() {
    System.out.println(this.getCodigo() + " - " + this.getNome());
}
}

