package lista4.ex7;

import java.time.LocalDate;

public class Reserva {

    private static int contador = 0;

    private int id;
    private String cpf;
    private String isbn;
    private LocalDate dataReserva;
    
    public Reserva() {

        contador++;
        this.id = contador;
    }
    
    public Reserva(String cpf, String isbn, LocalDate dataReserva) {
		this.cpf = cpf;
		this.isbn = isbn;
		this.dataReserva = dataReserva;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Reserva.contador = contador;
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

	public LocalDate getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(LocalDate dataReserva) {
		this.dataReserva = dataReserva;
	}

	
}
