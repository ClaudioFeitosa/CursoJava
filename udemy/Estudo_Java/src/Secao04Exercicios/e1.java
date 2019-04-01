package Secao04Exercicios;

import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
	int n1, n2;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("digite numero 1");
		n1 = teclado.nextInt();

		System.out.println("digite numero 2");
		n2 = teclado.nextInt();
		
		if (n1 > n2) {
			System.out.println("o numero primeiro numero  é o maior");
		} else {
			System.out.println("o numero segundo numero  é o maior");
			
		}
		teclado.close();
	}

}
