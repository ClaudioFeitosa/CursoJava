package br.com.geekuniversity.secao18;
/*
 * Trabalahndo com Strings
 * Strings são imutaveis
 */

public class Programa41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String curso ="Programação em Java: Essencial";
		// para conseguir mudar tem que atribuir o resultado a mesma variavel
		
		curso = curso.replace("a", "o");
		
		curso =curso.toLowerCase();
		
		curso =curso.toUpperCase();
		
		System.out.println(curso);

		// usando como um array
		
		System.out.println(curso.charAt(19));
		
		for (int i =0; i<curso.length(); i++) {
			System.out.print(curso.charAt(i));
			
		}
		System.out.println("");
		for (int i = (curso.length()-1); i >= 0; i-- ) {
			System.out.print(curso.charAt(i));
		}
	}

}
