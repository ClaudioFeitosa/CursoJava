package br.com.geekuniversity.secao12;
/*
 * Classe base
 * CLASSE MAE
 * CLASSE PAI
 * SUPER CLASSE
 * CLASSE GENERICA
 * 
 */
public class Pessoa {
	
	private String nome;
	private int ano_nasc;
	
	public Pessoa() {
		// estamos sobrescrevendo o m�todo Pessoa 
	}
	
	// criando o construtor da classe
	public Pessoa(String nome, int ano_nasc ) {
		this.nome = nome;
		this.ano_nasc = ano_nasc;
	}
	
	
// Getters and Setters 
/*importamnten te notar a diferen�a entre os getters e os setters
 * veja que no set precisamos informar o parametro
 * 
 */
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int  getano_nasc() {
		return this.ano_nasc;
	}

	public void setAno_nasc(int ano_nasc) {
		this.ano_nasc=ano_nasc;
	}

	
	// Este metodo mostra o que tem no endere�o de memoria
	public String toString() {
		return "Nome: " + this.nome + " \nAno Nascimento: " + this.ano_nasc;
	}

}
