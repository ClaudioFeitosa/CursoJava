package Aulas;
//Classe 
//Atributos
public class Pessoa {
	//atributos da classe pessoa
	String nome, email;
	int ano_nascimento;
	
	//  construtor
	
	// isso � o construturo vazio, se n�o tiver nenhum poutro construturr na classe
	// a MV cria ele automaticamente
	public Pessoa() {}
	
	//construtor com parametros
	
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
		
	}
	//METODO
	void imprime_informa��es() {
		System.out.println(this.nome);
		System.out.println(this.email);
		System.out.println(this.ano_nascimento);
	}
}
