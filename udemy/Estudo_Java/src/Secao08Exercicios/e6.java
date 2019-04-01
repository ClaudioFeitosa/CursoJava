package Secao08Exercicios;

import java.util.Scanner;

public class e6 {
	static int hora, min, seg, total_seg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int total;
		System.out.println("digite a hora");
		hora = teclado.nextInt();
		System.out.println("digite os minutos");
		min = teclado.nextInt();
		System.out.println("digite os segundos");
		seg = teclado.nextInt();
		
		
		total = converte_segundos(total_seg, min, hora);
		System.out.println("o total é " + total );
		
		teclado.close();
			
		}
	
	static int converte_segundos (int h, int m, int seg ) {
		total_seg = (seg +(min*60)+(hora*(60*60)));
		return total_seg;
		

		
	}

}
