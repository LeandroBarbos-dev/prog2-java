package lista2.ex11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex11 {
public static void main(String args[]) {
        
        final int QntConsultas = 2;
        Scanner entrada = new Scanner(System.in);
        
        Consultas listaConsulta[] = new Consultas[QntConsultas];
        String data, horario;
        int tipo;
        
        
        for(int i = 0; i < QntConsultas; i++) {
        	
        	
            
        	listaConsulta[i] = new Consultas();
            System.out.println("\nConsulta " + (i+1) );
            System.out.println("Cliente: ");
            listaConsulta[i].nomeCliente = entrada.nextLine();
            System.out.println("Pet: ");
            listaConsulta[i].pet = entrada.nextLine();
            
            System.out.println("Procedimento:");
            listaConsulta[i].procedimento = entrada.nextLine();
            
            System.out.println("Data(dd/MM/yyyy):");
            data = entrada.nextLine();
            DateTimeFormatter formData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            listaConsulta[i].data = LocalDate.parse(data, formData);
            
            System.out.println("Horario(HH:mm):");
            listaConsulta[i].horario = entrada.nextLine();
       
        } 
        entrada.close();
        gerarRelatorioAgenda(listaConsulta);        
       
    }
 
    public static void gerarRelatorioAgenda(Consultas[] listaConsulta) {
        System.out.println("\nAgenda:");
        for (int i = 0; i < listaConsulta.length; i++) {
        	listaConsulta[i].imprimeInfo();
        	
		}
        
    }
}
