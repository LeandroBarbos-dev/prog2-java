package lista2.ex11;

import java.time.LocalDate;

public class Consultas {
	LocalDate data;
	String procedimento;
	String horario;
	String nomeCliente;
	String pet;
	
	public void imprimeInfo() {
        System.out.println("\nCliente: " + nomeCliente + 
                           " \n\t| Pet: " + pet + 
                           " \n\t| Procedimento: " + procedimento + 
                           " \n\t| Data: " + data + 
                           " \n\t| Horário: " + horario);
    }
}
