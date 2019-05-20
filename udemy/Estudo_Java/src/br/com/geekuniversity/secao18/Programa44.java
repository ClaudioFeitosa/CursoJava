package br.com.geekuniversity.secao18;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// escrita 2 undtade em arquvio

public class Programa44 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
		try {
			
			PrintStream escrever = new PrintStream(new FileOutputStream("Saida.txt", true));
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
