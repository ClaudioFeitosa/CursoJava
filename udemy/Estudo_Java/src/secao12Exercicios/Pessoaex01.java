package secao12Exercicios;

public class Pessoaex01 {
	private String nome;
	private String endereco;
	private String telefone;
	
	//Definido o construtor da classe
	
	public Pessoaex01(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		
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
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	public void imprime() {
		System.out.println("Dados do passoa: "+ this.nome + "\nEndereço: " + getEndereco() + "\nTelefone: " + getTelefone()  );
	}
	
	public String toString() {
		return "\n"+ "Nome: " + this.nome + " \nEndereço: " + this.endereco + "\nTelefone: "+ this.telefone;
	}


}
