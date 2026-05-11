package lista4.ex6;

/* Sistema Biblioteca versão 4: definição da classe Livro */
public class Livro extends Item{
    
    
    private int edicao;
    
    
    public Livro(String isbn, String nome, String autores, String lang, int ed, int ano) {
    	super(isbn, nome, autores, lang, ano);
        System.out.println("Instanciando um objeto da classe Livro usando construtor com parâmetros para inicialização dos atributos.\n");
        this.edicao = ed;
    }
    
    // metodos set
    public void setEdicao(int ed) {
        this.edicao = ed;
    }
    
    
    // metodos get
    public int getEdicao() {
        return this.edicao;
    }
   
        
    // metodo para imprimir informacoes do livro
    public void imprimeInfo() {
        System.out.println(super.getIsbn() + " - " + super.getNome() + "(" + super.getAutores() + "). Ed. " + this.getEdicao() + ". Ano de publicacao: " + super.getAnoPublicacao() + 
            ". Idioma = " + super.getIdioma() + ". Disponivel: " + super.isDisponivel() + ". Emprestado: " + super.isEmprestado() + ". Reservado: " + super.isReservado());
    }
    
}

