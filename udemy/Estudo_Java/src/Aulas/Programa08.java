package Aulas;

import java.util.Scanner;

//While e do  while
public class Programa08 {
	public static void main(String[] args) {
		int idade;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
	
		do {
		System.out.println("infoirme o nome ");
		nome = teclado.nextLine();
	
		System.out.println("infoirme o idade ");
		// idade = teclado.nextInt(); - bug do java
		idade = Integer.parseInt(teclado.nextLine());
		
		
		System.out.println(nome + "tem " +  idade + " anos");
		
		} while (idade > 0);
		
		teclado.close();
		
	}
	
	
}
