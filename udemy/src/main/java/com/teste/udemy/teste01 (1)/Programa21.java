package com.claudio.teste.teste01;
	/*
	 * trabalhando com funções
	 * criar funão soma
	 */
	//import java.util.Scanner;
	
	public class Programa21 {
			public static void main(String[] args) {
				int valor1 = 5, valor2 =6, res;
				
				res = soma(valor1, valor2);
				
				System.out.println(res + messagem());
				
				}
				
			static int soma(int v1, int v2) {
				return  v1 + v2;
		}
			static String messagem() {
				return "ola Usuario";
			}
}
