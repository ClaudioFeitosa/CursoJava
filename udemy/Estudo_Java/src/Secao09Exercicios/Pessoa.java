package Secao09Exercicios;

public class Pessoa {
	
	String nome;
	int idade;
	float altura;

	
	// gets
	public String getNome() {
		return this.nome;

	}

	public int getIdade() {
		return this.idade;

	}

	public float getAltura() {
		return this.altura;

	}

// sets
	public String setNome() {
		return this.nome;

	}

	public int setIdade() {
		return this.idade;

	}

	public float setAltura() {
		return this.altura;

	}
	
	void imprime() {
		System.out.println("nome: " + this.nome);
		System.out.println("idade: " + this.idade);
		System.out.println("Altura: " + this.altura);
	}
	
}
