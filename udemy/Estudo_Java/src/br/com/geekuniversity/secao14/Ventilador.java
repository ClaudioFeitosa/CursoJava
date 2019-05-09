package br.com.geekuniversity.secao14;

public class Ventilador implements IEletronico{
	private boolean ligado = false;

	@Override
	public void Ligar() {
		if(!this.ligado) {
			this.ligado = true;
			System.out.println("ligado");
		}
		
	}

	@Override
	public void Desligar() {
		if(this.ligado) {
			this.ligado = false;
			System.out.println("desligado");

		}
	}
	

}
