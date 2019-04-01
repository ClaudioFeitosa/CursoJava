package Secao09Exerciciose2;

public class Pessoas {
	String nome;
	int idade;
	float altura;
	
	
	public String getnome() {
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

}
