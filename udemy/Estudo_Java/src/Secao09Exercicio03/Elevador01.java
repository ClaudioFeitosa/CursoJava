package Secao09Exercicio03;

import java.util.Scanner; 

public class Elevador01 {
	static Scanner teclado = new Scanner(System.in);
	static int capacidade, andares, qtd, andar, andarAtual;
	static char chamar, subir, descer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("informe a capacidade do elavador");
		capacidade = teclado.nextInt();
		System.out.println("o numero de andares");
		andares = teclado.nextInt();
			
		int elavador[] = new int[andares];
		andarAtual = 0;
		
		System.out.println("Chamar elevador s/n");
		chamar = teclado.nextLine().charAt(0);
		
		if (chamar =='s') {
			andar = teclado.nextInt();
			if (andar > andarAtual) {
				for (int i =0; i<= andar; i++) {
					Sobe(andar);
					
				}
				
			}
		}
		
		
	}
	private static void Sobe(int andar2) {
		
		
	}

}
