package br.com.geekuniversity.secao11;

/* PROTECTED
 * o modificador de acesso  default 
 * se não especificar publico ou privado o metodo vira protected
 * e limite a visibilidade somente ao pacote onde ele foi criado 
 * 
 * VISÃO DOS NIVEIS DE ENCAPSULAmento
 * PRIVATE - VISIVEL SOMENTE DENTRO DA CLASSE
 * PROTECTED - VISIVEL SOMENTE DENTRO DO PACOTE ONDE FOI CRIADO
 * PUBLIC - VISUVEL PARA O PROJETO
 */ 

public class Cliente implements Comparable {
	private int idade;
	private String nome;
	private String endereco;
	
	
	//construtor
	public Cliente(int idade, String nome, String endereço) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
		
		//this.dizer_oi();
	}
	
	// metodo dizer oi
	// este método esta privado logo so consigo usar ele dentro desta classe
	// vamos usar ele junto com o construtor Cliente acima
	private void dizer_oi() {
		System.out.println(this.nome + " esta dizendo oi... ");
	}
	
	@SuppressWarnings("unused")
	private void Cliente01() {
		System.out.println(getNome() + getEndereco() );
	}

	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade ) {
		this.idade = idade;
	}

	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereço(String endereco) {
		this.endereco =endereco;
	}


	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNome();
	}

	@Override // comparable
	public int compareTo(Object outro) {
		Cliente aux =(Cliente)outro;
		
		if (this.idade < aux.idade) {
			return -1;
		}else if (this.idade > aux.idade) {
			return 1;
		}else
			return 0;
	}

}
