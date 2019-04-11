package Secao09Exercicio03;

import java.util.Scanner;

public class Elevador02 {
	static Scanner teclado = new Scanner(System.in);
	
	static int capacidade, andares,andar, andarAtual, terreo, qtd, qtdAtual;
	
	
	public static void main(String[] args) {
		int chamar, sobe, desce, fim =1;
		System.out.println("informe a capacidade do elavador");
		capacidade = teclado.nextInt();
		System.out.println("o numero de andares");
		andares = teclado.nextInt();
		terreo =0;
		qtdAtual=5;
		
		ElevadorClasse elevador = new ElevadorClasse (capacidade,andares,terreo);

		while (fim ==1) {

			System.out.println("Digite '1' para subir ou '0' p/ sair");
			chamar = teclado.nextInt();
			
			if (chamar ==0) {
			
				System.out.println("Elevador finalizado");
				System.exit(1);
			
			}else if (chamar ==1 ) {
				elevador.informe_andar();
					andar = teclado.nextInt();
					if (andar > elevador.andares)
						System.out.println("andar invalido");
					elevador.informe_qtd_pessoas();
					qtd = teclado.nextInt();
					qtd = qtd+qtdAtual;
					
		  		elevador.subir(andar, qtd);
		  		elevador.seuAndar();
				

			}
			
						
		}
		
		
		
		if (qtd >capacidade ) {
			System.out.println("capacidade exedida");
			System.exit(1);
			
		}
		
	
		
		


	}
}
