package lista3.ex7;

/* Sistema Biblioteca versão 3: definição da classe Livro */
public class Livro {
    
    private String isbn = "";
    private String nome = "";
    private String autores = "";
    private int edicao;
    private String idioma = "";
    private int anoPublicado = 0;
    private String editora = "";
    private boolean disponivel = false;
    private boolean emprestado = false;
    private boolean reservado = false;
    
    public Livro() {
        System.out.println("Instanciando um objeto da classe Livro - construtor vazio.\n");
    }
    
   
    public Livro(String isbn, String nome, String autores, int edicao, String idioma, int anoPublicado,String editora) {
    	System.out.println("Instanciando um objeto da classe Livro usando construtor com parâmetros para inicialização dos atributos.\n");
		this.isbn = isbn;
		this.nome = nome;
		this.autores = autores;
		this.edicao = edicao;
		this.idioma = idioma;
		this.anoPublicado = anoPublicado;
		this.editora = editora;
	}


	public int getAnoPublicado() {
		return anoPublicado;
	}


	public void setAnoPublicado(int anoPublicado) {
		this.anoPublicado = anoPublicado;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
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

	// metodo para imprimir informacoes do livro
    public void imprimeInfo() {
        System.out.println(this.isbn + " - " + this.nome + "(" + this.autores + "). Ed. " + this.edicao+ ". editora: " + this.editora+ ". ano: " + this.anoPublicado + 
            ". Idioma = " + this.idioma + ". Disponivel: " + this.disponivel + ". Emprestado: " + this.emprestado + ". Reservado: " + this.reservado);
    }
    
}


