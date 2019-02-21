
package com.teste.udemy;

// Tipos de dados
// Caracteres e Strings
public class Programa13 {
	
	public static void main(String[] args) {
		// Tipos primitivos
		
		char letra1 = 'a';
		char letra2 = 97; // 97 em decical == 'a'
		
		System.out.println("Letra2" +letra2);
		
		letra2 = (char) (letra2 +1); //cast
		
		System.out.println("Letra1" +letra1);
		System.out.println("Letra2" +letra2);
		
		// Tipos não primitivos
		Character letra3 = 'A';
		String nome = "Claudio Pereira Feitosa";
		
		System.out.println("nome: "+nome);
		//System.out.println("long/Long  = " + Long.SIZE);
		System.out.println("Tamanhoda da String: " + nome.length());//sua variavel .length mostra o tamanho da string
		
		System.out.println("String = " + (Character.SIZE * nome.length())+ " Bits");
	}

}
