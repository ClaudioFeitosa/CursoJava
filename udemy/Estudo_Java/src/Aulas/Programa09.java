package Aulas;

import java.util.Scanner;

// For
public class Programa09 {

	public static void main(String[] args) {
		int idade;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i =0; i<5; i++) {
			System.out.println("infoirme o nome ");
				nome = teclado.nextLine();
			System.out.println("infoirme o idade ");
				idade = Integer.parseInt(teclado.nextLine());
			System.out.println(nome + " tem " +  idade + " anos");
			
		}
		teclado.close();
	}

}
