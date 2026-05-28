package lista5.ex8;

public class Criptografia {

	public static String criptografar(String texto) {
		String resultado = "";
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			c += 3; 
			resultado += c;
		}
		return resultado;
	}
	
	

}
