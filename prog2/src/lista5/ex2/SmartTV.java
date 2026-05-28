package lista5.ex2;

public class SmartTV extends DispositivosEletronicos implements Configuravel{

	private int volume;
	
	public SmartTV(String marca) {
		super(marca); 
		volume = 50;
	}

	@Override
	public void configurar(String config) {
		
		System.out.println("Configuração definida: \n\t"+config);
	}

	@Override
	public void ligar() {
		ligado = true;
		System.out.println("Televisão ligada!");
	}
	
	public void ligar(int volume) {
		ligado = true;
		this.volume = volume;
		System.out.println("Aparelho ligado!\nVolume definido em: "+this.volume);
	}

	@Override
	public double consumoEnergetico() {
		
		return 20;
	}

}
