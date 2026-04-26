package lista2.ex10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex10 {
	public static void main(String args[]) {
        
        final int QntAgendamentos = 2;
        Scanner entrada = new Scanner(System.in);
        
        Agendamento listaAgendamentos[] = new Agendamento[QntAgendamentos];
        String data, horario;
        int tipo;
        
       
        
        
        for(int i = 0; i < QntAgendamentos; i++) {
        	
        	
            
        	listaAgendamentos[i] = new Agendamento();
            System.out.println("\nServico " + (i+1) );
            System.out.println("Clinete: ");
            listaAgendamentos[i].nomeCliente = entrada.nextLine();
            System.out.println("Animal: ");
            listaAgendamentos[i].pet = entrada.nextLine();
            
            System.out.println("Tipo:\n1-Banho\n2-Tosa\n3-Banho e Tosa\nEscolha(1-2-3):");
            
            do{
            	tipo = entrada.nextInt();
            }while(tipo<1 || tipo>3);
            
            switch(tipo) {
            case 1:
            	listaAgendamentos[i].servico = "Banho";
            	break;
            case 2:
            	listaAgendamentos[i].servico = "Tosa";
            	break;
            case 3:
            	listaAgendamentos[i].servico = "Banho e Tosa";
            	break;
            }
            entrada.nextLine(); 
            System.out.println("Data(dd/MM/yyyy):");
            data = entrada.nextLine();
            DateTimeFormatter formData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            listaAgendamentos[i].data = LocalDate.parse(data, formData);
            
            System.out.println("Horario(HH:mm):");
            listaAgendamentos[i].horario = entrada.nextLine();
            
            
            
           
        } 
        entrada.close();
        gerarRelatorioAgenda(listaAgendamentos);        
       
    }
 
    public static void gerarRelatorioAgenda(Agendamento[] listaAgendamentos) {
        System.out.println("\nAgenda:");
        for (int i = 0; i < listaAgendamentos.length; i++) {
        	listaAgendamentos[i].imprimeInfo();
        	
		}
        
    }
}
