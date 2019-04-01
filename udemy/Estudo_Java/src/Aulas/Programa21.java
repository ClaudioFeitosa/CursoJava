package Aulas;
import java.util.Scanner;

public class Programa21 {
	static Scanner teclado = new Scanner(System.in);
	static int valor1 =4;
	static int valor2 =5; 
	
	public static void main(String[] args) {
	
		int res;
		 	
		res = soma(valor1, valor2);
		
		System.out.println("O resultado e " +  res);
	}
	
	static int soma(int v1, int v2) {
		return v1 + v2;
	}
	
}
