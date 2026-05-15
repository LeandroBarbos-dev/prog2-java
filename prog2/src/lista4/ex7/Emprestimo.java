package lista4.ex7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* Sistema Biblioteca versão 4: definição da classe Emprestimo */
public class Emprestimo {
    
    private static int contador = 0;
    
    private int id;
    private String cpf = ""; // cpf do usuario que pegou livro emprestado
    private String isbn = ""; // isbn do livro que foi emprestado
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private int prazo; // quantidade de dias limite para devoluao do livro
    private boolean devolucaoAtrasada = false;
    private double valorMulta = 0;
    
    public Emprestimo() {
        System.out.println("Instanciando um objeto da classe Emprestimo - construtor vazio.\n");
        // atualizacao do contador e atribuicao do valor ao id do novo objeto Emprestimo
        contador++;
        this.id = contador;
    }
    
    public Emprestimo(String cpf, String isbn, LocalDate dataEmp, int prazo) {
        System.out.println("Instanciando um objeto da classe Emprestimo usando construtor com parâmetros para inicialização dos atributos.\n");
        // atualizacao do contador e atribuicao do valor ao id do novo objeto Emprestimo
        contador++;
        this.id = contador;
        
        this.cpf = cpf;
        this.isbn = isbn;
        this.dataEmprestimo = dataEmp;
        this.prazo = prazo;
        
        // TODO: necessario verificar se entrega atrasada e calcular valor da multa
    }
    
    
        
    public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Emprestimo.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public boolean isDevolucaoAtrasada() {
		return devolucaoAtrasada;
	}

	public void setDevolucaoAtrasada(boolean devolucaoAtrasada) {
		this.devolucaoAtrasada = devolucaoAtrasada;
	}

	public double getValorMulta() {
		return valorMulta;
	}

	public void setValorMulta(double valorMulta) {
		this.valorMulta = valorMulta;
	}
	
	public long verificarAtraso() {
	    LocalDate dataLimite = this.dataEmprestimo.plusDays(this.prazo);
	    long diasAtraso = ChronoUnit.DAYS.between(dataLimite, this.dataDevolucao);
	    if(diasAtraso > 0) {
	        this.devolucaoAtrasada = true;
	        return diasAtraso;
	    }
	    this.devolucaoAtrasada = false;
	    return 0;
	}
	
	public double calcularMulta() {
	    long diasAtraso = verificarAtraso();
	    valorMulta = diasAtraso * 2.5;
	    return valorMulta;
	}

	// metodo para imprimir informacoes do livro
    public void imprimeInfo() {
        System.out.println("Emprestimo " + this.id + ". Usuario: " + this.cpf + ". Livro: " + this.isbn + ". Data do emprestimo: " + this.dataEmprestimo + 
            ". Data da devolucao: " + this.dataDevolucao + ". Prazo: " + this.prazo + " dias. Devolucao atrasada: " + this.devolucaoAtrasada + ". Multa: " + this.valorMulta);
    }
    
}
