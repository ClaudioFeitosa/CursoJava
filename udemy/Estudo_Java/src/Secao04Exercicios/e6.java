package Secao04Exercicios;

import java.util.Scanner;

public class e6 {

	public static void main(String[] args) {
			double n1, n2;
			Scanner teclado = new Scanner (System.in);

			System.out.println("Digite um numero 1");
			n1 = teclado.nextInt();
			

			System.out.println("Digite um numero 2");
			n2 = teclado.nextInt();
			
			
			if (n1 > n2) {
				System.out.println("o numero " + n1 + " � o maior numero");
				System.out.println("a diferen�a entre os dois �" + (n1 - n2) );
				
				}else { 
					System.out.println("o numero " + n2 + " � o maior numero");
					System.out.println("a diferen�a entre os dois �" + (n2 - n1) );
			}
		teclado.close();

	}
	}
