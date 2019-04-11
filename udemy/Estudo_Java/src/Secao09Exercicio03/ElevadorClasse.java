package Secao09Exercicio03;

public class ElevadorClasse {
	int capacidade, andares, qtd, andar,terreo;
	
	public ElevadorClasse (int capacidade, int andares, int terreo) {
		this.capacidade = capacidade;
		this.andares = andares;
		this.terreo =terreo;
	}
	
	
	void informe_andar() {
		System.out.println("Informe o andar");
	}
	
	void informe_qtd_pessoas() {
		System.out.println("Informe o numero de pessoas");
	}

	void subir(int andar, int i) {
		this.andar=andar;
		this.qtd=qtd;
		System.out.println("subindo...");
	}
	
	void seuAndar() {
		System.out.println("voce chegou ao seu andar");
	}
	
	public void Entra(int qtd) {
		this.qtd=qtd;
	
	}
	
	public void Sai(int qtd) {
		this.qtd=qtd;
	}
	
	public void Sobe(int andar) {
		this.andar=andar;
	}
	
	public void Desce(int andar) {
		this.andar=andar;
	}
	
	
	public int getCapacidade() {
		return this.capacidade;
	}

	public int getAndares() {
		return this.andares;
	}
		
	public int setCapacidade() {
		return this.capacidade;
	}

	public int setAndares() {
		return this.andares;
	}
	
}
