package br.com.geekuniversity.secao12;
/* CLASSE ESPECIFICA OU SUB CLASSE OU CLASSE FILHA
 * 
 *  falando de HERANÇA
 * BENEFICIOS:
 * Evita a repetiçaõ de codigo
 * facilia a manut do prog.
 * 
 * para herdar siga extends e o super/// veja no codigo
 * //	private String nome;//	private int ano_nasc;
 * ja existem na classe pessoa e como o Aluno tambem é uma pessoa
 * faz sentido aproveitar o que ja esta feito la
 */
public class Aluno extends Pessoa {
	private String ra;

	// criando o cosntrutor da classe com herança
	
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
	// este tmb é UM OVERRIDING / SOBRESCRITA DE MÉTODO

	public String toString() {
		return super.toString() + "\nRA: " + this.ra;
	}
	
	
	// este tmb é UM OVERRIDING / SOBRESCRITA DE MÉTODO, veja a setinha verde
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}

}


//>>>>>>> 9cf859dcf0361da64591ecf0a0e7673ee05f59f8
