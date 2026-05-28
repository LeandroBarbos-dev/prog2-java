package lista5.ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Pagamento> list = new ArrayList<>();
		
		list.add(new Boleto("Leandro", 1000, new LocalDate()));

	}

}
