package Secao09Exerciciose2;

public class Pessoas {
	String nome;
	int idade;
	float altura;

	public void Pessoa(String nome, int idade, float altura) {
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

	public String setnome() {
		return this.nome;
	}
	
	public int setIdade() {
		return this.idade;
	}
	public float setAltura() {
		return this.altura;
	}

	public void imprime_contatos() {
		System.out.println("nome do contato " + nome);
	}


	void imprimeTudo() {
	System.out.println(getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
}
	
}


