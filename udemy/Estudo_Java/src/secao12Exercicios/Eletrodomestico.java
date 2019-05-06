package secao12Exercicios;

public class Eletrodomestico {
	private String eletro;
	private boolean ligado;
	private String estadoAtual;
	
	Eletrodomestico(String eletro, boolean ligado,String estadoAtual ) {
		this.eletro = eletro;
		this.ligado = ligado;
		this.estadoAtual = estadoAtual;
	}

	
	// getters e setters
	public String getEletro() {
		return this.eletro;
	}
	public void setEletro(String eletro) {
		this.eletro=eletro;
	}
	public boolean getLigado() {
		return this.ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado=ligado;
	}
	
	public String getEstadoAtual() {
		return this.estadoAtual;
	}
	public void setEstadoAtual(String estadoAtual) {
		this.estadoAtual=estadoAtual;
	}
		
	// metodos liga e desliga EX19
	public String desliga() {
		this.ligado=false;
		//defineEstado();
		return estadoAtual = "Desligado";
	}
	
	public String liga() {
		this.ligado=true;
		//defineEstado();
		return estadoAtual ="ligado";
	}
	
	public String toString() {
		return "Tipo do Eletrodomestico: " + "\nTipo: " + getEletro() + "\nEstado Atual: " +  getEstadoAtual();
	}
}
