package heranca;

public class Equipamento {
	private String marca;
	private String tipo;
	
	public Equipamento (String marca, String tipo) {
		this.marca = marca;
		this.tipo = tipo;
	}
	
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void imprimeEquipamento() {
		System.out.println("Marca do equipamento : " + getMarca()+ " Tipo " +getTipo());
	}

}
