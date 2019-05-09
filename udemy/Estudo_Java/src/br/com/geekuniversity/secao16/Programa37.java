package br.com.geekuniversity.secao16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa37 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe o primeiro numero");
		try {
		num1 = teclado.nextInt();
		} catch (InputMismatchException e1) {
			System.out.println("numero invalido");
		}
		System.out.println("informe o segundo numero");
		num2 = teclado.nextInt();
		
		try {
			System.out.println("A divisão de " +  num1 + " por " + num2 + " é " + num1 / num2 );
		} catch (ArithmeticException e) {
			System.out.println("Não é possivel a divisão por Zero ");
		}
		
		
		teclado.close();

	}

}
