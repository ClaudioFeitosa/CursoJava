package com.teste.udemy;

public class Programa12 {

	public static void main(String[] args) {
		/* tipos inteiros (exe 11 e 12
		 * tipo de dados primarios ou primitivos
		 * 
		 */
		float preco1 = 23.4f; //o f é para indicar que é float, pois por padrão o java reconhece como double
		double preco2 = 23.4;
		
		/*
		 * Tipos de dados não primarios/ ou não primitivos
		 * 
		 */
		
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float -> preco1 = " + preco1);
		System.out.println("double -> preco2 = " + preco2);
		System.out.println("Float -> preco3 = " + preco3);
		System.out.println("Double -> preco4 = " + preco4);
		
		
		System.out.println("int/Integer  = " + Integer.SIZE);
		System.out.println("short/Short  = " + Short.SIZE);
		System.out.println("byte/Byte  = " + Byte.SIZE);
		
		System.out.println("Valor Min int/Integer  = " + Integer.MIN_VALUE);
		System.out.println("Valor MAX int/Integer  = " + Integer.MAX_VALUE);
		
		System.out.println("Valor Min short/Short  = " + Short.MIN_VALUE);
		System.out.println("Valor MAX short/Short  = " + Short.MAX_VALUE);
	
		System.out.println("Valor Min byte/Byte  = " + Byte.MIN_VALUE);
		System.out.println("Valor MAX byte/Byte  = " + Byte.MAX_VALUE);
		
	}

}
