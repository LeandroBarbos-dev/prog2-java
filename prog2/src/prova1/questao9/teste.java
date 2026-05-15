package prova1.questao9;

public class teste {

	public static void main(String[] args) {
		System.out.println("caso 1");
		Data d1 = new Data(22,11,2021);
		System.out.println(d1.toString());
		d1.avancar();
		System.out.println(d1.toString());
		System.out.println("caso 2");
		Data d2 = new Data(28,2,2021);
		System.out.println(d2.toString());
		d2.avancar();
		System.out.println(d2.toString());
		System.out.println("caso 3");
		Data d3 = new Data(30,4,2021);
		System.out.println(d3.toString());
		d3.avancar();
		System.out.println(d3.toString());
		System.out.println("caso 4");
		Data d4 = new Data(31,12,2021);
		System.out.println(d4.toString());
		d4.avancar();
		System.out.println(d4.toString());
	}

}
