package br.com.geekuniversity.secao12;
/* CLASSE ESPECIFICA OU SUB CLASSE OU CLASSE FILHA
 * 
 *  falando de HERAN�A
 * BENEFICIOS:
 * Evita a repeti�a� de codigo
 * facilia a manut do prog.
 * 
 * para herdar siga extends e o super/// veja no codigo
 * //	private String nome;//	private int ano_nasc;
 * ja existem na classe pessoa e como o Aluno tambem � uma pessoa
 * faz sentido aproveitar o que ja esta feito la
 */
public class Aluno extends Pessoa {
	private String ra;

	// criando o cosntrutor da classe com heran�a
	
	public Aluno(String nome, int ano_nasc, String ra) {
		super(nome, ano_nasc);
		this.ra = ra;

}

	// getters and setters
	
	public String getRa() {
		return this.ra;
	}

	public void setRa(String ra) {
		this.ra=ra;
	}
	
/*<<<<<<< HEAD
	public String toString() {
		return super.toString() + "\nRA: " + this.ra;
	}

//}
 * (non-Javadoc)
 * @see br.com.geekuniversity.secao12.Pessoa#toString()
 */

//=======
	// este tmb � UM OVERRIDING / SOBRESCRITA DE M�TODO

	public String toString() {
		return super.toString() + "\nRA: " + this.ra;
	}
	
	
	// este tmb � UM OVERRIDING / SOBRESCRITA DE M�TODO, veja a setinha verde
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}

}


//>>>>>>> 9cf859dcf0361da64591ecf0a0e7673ee05f59f8
