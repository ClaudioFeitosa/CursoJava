package Secao04Exercicios;

import java.util.Scanner;

public class e5 {
	public static void main(String[] args) {
		double numero;
		Scanner teclado = new Scanner (System.in);

		System.out.println("Digite um numero real");
		numero = teclado.nextInt();
		
		if (numero % 2==0) {
			System.out.println("o numero " + numero + "é par");
			}else { 
			System.out.println("o numero " + numero + "é impar");

		}
	teclado.close();

}
}
