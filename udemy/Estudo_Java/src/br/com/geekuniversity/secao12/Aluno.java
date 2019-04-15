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

}

