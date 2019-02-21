package com.teste.teste.ex01;

import java.util.Scanner;

public class ex07 {

	private static Scanner number;

	public static void main(String[] args) {
		number = new Scanner (System.in);
		
		System.out.print("Input a number: 8: ");
		int num = number.nextInt();
		
		for (int i=0; i<10; i++) {
			System.out.println(num + "X" + (i+1)+ "=" + (num *(i+1)));
					}
					

	}

}
