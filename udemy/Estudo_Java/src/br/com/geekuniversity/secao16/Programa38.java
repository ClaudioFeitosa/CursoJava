package br.com.geekuniversity.secao16;

import java.io.IOException;
import java.util.Scanner;

// exeption
public class Programa38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o n1");
		int n1 = teclado.nextInt();
		
		System.out.println("Digite o n1");
		int n2 = teclado.nextInt();
		
		try {
		System.out.println(divisao(n1, n2));
		
		}catch(Exception e) {
			System.out.println("n�o � possivel realoizar a divis�o por zero");
		}
		teclado.close();

	}

	// Criar uma fun��o que avisa da possibildiade de exece��o
	
	public static int divisao(int n1, int n2) throws IOException{
		return n1/n2;
		
	}
	
}
