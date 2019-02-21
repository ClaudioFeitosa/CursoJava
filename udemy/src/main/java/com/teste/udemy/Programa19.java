package com.claudio.teste.teste01;

public class Programa19 {
	public static void main(String[] args) {
	
		int num[][] = new int[3][3];
		num[0][0] = 1; 
		num[0][1] = 2;
		num[0][2] = 3;
		num[1][0] = 4;
		num[1][1] = 5;
		num[2][2] = 6;
		num[3][0] = 7;
		num[3][1] = 8;
		num[3][2] = 9;
		
		for (int i = 0; i<num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = i+j *2;
			}
		}
	
		for (int i = 0; i<num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
		System.out.println("numeros ["+ i + "][" + j +"] = " + num[i][j] );
			}
	
		}
	
	}
}
