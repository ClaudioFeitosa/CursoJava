package Secao08Exercicios;

import java.util.Scanner;
public class E1 {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
	int n;
	System.out.println("informe o  numero");
	n = teclado.nextInt();	
	
	System.out.println("o resultado é " +dobro(n) );	
		

	}
	
	public static int dobro(int numero) {
		return  (numero *2);
	}
	

}
