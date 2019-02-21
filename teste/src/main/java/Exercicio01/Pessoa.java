package Exercicio01;


public class Pessoa {
	String nome;
	int idade;
	float altura;

	
	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
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

}
