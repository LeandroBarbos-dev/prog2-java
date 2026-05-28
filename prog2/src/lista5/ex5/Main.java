package lista5.ex5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Pagamento> list = new ArrayList<>();
		
		list.add(new Boleto("Leandro", 1000, LocalDate.of(2026, 8, 15)));
		list.add(new Pix("Isabella", 800, 10));
		list.add(new Cartao("Padrim", 1200, 4));
		
		imprime(list);
		
		list.get(1).processarPagamento();
		list.get(2).processarPagamento();
		list.get(2).processarPagamento();
		list.get(2).processarPagamento();
		
		imprime(list);
		
		list.get(2).processarPagamento();
		list.get(2).imprime();
	}
	
	public static void imprime(List<Pagamento> list) {
		for (Pagamento pagamento : list) {
			pagamento.imprime();
		}
	}

}
