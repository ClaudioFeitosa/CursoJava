package Exercicios.teste;

public class Pessoa {
	String nome;
	int idade;
	float altura;
	

	
	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public void Excluido(String enome, int eidade, float ealtura) {
		this.nome = enome;
		this.idade = eidade;
		this.altura = ealtura;
	}
	
	public String getNome() {
	return this.nome;
	}

	public int getIdade() {
	return this.idade;
	}
	
	public float getAltura() {
	return this.altura;
	}

	// Set
	
	public String SetNome(String nome) {
		return nome;
	}
	
	public int SetIdade( int idade) {
		return idade;
		}
	
	public int SetAltura( int altura) {
		return altura;
	}
	
	void messagem() {
		System.out.println("imprimindo todos da lista");
	}
	
	void imprimeTudo() {
		System.out.println(getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
	}
	
	void resultadoDeBusca() {
		System.out.println("imprimindo só o resultado da busca");
	//	System.out.println(getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
	}
	
	void excluido() {
		System.out.println(getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
	}

	

}
