package br.com.geekuniversity.secao12;

public class Professor extends Pessoa {
	private String matricula;
	
	public Professor(String nome, int ano_nasc, String matricula) {
		super(nome, ano_nasc);
		this.matricula=matricula;
 
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
}
