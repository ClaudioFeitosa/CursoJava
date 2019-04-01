package Aulas;

import java.util.Scanner;

// criando nossas proprias funcções

/* Receber diversas frutas e imprima em ordem contraria
 * solicitar qtas frustas quer informar
 */
public class Programa20 {
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtd;
		System.out.println("informe a quantidade de frutas");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		
		mostrar_dados(qtd);
			
		teclado.close();

	}
	
	/* FUNÇÃO
	 * uma função deve ter o seguinte
	 * a) Tipo de retorno (tipo de dado que a função vai retornar)
	 * b) Nome - Corresponde a ação que a função realiza
	 * c) Parametros / Argumentos de entrada (opcional)
	 * d) Retorno (opcional - depende do tipo de retorno)
	 * 
	 * void = vazio
	 */
	static void cadastrar_dados(int quantidade) {
		frutas = new String[quantidade];
		
		for (int i = 0; i< quantidade; i++) {
			System.out.println("digite a " + (i+1) + " fruta: ");
			frutas[i] = teclado.nextLine();
		}
	}
	
	static void mostrar_dados(int quantidade) {
		
		for (int j = (quantidade-1); j >= 0; j--) {
			System.out.println(frutas[j]);
		}
	}

}
