package lista2.ex10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import lista2.ex9.Veiculo;

public class ex10 {
	public static void main(String args[]) {
        
        final int QntAgendamentos = 2;
        Scanner entrada = new Scanner(System.in);
        
        Agendamento listaAgendamentos[] = new Agendamento[QntAgendamentos];
        String data, horario;
        int tipo;
        
        Servico banho = new Servico("Banho",50,40);
        Servico tosa = new Servico("Tosa",80,50);
        Servico banhoETosa = new Servico("Banho e Tosa",110,90);
        
        
        
        for(int i = 0; i < QntAgendamentos; i++) {
        	
            
        	listaAgendamentos[i] = new Servico();
            System.out.println("\nServico " + (i+1) );
            System.out.println("Clinete: ");
            listaAgendamentos[i].nomeCliente = entrada.nextLine();
            System.out.println("Animal: ");
            listaAgendamentos[i].animal = entrada.nextLine();
            
            System.out.println("Tipo:\n1-Banho\n2-Tosa\n3Banho e Tosa\nEscolha(1-2-3):");
            tipo = entrada.nextInt();
            switch(tipo) {
            case 1:
            	listaAgendamentos[i].servico = banho;
            	break;
            case 2:
            	listaAgendamentos[i].servico = tosa;
            	break;
            case 3:
            	listaAgendamentos[i].servico = banhoETosa;
            	break;
            }
            entrada.nextLine(); 
            System.out.println("Data(dd/MM/yyyy):");
            data = entrada.nextLine();
            DateTimeFormatter formData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            listaAgendamentos[i].data = LocalDate.parse(data, formData);
            
            System.out.println("Horario(HH:mm):");
            listaAgendamentos[i].horario = entrada.nextLine();
            
            
            
           
            entrada.nextLine(); 
        } 
        entrada.close();
        gerarRelatorioAgenda(listaAgendamentos);        
       
    }
 
    public static void gerarRelatorioAgenda(Servico[] listaServicos) {
        System.out.println("\nAgenda:");
        for (int i = 0; i < listaServicos.length; i++) {
        	listaServicos[i].imprimeInfo();
        	
		}
        
    }
}
