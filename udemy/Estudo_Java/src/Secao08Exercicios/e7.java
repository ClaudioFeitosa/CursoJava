package Secao08Exercicios;

import java.util.Scanner;

public class e7 {
	static float C, F;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite a temperatura em Celcius ");
		C = teclado.nextFloat();
		
		System.out.println("a temperatura convertida é " + calcula_temp(F) );
		
		teclado.close();
	}

	static float calcula_temp(float c) {
		F =  (float) (C *(9.0/5.0) + 32);
		return F;
	}
}
