package Elevador;

public class Elevador {
	int andarInicial;
	int andarFinal;
	int andar;
	int qtd;
	int qtdmax;
	
	
	
	public Elevador(int andarFinal, int qtdmax) {
		this.andarFinal = andarFinal;
		this.qtdmax = qtdmax;
	}
	
	public int  getQtdmax() {
	return this.qtdmax;
	}

	public int  getAndarFinal() {
	return this.andarFinal;
	}
	
	public static void inicializar() {
		this.andarInicial = 0;
		this.qtd = 0;
	}
	
	public void chamarElevador(int andar, int qtd ) {
	this.andar = andar;
	this.qtd = qtd;
	}
	
	public void elevadorSubir(int andar, int qtd ) {
	this.andar = andar;
	this.qtd = qtd;
	}

}
