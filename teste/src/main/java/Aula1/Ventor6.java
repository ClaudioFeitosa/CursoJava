package Aula1;

import java.util.Scanner;
public class Ventor6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int v6[] = new int[6];
	
		for (int i =0; i<v6.length; i++ ) {
			
			System.out.print("Digite o valor para a posição [" + i +"]" );
		
			v6[i] =Integer.parseInt(teclado.nextLine());
			
		}

		for (int i =0; i<v6.length; i++) {
		System.out.println("imprimindo vetor posição [" + i +"] =" + v6[i]);
		}
		teclado.close();	
	}


 
}




