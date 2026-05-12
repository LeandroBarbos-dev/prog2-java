package lista4.ex7;

/* Sistema Biblioteca versão 5: definição da classe Item do Acervo */
public class ItemAcervo {
    
    // atributos de classe utilizado para contar quantos objetos são criados
    private static int contador = 0; 
    
    private int id = 0; // identificador único atribuido a cada objeto criado com base no contador
    private String isbn;
    private String nome;
    private String autores;
    private String idioma;
    private int anoPublicacao;
    private boolean disponivel = false;
    private boolean emprestado = false;
    private boolean reservado = false;
    
    public ItemAcervo(String isbn, String nome, String autores, String lang, int ano) {
        System.out.println("Instanciando um objeto da classe ItemAcervo usando construtor com parâmetros para inicialização dos atributos.\n");
        ItemAcervo.contador++;
        this.id = ItemAcervo.contador;
        this.isbn = isbn;
        this.nome = nome;
        this.autores = autores;
        this.idioma = lang;
        this.anoPublicacao = ano;
    }
    
    // metodos set
    public void setIsbn(String str) {
        this.isbn = str;
    }
    public void setNome(String str) {
        this.nome = str;
    }
    public void setAutores(String str) {
        this.autores = str;
    }
    public void setIdioma(String str) {
        this.idioma = str;
    }
    public void setAnoPublicacao(int ano) {
        this.anoPublicacao = ano;
    }
    public void setDisponivel(boolean disp) {
        this.disponivel = disp;
    }
    public void setEmprestado(boolean emp) {
        this.emprestado = emp;
    }
    public void setReservado(boolean res) {
        this.reservado = res;
    }
    
    // metodos get
    public int getId() {
        return this.id;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public String getNome() {
        return this.nome;
    }
    public String getAutores() {
        return this.autores;
    }
    public String getIdioma() {
        return this.idioma;
    }
    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }
    public boolean getDisponivel() {
        return this.disponivel;
    }
    public boolean getEmprestado() {
        return this.emprestado;
    }
    public boolean getReservado() {
        return this.reservado;
    }
    public static int getCont() {
    	return contador;
    }
        
    // metodo para imprimir informacoes do livro
    public void imprimeInfo() {
        System.out.println(this.getId() + ". ISBN: " + this.getIsbn() + " - " + this.getNome() + "(" + this.getAutores() + "). " + ". Ano de publicacao: " + this.getAnoPublicacao() + 
            ". Idioma = " + this.getIdioma() + ". Disponivel: " + this.getDisponivel() + ". Emprestado: " + this.getEmprestado() + ". Reservado: " + this.getReservado());
    }
    
}

