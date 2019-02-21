package com.teste.teste.ex01;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
			int num1 = num.nextInt();
		
		System.out.print("Digite o segundo numero: ");
			int num2 = num.nextInt();
			
		System.out.print("Digite o terceiro numero: ");
			int num3 = num.nextInt();
		
		System.out.print("media dos numeros digitados é:" + (num1+num2+num3)/3);
			

	}

}