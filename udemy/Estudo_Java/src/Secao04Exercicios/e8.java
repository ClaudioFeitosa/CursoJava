package Secao04Exercicios;

import java.util.Scanner;

public class e8 {

	public static void main(String[] args) {
			int n1, n2, nota1 = 0, nota2 = 0;
				Scanner teclado = new Scanner (System.in);
				
				System.out.println("digite a nota 1");
				n1 = teclado.nextInt();
				if (n1 < 0) {
					System.out.println("nota invalida");
					System.exit(n1);
				} else if (n1 > 10 ) {
					System.out.println("nota invalida");
					System.exit(n1);
				} else nota1 = n1;
				
				System.out.println("digite a nota 2");
				n2 = teclado.nextInt();
				if (n2 < 0) {
					System.out.println("nota invalida");
					System.exit(n2);
				} else if (n2 > 10 ) {
					System.out.println("nota invalida");
					System.exit(n2);
				} else nota2 = n2;
				
				float media = (nota1 + nota2)/2;
				
				System.out.println("a media é " + media);
					

					
		teclado.close();
	
	}
				
}
