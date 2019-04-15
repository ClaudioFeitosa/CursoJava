package br.com.geekuniversity.secao12;

public class Programa28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciando a o objeto Pessoa 
		
		Pessoa p1 = new Pessoa("Claudio", 1977);
		Aluno A1 = new Aluno("Manu", 2010, "RA12345");
		Professor Prof1 = new Professor("Claudio", 1977, "MAt12345");
				
		System.out.println("Aluno: " + A1.getNome() + " Ano Nasc " + A1.getano_nasc() + " RA: " + A1.getRa());
		System.out.println("Prof: " + Prof1.getNome() + " Ano Nasc " + Prof1.getano_nasc() + " RA: " + Prof1.getMatricula());
		
		
	}

}
