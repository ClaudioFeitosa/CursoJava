package heranca;

public class Computador extends Equipamento {
	private String modelo;
	private int memoria;

	public Computador(String marca, String tipo, String modelo, int memoria) {
		super(marca, tipo);
		this.modelo = modelo;
		this.memoria = memoria;
		
	}
// testando o ajuste
	/// novo teste
	public String getModelo() {
		return this.modelo = modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getMemoria() {
		return this.memoria = memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	

	public void imprimeEquipamento() {
		System.out.println("\nMarca do equipamento : " + getMarca()+ "\nTipo: " +getTipo() + "\nModelo: " + getModelo() +"\nMemoria: " +getMemoria()+ "GB" );
	}
}
