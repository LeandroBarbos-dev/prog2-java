package lista5.ex2;

public class SmartPhone  extends DispositivosEletronicos implements Configuravel{
	
	private int brilho;
	private int tempoTela;
	
	public SmartPhone(String marca) {
		super(marca);
		brilho = 70;
		tempoTela = 8;
	}
	
	
	@Override
	public void configurar(String config) {
		
		System.out.println("Configuração definida: \n\t"+config);
	}
	
	public void configurar(int brilho, int tempoTela) {
		this.brilho = brilho;
		this.tempoTela = tempoTela;
		System.out.println("Configuração definida: \n\tBrilho:"+this.brilho+"%\n\tTempode tela: "+this.tempoTela+"m");
	}

	@Override
	public void ligar() {
		ligado = true;
		System.out.println("SmartPhone ligado!");	
	}

	@Override
	public double consumoEnergetico() {
		if(ligado) 
			return 10;
		else
			return 5;
	}
}
