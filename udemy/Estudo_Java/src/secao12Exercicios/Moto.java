package secao12Exercicios;

public class Moto {
	//
	private String marca;
	private String modelo;
	private String cor;
	private int marcha;
	private boolean ligarMoto = false;
	
	//metodo construtor exercicio 10
	public Moto(String marca, String modelo, String cor, int marcha, boolean ligarMoto) {
		this.marca = marca;
		this.modelo =  modelo;
		this.cor = cor;
		this.marcha = marcha;
		this.ligarMoto = ligarMoto;
		
		
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
	
	public boolean getLigarMoto() {
		return this.ligarMoto = ligarMoto;
	}
	
	public void setLigarMoto(boolean LigarMoto) {
		this.ligarMoto = ligarMoto;
		
	}

//	public void imprimeMoto() {
//		System.out.println("Dados da moto" + "\nMarca: " + getMarca() + "\nModelo: " + getModelo()+ 
//				"\nCor: " +getCor() + "\nMarcha: " + getMarcha() + " \nMoto ligada:" + getLigarMoto());
//	}
	
	public String toString() {
		return "Dados da moto: " + "\nMarca: " + getMarca() + "\nModelo: " 
				+ getModelo()+"\nCor: " +getCor() + "\nMarchaAtual: " + getMarcha() + "\nmoto ligada: "+getLigarMoto() ;
	
	}
	// Exercicio 11
	
	
	
	public int marchaAcima() {
		if (this.marcha < maiorMarcha() ) {
			this.marcha = (marcha) +1;
		}
			
		return this.marcha;
	}

	// Exercicio 11
	public int marchaAbaixo() {
		if (this.marcha > menorMarcha() ) {
			this.marcha = (this.marcha) -1;
		}
			
		return this.marcha;
	}

	// Exercico13
	public int menorMarcha() {
		int menormarcha =0;
		return menormarcha;
	}
	
	public int maiorMarcha() {
		int maiormarcha = 5;
		return maiormarcha;
	}
	// exercicio 14
	public boolean ligarMoto() {
		return ligarMoto = true;
	}
	
	public boolean desligarMoto() {
		return ligarMoto = false;
	}

}



