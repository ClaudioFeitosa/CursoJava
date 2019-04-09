package Secao09Exerciciose2;

public class Cadastro_pessoas {
	String nome;
	int idade, i;
	float altura;

	public Cadastro_pessoas(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;	
	}

	
	public void removePessoa(String nome) {
		
		}
	
	
	public void buscaPessoa(int i) {
		this.i = i;
	
		System.out.println(getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
		
	}
	
	void imprimeTudo() {
	//this.i=i;
		System.out.println(getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
}
	

	void imprimePesquisa(int i) {
		this.i = i;
		System.out.println(getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
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


	
}


