package Exercicios;
// exercicio 1 sessão 10
public class P1 {
	
	String nome;
	float altura;
	int idade;
	
	
	public P1 (String nome, float altura, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		
	}	
	
	void imprime () {
		System.out.println("Nome = " + this.nome);
		System.out.println("Altura =" + this.altura);
		System.out.println("Idade= " + this.idade);
	}
	
	void ArmazenaPessoa (String nome, float altura, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		
	}	


}
