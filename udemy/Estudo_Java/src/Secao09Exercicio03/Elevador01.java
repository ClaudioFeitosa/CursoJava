package Secao09Exercicio03;

import java.util.Scanner;

public class Elevador01 {
	static Scanner teclado = new Scanner(System.in);
	
	static int capacidade, andares,andar, andarAtual, terreo, qtd, qtdAtual;
	
	
	public static void main(String[] args) {
		int chamar, sobe, desce, fim =1;
		System.out.println("informe a capacidade do elavador");
		capacidade = teclado.nextInt();
		System.out.println("o numero de andares");
		andares = teclado.nextInt();
		terreo =0;
		qtdAtual=0;
		
		ElevadorClasse elevador = new ElevadorClasse (capacidade,andares,terreo);

		// transformar cada valida��o em uma fun��o 
		// validar o andar
		// validar as pessoas 
		
		while (fim ==1) {
			
			System.out.println("Digite '1' para subir ou '0' p/ sair");
			chamar = teclado.nextInt();
			
			if (chamar ==0) {
				System.out.println("Elevador finalizado");
				//System.exit(1);
			break;
			
			}else if (chamar ==1 ) {
				elevador.informe_andar();
					andar = teclado.nextInt();
					
					// este if colocar dentro de um m�todo que devolve um booleado (true o false)
					
					if (andar > elevador.andares || andar <0)  { // n�o deve acessar diretamente o atributo (sempre usar o metdod exe elevador.getAndares()
						System.out.println("andar invalido");
					
					} else 
						//andar = andar;
						//System.out.println(andar);
						while (true) {
						
							System.out.println("digite a quantidade de pessoas");
							qtd = teclado.nextInt();
							qtd = qtd +qtdAtual;
							
							if (qtd <= elevador.capacidade) {
								elevador.subir(andar, qtd);
								break;
								
							}else {
								System.out.println("qtd execedente");
							}

						}
						
						
					}
			
			
		}
		
		
		
		
		
		
		
	}
}
