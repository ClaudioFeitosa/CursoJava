package com.claudio.teste.teste01;
/*
 * trabalhando com funções
 */
import java.util.Scanner;
/*
 faça um program que receba diversos nomes de frutas e no final imprima 
 essas frutas em ordem inversa.
 o programa deve solicitar ao usuario quantas frutas eçe quer
 cadastrar
 */
public class Programa20 {
	static String frutas[];
	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {

		int qtd;
		
		System.out.println("Quantas frutas voce vai cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		mostrar_dados(qtd);
		
			
	teclado.close();
	}
	/*
	 * Uma função tem as seguintes caracteristicas
	 * A) Tipo de retorno (tipo de dados que a função vai retornar
	 * B) Nome (corresponde a ação que a função realiza)
	 * C) Parametros / argumentos de entrada (opcional)
	 * D) Retorno (opcional, depende do tipo de renrono)
	 * Void = vazio
	 */
	 static void cadastrar_dados(int quantidade) {
		
		// instaciar frutas de acordo com a quantidade
		frutas = new String[quantidade];
		
		for(int i =0; i < quantidade;i++) {
			System.out.println("Digite o nome da fruta " + i);
			frutas[i] = teclado.nextLine();
		}
	 }
	static void mostrar_dados(int quantidade) {
			
		for(int i = (quantidade -1); i >= 0;  i--) {
			System.out.println(frutas[i]);
			
		}
	 
	 }

}
