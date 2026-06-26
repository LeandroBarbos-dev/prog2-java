package sistema;

import sistema.control.Sistema;

public class Programa {

	// Alunos: Isabella Senra e Leandro Barbosa - T1
	public static void main(String[] args) {
		Sistema system = Sistema.getInstance();
		system.iniciar();
	}
}