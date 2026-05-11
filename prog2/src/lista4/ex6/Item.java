package lista4.ex6;

public class Item {
	private String isbn;
	private String nome;
	private String autores;
	private String idioma;
	private int anoPublicacao;
	private boolean disponivel = false;
	private boolean emprestado = false;
	private boolean reservado = false;
	
	public Item(String isbn, String nome, String autores, String lang, int ano) {
        System.out.println("Instanciando um objeto da classe Livro usando construtor com parâmetros para inicialização dos atributos.\n");
        this.isbn = isbn;
        this.nome = nome;
        this.autores = autores;
        this.idioma = lang;
        this.anoPublicacao = ano;
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

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
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
