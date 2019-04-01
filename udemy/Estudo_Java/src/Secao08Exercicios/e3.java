package Secao08Exercicios;

import java.util.Scanner;

public class e3 {
	static int retorno, numero;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe o numero para validação");
		numero = teclado.nextInt();
		
	
		System.out.println("o numero de retorno é " + verifica(retorno));
	
		teclado.close();
		
	}

	static int  verifica(int n) {
	if (numero > 0) {
		retorno = 1;
	} else if  (numero < 0) {
		retorno = -1;
	}else
		retorno = 0;

	return retorno;
	}
}
