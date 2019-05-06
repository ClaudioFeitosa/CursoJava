package secao12Exercicios;

public class Televisor {
	private boolean ligado;
	private String estado;
	private int canal;
	private int volume;
	private int ncanais = 50;
	private int volumemax = 20;
	
	
	//ex 21
	public Televisor(boolean ligado, int canal, int volume) {
		this.ligado = ligado;
		this.estado= estado;
		this.canal = canal;
		this.volume = volume;
	}
	
	
	
	public boolean getLigado() {
		return this.ligado = ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public String getEstado() {
		return this.estado=estado;
	}
	
	public void setEstado(String estado) {
		this.estado=estado;
	}
	public int getCanal() {
		return this.canal=canal;
	}
	public void setCanal(int canal) {
		this.canal=canal;
	}
	public int getVolume() {
		return this.volume=volume;
	}
	 public void setVolume(int volume) {
		 this.volume=volume;
	 }
	 
	 public int getNcanais() {
		 return this.ncanais = ncanais;
	 }
	 public int getVolumemax() {
		 return this.volumemax = volumemax;
	 }

	 public void imprimeTV()  {
		 if (this.ligado == true) {
			 System.out.println("A TV esta ligada no canal: " +getCanal()+ " e o volume esta em: " + getVolume());
		 }else {
			 System.out.println("A teve esta desligada");
		 }
	}
// 22
	 public boolean Ligar() {
		 return this.ligado = true;
	 }
	 
	 public boolean Desligar() {
		 return this.ligado = false;
	 }
// 23 criado campost ncanais = 50; int volumemax = 20;
	 
	// 
		public int canalAcima() {
			if (this.canal < getNcanais()  ) {
				this.canal = (this.canal) +1;
			} else {
				System.out.println("limite de canais atingido");
			}
				
			return this.canal;
		}
	 
		public int canalAbaixo() {
			if (this.canal > 1 ) {
				this.canal = (this.canal) -1;
			} else {
				System.out.println("limite de canais atingido");
			}
				
			return this.canal;
		}
		
		public int volumemaxAcima() {
			if (this.volume < getVolumemax()  ) {
				this.volume = (this.volume) +1;
			} else {
				System.out.println(" Volume maximo atingido");
			}
				
			return this.volume;
		}
		
		public int volumemaxAbaixo() {
			if (this.volume >= 1 ) {
				this.volume = (this.volume) -1;
			} else {
				System.out.println(" Volume minimo atingido");
			}
				
			return this.volume;
		}
	 
		
	 
}

