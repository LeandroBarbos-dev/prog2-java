package lista4.ex7;

/* Sistema Biblioteca versão 5: definição da classe Monografia como subclasse de ItemAcervo */
public class Monografia extends ItemAcervo {
    
    private String curso;
    
    public Monografia(String isbn, String nome, String autores, String lang, String curso, int ano) {
        super(isbn, nome, autores, lang, ano);
        System.out.println("Instanciando um objeto da classe Monografia usando construtor com parâmetros para inicialização dos atributos.\n");
        this.curso = curso;
    }
    
    // metodos set
    public void setCurso(String str) {
        this.curso = str;
    }
    
    // metodos get
    public String getCurso() {
        return this.curso;
    }
    
    // metodo para imprimir informacoes do livro
    @Override
    public void imprimeInfo() {
        System.out.println(this.getId() + ". ISBN: " + this.getIsbn() + " - " + this.getNome() + "(" + this.getAutores() + "). Curso: " + this.getCurso() + ". Ano de publicacao: " + this.getAnoPublicacao() + 
            ". Idioma = " + this.getIdioma() + ". Disponivel: " + this.getDisponivel() + ". Emprestado: " + this.getEmprestado() + ". Reservado: " + this.getReservado());
    }
    
}

