package Secao04Exercicios;

import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		double numero;
		Scanner teclado = new Scanner (System.in);

		System.out.println("Digite um numero real");
		numero = teclado.nextInt();
		
		if (numero >0) {
			double raiz = Math.sqrt(numero);
			System.out.println("a raiz quadrasda é " + raiz);
			}else { 
			double quadrado = Math.pow(numero, 2);
			System.out.println("o quadrado é " + quadrado);

		}
	teclado.close();

	}
}




