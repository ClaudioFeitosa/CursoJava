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

public class Cliente {
	private String nome;
	private String endereço;
	
	
	//construtor
	public Cliente(String nome, String endereço) {
		this.nome = nome;
		this.endereço = endereço;
		
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
		
	public String getNome() {
		return this.nome;
	}
	
	
public String getEndereco() {
	return this.endereço;
}


}
