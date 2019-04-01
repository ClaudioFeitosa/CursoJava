package Aula1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeros[] = new int[5];
		
		int cont = 0; 
		
		for (int i =0; i<numeros.length; i++) {
			System.out.print("Digite o valor para a posição [" + i +"]" );
			numeros[i] =teclado.nextInt();
		}
		
		for(int i =0; i <numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				cont = cont + 1;
			}
		}
		
		System.out.println("o total de numeros pares é " + cont);

		int pares[] = new int[cont];
		
			
			for(int i =0; i <pares.length; i++ ) {
					for (int j = 0; j <numeros.length; j++) {
						if (numeros[j] % 2 == 0) {
				 				pares[i] = numeros[j];
				 				for(int p =0; p <pares.length; p++ ) 
								System.out.println("os numeros pares na pares são "+pares[p]);
				 				
						}
					}
			}
		
			teclado.close();
			}
		
	}

