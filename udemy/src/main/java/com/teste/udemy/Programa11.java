package com.teste.udemy;

/*
 * Tipos de dados
 * Numericos (inteiros e reais)
 */
public class Programa11 {

	public static void main(String[] args) {
		// Tipos primarios/Primitivos
		long num0 = 99; // inteiro muito grande
		int num1 =4; // maior
		short num2 =4; // intermediario
		byte num3 =4; // menor
		char num8 = 34; 
		
		// Tipos não primarios / Não Primititvos
		Long num7 = (long) 9999999; //cast
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;
		Character num9 =35;
		
		System.out.println("long ->Num0 = " + num0);
		System.out.println("int ->Num1 = " + num1);
		System.out.println("short ->Num2 = " + num2);
		System.out.println("byte ->Num3 = " + num3);
		System.out.println("Integer ->Num4 = " + num4);
		System.out.println("Short ->Num4 = " + num5);
		System.out.println("Byte ->Num4 = " + num6);
		System.out.println("Long ->Num7 = " + num7);
		System.out.println("char ->Character = " + num8);
		
		System.out.println("int/Integer  = " + Integer.SIZE);
		System.out.println("short/Short  = " + Short.SIZE);
		System.out.println("byte/Byte  = " + Byte.SIZE);
		System.out.println("long/Long  = " + Long.SIZE);
		
		
		System.out.println("Valor Min int/Integer  = " + Integer.MIN_VALUE);
		System.out.println("Valor MAX int/Integer  = " + Integer.MAX_VALUE);
		
		System.out.println("Valor Min short/Short  = " + Short.MIN_VALUE);
		System.out.println("Valor MAX short/Short  = " + Short.MAX_VALUE);
	
		System.out.println("Valor Min byte/Byte  = " + Byte.MIN_VALUE);
		System.out.println("Valor MAX byte/Byte  = " + Byte.MAX_VALUE);
		System.out.println("Valor Min long/Long  = " + Long.MIN_VALUE);
		System.out.println("Valor MAX long/Longe  = " + Long.MAX_VALUE);
	}

}
