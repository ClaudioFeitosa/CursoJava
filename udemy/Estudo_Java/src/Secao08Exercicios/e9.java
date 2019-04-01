package Secao08Exercicios;

import java.util.Scanner;

public class e9 {
	static float volume,raio, altura;
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("digite a altura ");
		altura = teclado.nextFloat();
		System.out.println("digite o raio do cilindro ");
		raio = teclado.nextFloat();
		
		System.out.println("O vulme do cilindro é " + calcula_volume(volume, 0) );
		
		
		
		teclado.close();
	}

	static float calcula_volume(float r, float a ) {
		volume = (float) (3.141592*((raio*raio)*(altura)));
		return volume;
		// lembrar de passar o campo em que foi digitado
		
		
	}
}
