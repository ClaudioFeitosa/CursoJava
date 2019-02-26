package Elevador;

import java.util.Scanner;

import Exercicios.teste.Pessoa;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevador predio[] = new Elevador[10];
		Scanner teclado = new Scanner(System.in);
		
	
		System.out.println("informe a capacidade do elevador");
		int capacidadde = Integer.parseInt(teclado.nextLine());
		System.out.println("informe o numero de andares");
		int andares = Integer.parseInt(teclado.nextLine());
		andares = andares +1;
				
		Elevador novoelevador = new Elevador(capacidadde, andares);
		
		predio[0] = novoelevador;
		
		// chamar elevador
		System.out.print("iniciando elevador");
		predio[0]= novoelevador;
		for (int i = 0; i< predio.length; i++) {
			
			
		}
		
		
	
		
teclado.close();
	}

}
