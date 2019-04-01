package Secao04Exercicios;

import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {
		int n1;
		double raiz;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("por favor digite um numero");
		n1 = teclado.nextInt();
		
		if (n1 >0) {
			raiz = Math.sqrt(n1);
			System.out.println(raiz);
		} else if (n1 == 0) {
			System.out.println("não existe raiz quadrada de " + n1);
		}else {
			System.out.println("não existe raiz quadrada numero negativo");

		}

teclado.close();
	}

}
