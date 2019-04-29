package secao12Exercicios;

public class Moto {
	private String marca;
	private String modelo;
	private String cor;
	private int marcha =5;
	
	
	public Moto(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo =  modelo;
		this.cor = cor;
		this.marcha = marcha;
		
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor=cor;
	}
	
	public int getMarcha() {
		return this.marcha;
	}
	
	public void setMarcha(int marcha) {
		this.marcha=marcha;
	}

	public void imprimeMoto() {
		System.out.println("Dados da moto" + "\nMarca: " + getMarca() + "\nModelo: " + getModelo()+ 
				"\nCor: " +getCor() + "\nMarcha: " + getMarcha() + " \nMoto ligada:" +motorLigado(false));
	}
	
	public int marchaAcima() {
		this.marcha = marcha+1;
		if (marcha > 5) {
			marcha = 5;
		}
		return marcha;
	}
	
	public int marchaAbaixo() {
		this.marcha = marcha-1;
		if (marcha <0) {
			marcha = 0;
		}
		return marcha;
	}
	
	public boolean motorLigado(boolean ligado) {
		return true;
		
	}
}

