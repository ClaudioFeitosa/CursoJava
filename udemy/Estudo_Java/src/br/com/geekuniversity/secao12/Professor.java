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

		// este tmb � UM OVERRIDING / SOBRESCRITA DE M�TODO
	public String toString() {
		return super.toString() + "\nmatricula: " + this.matricula;
	}
	
	// este tmb � UM OVERRIDING / SOBRESCRITA DE M�TODO
	public String getNome() {
		return "Professor: \n" + super.getNome();
	}

	@Override
	public void outra_msg(String texto) {
		// TODO Auto-generated method stub
		
	}

}

