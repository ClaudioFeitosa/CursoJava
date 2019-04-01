package Secao04Exercicios;

import java.util.Scanner;
public class e9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float salario, prestacao;
		
		System.out.print("informe o salario : ");
		salario = teclado.nextFloat();
		
		System.out.print("informe o valor da prestação : ");
		prestacao= teclado.nextFloat();
		
		float percent = (prestacao*100)/salario;
		
	
		if (percent > 20)
			System.out.println("emprestimo negado");
			else
				System.out.println("emprestimo concedido");

		teclado.close();
	}

}