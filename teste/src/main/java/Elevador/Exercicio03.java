package Elevador;

import java.util.Scanner;

import Exercicios.teste.Pessoa;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qtd, andar;
		int chamarelevador = 0;
		
		
		System.out.println("informe a capacidade do elevador");
		int capacidadde = Integer.parseInt(teclado.nextLine());
		System.out.println("informe o numero de andares");
		int andares = Integer.parseInt(teclado.nextLine());
		andares = andares +1;
		
		Elevador novoelevador1[] = new Elevador[andares];
				
		Elevador novoelevador = new Elevador(capacidadde, andares);
		
		System.out.print("iniciando elevador");
		
		System.out.println("Precione 1 para Chamar o elevador");
		chamarelevador = Integer.parseInt(teclado.nextLine());

		
		if (chamarelevador == 1) {
			
			Elevador.inicializar();
			
		}
		
		System.out.println("Informe o andar ...");
			andar = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe o qtd de pessoas ...");
			qtd = Integer.parseInt(teclado.nextLine());
			
			for (int i = andar; i <= novoelevador.getAndarFinal();i++) {
				for (int j = qtd; qtd<=novoelevador.getQtdmax();j++) {
					System.out.println("subir");
				} 
					
			}

		
			
		teclado.close();
	}

}
