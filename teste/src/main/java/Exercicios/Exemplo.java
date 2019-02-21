package Exercicios;

import java.util.Scanner;
public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome[] = new String[3];
		float altura[] = new float[3];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i<3; i++) {
		System.out.println("Digite o nome");
		nome[i] = teclado.nextLine();
		//System.out.println("Digite altura");
		
		//altura[i] = teclado.nextFloat();
	
		}
		
		for (int i = 0; i<3; i++) {
		System.out.println("Nome " + nome[i] );
		
		}
		
		
		
		
		
		

	}

}
