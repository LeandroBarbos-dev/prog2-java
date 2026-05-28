package lista5.ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Funcionario> list = new ArrayList<>();
		
		list.add(new Cozinheiro("Leandro","111.111.111-11",286));
		list.add(new Entregador("Padrim","222.222.222-22",350));
		list.add(new Garcom("Isabella","333.333.333-33",320));
		
		listar(list);
	}
	
	public static void listar(List<Funcionario> list) {
		for (Funcionario funcionario : list) {
			funcionario.exibirDados();
		}
	}

}
