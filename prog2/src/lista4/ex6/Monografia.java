package lista4.ex6;

/* Sistema Biblioteca versão 4: definição da classe Monografia */
public class Monografia extends Item{
    
    
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
    public void imprimeInfo() {
        System.out.println(super.getIsbn() + " - " + super.getNome() + "(" + super.getAutores() + "). Curso: " + this.getCurso() + ". Ano de publicacao: " + this.getAnoPublicacao() + 
            ". Idioma = " + super.getIdioma() + ". Disponivel: " + super.isDisponivel() + ". Emprestado: " + super.isEmprestado() + ". Reservado: " + super.isReservado());
    }
    
}

