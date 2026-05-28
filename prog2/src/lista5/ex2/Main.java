package lista5.ex2;

public class Main {
	public static void main(String[] args) {
		SmartTV tv = new SmartTV("LG");
		SmartPhone cell = new SmartPhone("Sansumg");
		
		System.out.println(" -- SmartTV --");
		tv.ligar();
		System.out.println("Consumo energetico TV: "+ tv.consumoEnergetico());
		tv.configurar("Tamanho da tela 720p");
		tv.desligar();
		tv.ligar(80);
		
		System.out.println();
		
		System.out.println(" -- SmartPhone --");
		cell.ligar();
		System.out.println("Consumo energetico Cell ligado: "+ cell.consumoEnergetico());
		cell.configurar(100, 30);
		cell.desligar();
		System.out.println("Consumo energetico Cell desligado: "+ cell.consumoEnergetico());
		
	}
}
