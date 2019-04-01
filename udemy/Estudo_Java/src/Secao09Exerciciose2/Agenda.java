package Secao09Exerciciose2;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Pessoas agenda[] = new Pessoas[2];
		
		for (int i = 0; i <agenda.length; i++) {
			System.out.println("Digite o nome do contato");
			agenda[i].nome = teclado.nextLine();
			System.out.println("Digite a idade do contato");
			agenda[i].idade = teclado.nextInt();
			System.out.println("Digite a altura do contato");
			agenda[i].altura = teclado.nextFloat();
			
		
		}
		for (int i = 0; i <agenda.length; i++) {
		System.out.println(agenda[i].nome);	
		}
		
		
		teclado.close();

	}

}
