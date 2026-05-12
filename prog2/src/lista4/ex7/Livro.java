package lista4.ex7;

/* Sistema Biblioteca versão 5: definição da classe Livro como subclasse de ItemAcervo */
public class Livro extends ItemAcervo {
    
    private int edicao;
    
    public Livro(String isbn, String nome, String autores, String lang, int ed, int ano) {
        super(isbn, nome, autores, lang, ano);
        System.out.println("Instanciando um objeto da classe Livro usando construtor com parâmetros para inicialização dos atributos.\n");
        this.edicao = ed;
    }
    
    public void setEdicao(int ed) {
        this.edicao = ed;
    }
    
    // metodos get
    public int getEdicao() {
        return this.edicao;
    }
    
    // metodo para imprimir informacoes do livro
    @Override
    public void imprimeInfo() {
        System.out.println(this.getId() + ". ISBN: " + this.getIsbn() + " - " + this.getNome() + "(" + this.getAutores() + "). Ed. " + this.getEdicao() + ". Ano de publicacao: " + this.getAnoPublicacao() + 
            ". Idioma = " + this.getIdioma() + ". Disponivel: " + this.getDisponivel() + ". Emprestado: " + this.getEmprestado() + ". Reservado: " + this.getReservado());
    }
    
}


