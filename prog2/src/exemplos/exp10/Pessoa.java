package exemplos.exp10;

/*
Sistema acadêmico versão 9: herança, sobrescrita, ocultação de atributos, sobrecarga, polimorfismo, vinculação dinâmica de métodos, classes e métodos abstratos
*/
public abstract class Pessoa {
private static int contId;
private String cpf;
private String nome;
private String endereco;
private int id = 0;

protected Pessoa(String cpf, String nome, String end) {
    this.setCpf(cpf);
    this.setNome(nome);
    this.setEndereco(end);
    this.id = this.contId++;
}

public void setCpf(String str) { this.cpf = str; }
public void setNome(String str) { this.nome = str; }
public void setEndereco(String end) { this.endereco = end; }
public String getCpf() { return this.cpf; }
public String getNome() { return this.nome; }
public int getID() { return id; }
public String getEndereco() { return this.endereco; }

public void imprimeInfo() {
    System.out.println(this.getID() + ". Nome: " + this.getNome() + " (" + this.getCpf() + ")");
}

}

