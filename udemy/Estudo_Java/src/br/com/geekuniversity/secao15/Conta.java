package br.com.geekuniversity.secao15;

public class Conta {
	
	private int numero;
	private String cliente;
	
	public static int contador =1;
	
	public Conta(String cliente) {
		this.numero = contador;
		this.cliente= cliente;
		Conta.contador = Conta.contador + 1; //Atributos estaticos são chamados com o nome da classe
		
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getCliente() {
		return this.cliente;
	}

	// metodo estatico NESSE CASO PRECISA SER UM METODO ESTATIC
	public static int proximaConta() {
		return Conta.contador;
	}
}
