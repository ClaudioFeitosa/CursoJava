package br.com.geekuniversity.secao12;

public class Programa28 {

	// HERANÇA
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciando a o objeto Pessoa 
		
	//	Pessoa p1 = new Pessoa("Claudio", 1977);
		Aluno a1 = new Aluno("Manu", 2010, "RA12345");
		Professor prof1 = new Professor("Claudio", 1977, "MAt12345");
		
	//	System.out.println("Pessoa " + p1.getNome());
		System.out.println("Aluno: " + a1.getNome() + " Ano Nasc " + a1.getano_nasc() + " RA: " + a1.getRa());
		System.out.println("Prof: " + prof1.getNome() + " Ano Nasc " + prof1.getano_nasc() + " RA: " + prof1.getMatricula());
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		System.out.println("USANDO O POLIMORFISMO");// USANDO O POLIMORFISMO
///		System.out.println(p1);
		System.out.println("\n");
		System.out.println(a1);
		System.out.println("\n");
		System.out.println(prof1);
		
		System.out.println("\n");
		// usando o to String para imprimir apenas o nnome
		
	//	System.out.println(p1.getNome());
		System.out.println("\n");
		System.out.println(a1.getNome());
		System.out.println("\n");
		System.out.println(prof1.getNome());
		
	}

}
