package Secao09Exercicio03;

import java.util.Scanner;

public class Elevador01 {
	static Scanner teclado = new Scanner(System.in);
	
	static int capacidade, andares, andarAtual, terreo;
	
	
	public static void main(String[] args) {
		int chamar, sobe, desce;
		System.out.println("informe a capacidade do elavador");
		capacidade = teclado.nextInt();
		System.out.println("o numero de andares");
		andares = teclado.nextInt();
		terreo =0;
		
		ElevadorClasse elevador = new ElevadorClasse (capacidade,andares,terreo);
		elevador.imprime();	
		
		System.out.println("Digite '1' para subir ou '2' descer");
		chamar = teclado.nextInt();
		elevador.imprime();	

	}
}