package br.com.geekuniversity.secao14;
/*
 * uma interface pode conter:
 * -Constantes;
 * Metodos abstratos;
 * 
 * interface para server de contrato para eletrocnicos. Todo produto eletronico 
 * que implementar esta interface OBRIGATORIOAMENTE DEVE implementtar os metodos abstratos
 */

public interface IEletronico {
	// TODA CONSTANTE É POR CONVEÇÃO EM MAIUSCULA
	public String MARCA = "GEEK";
	
	public void Ligar();
	
	public void Desligar();
	

}
