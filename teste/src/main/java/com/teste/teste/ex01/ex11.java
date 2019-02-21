package com.teste.teste.ex01;

public class ex11 {
 
	private static final double radius = 7.5;
	private static final double PI = 3.1416;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// local correto para declarar as variaveis:
		double perimetro =0;
		double area = 0;
		
		perimetro = (2*PI)*radius;
		area = PI*radius;
		
		System.out.println("Perimetro =" + perimetro + " " + "Area =" + area);
		
		

	}

}

// lista de erros cometidos nesse exercicios
// 1 declarar as variaveis perimetro e area fora do metodo
// 2 declarar as variaveis perimetro e area como Static Final (isso significa que não poderiam ser modificadas)

