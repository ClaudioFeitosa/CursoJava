package Exercicios;

public class Agenda {
	String nome;
	int idade;
	float altura;
	int i;
	
	 public Agenda(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	 
	 
	void armazenaPessoa (String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	// Area de impress√£o//
	
	static void cabecalho() {
		System.out.println("======================================lista de alunos======================================");
	}
	
	void imprimeLista(int i) {
		this.i= i;
		System.out.println("A posiÁ„o do aluno È [" + i + "]" +" " + 
		getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
	}
	


	void imprimePesquisa(int i) {
		this.i = i;
		System.out.println("A posi√ß√£o do aluno √© [" + i + "]" +" " 
		+ getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
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
	
	

	void resultadoDeBusca() {
		System.out.println("imprimindo s√≥ o resultado da busca");
	//	System.out.println(getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
	}
	
	void excluido() {
		System.out.println(getNome() +" tem " + getIdade() + " anos, e tem " + getAltura()+" de altura");
	}

	

}
