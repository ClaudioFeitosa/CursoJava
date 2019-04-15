package Secao09Exercicio03V2;

import java.util.Scanner;

public class Elevador {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		int capacidade=0, andares=0, terreo=0;
		int ativar =1;
			
		
		System.out.println("informe a capacidade do elavador");
		capacidade = teclado.nextInt();
		System.out.println("o numero de andares");
		andares = teclado.nextInt();

		ElevadorClasse e1 = new ElevadorClasse(capacidade, andares, terreo);
		e1.imprimedadosPredio();
		
		
		
		while (ativar == 1){
		System.out.println("Digite '1' chamar o elevador '0' p/ sair");
		ativar = teclado.nextInt();
		if (ativar ==0) {
				System.out.println("Elevador finalizado");
				//System.exit(1);
			break;
		
		} else
		e1.definir_andar(e1.getAndar());
		e1.definir_pessoas(e1.getPessoas());
		e1.elevadorAtivo();
		e1.definir_saida(e1.getqtdAtual());
		
	
		}
	}

 
}
