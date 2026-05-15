package prova1.questao9;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	private Data() {}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return ( this.dia + "/" + this.mes + "/" + this.ano);
	}
	
	public void avancar() {
		if(this.mes == 2 && (this.dia+1)>28) {
			this.mes++;
			this.dia = 1;
		}else {
			if((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && (this.dia+1)>30) {
				this.mes++;
				this.dia = 1;
			}else {
				if((this.dia+1) > 31) {
					this.dia = 1;
					if((this.mes+1) > 12) {
						this.mes = 1;
						this.ano++;
					}else
						this.mes++;
				}else
					this.dia++;
			}
			
		}
		
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
	
	
	
}
