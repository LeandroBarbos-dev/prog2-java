package lista3.ex6;
/* Sistema Biblioteca versão 2: definição da classe Livro */
public class Livro {
    private String isbn = "";
    private String nome = "";
    private String autores = "";
    private int edicao;
    private String idioma = "";
    private boolean disponivel = false;
    private boolean emprestado = false;
    private boolean reservado = false;
    
    public Livro() {
    	
    }
    
    public Livro(String isbn, String nome, String autores, int edicao, String idioma) {
		super();
		this.isbn = isbn;
		this.nome = nome;
		this.autores = autores;
		this.edicao = edicao;
		this.idioma = idioma;
	}
    
    public void imprimeInfo() {
    	  System.out.println(this.nome + " - " + this.edicao + " " + this.idioma 
    			  +" ( " + this.isbn + " )\n Autores:" + this.autores);
    }
    
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAutores() {
		return autores;
	}
	
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	public int getEdicao() {
		return edicao;
	}
	
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public boolean isEmprestado() {
		return emprestado;
	}
	
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	public boolean isReservado() {
		return reservado;
	}
	
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
}
