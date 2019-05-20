package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

//Escrevendio em argquivos
public class Programa42 {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		
		try {
			/*Desta forma o arquivo sempre sera sobrescrito
			 * 
			 */
			
			PrintStream escrever = new PrintStream("Saida.txt");
			for(int i = 0; i<5; i++) {
				System.out.println("Esvreva algo");
				String msg = teclado.nextLine();
				escrever.println(msg);
			}
			escrever.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("arquivo não gerado");
		}
			
		teclado.close();
		

	}

}
