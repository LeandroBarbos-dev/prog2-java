package lista2.ex10;

import java.time.LocalDate;

public class Agendamento {
	
		LocalDate data;
		String servico;
		String horario;
		String nomeCliente;
		String pet;
		
		public void imprimeInfo() {
	        System.out.println("\nCliente: " + nomeCliente + 
	                           " \n\t| Pet: " + pet + 
	                           " \n\t| Serviço: " + servico + 
	                           " \n\t| Data: " + data + 
	                           " \n\t| Horário: " + horario);
	    }
	}


