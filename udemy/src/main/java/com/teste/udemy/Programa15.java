package com.teste.udemy;

// operacções matematicas
public class Programa15 {

	public static void main(String[] args) {
		int num1=6, num2=9, res;
		float res2;
		
		//soma
		res = num1+num2;
			System.out.println("A soma de " + num1 + " + " + num2 + " é " + res); 
		
		//Subtração
		res = num1- num2;
		System.out.println("A subtração de " + num1 + " - " + num2 + " é " + res);
		
		//multiplicação
		res = num1 * num2;
		System.out.println("A multiplicação de " + num1 + " * " + num2 + " é " + res);
		

		//Divisão int 
		res2 = num1 / num2;
		System.out.println("A divisão (inteira) de " + num1 + " / " + num2 + " é " + res2);
		
		//Divisão float
		res2 = (float)num1 / (float)num2;
		System.out.println("A Divisão (real) de " + num1 + " / " + num2 + " é " + res2);
		
		// modulo // usado para saber se é par ou impar, 
		// se o resto do modulo da variavel /2 = 0 a variavel é par se for 1 é impar 
		res = num1 % 2;
		System.out.println("O resto da divisão de  " + num1 + " por 2  é " + res);
		
		res =  num2 %3;
		System.out.println("O resto da divisão de  " + num2 + " por 3  é " + res);
		
		
				
	}

}
