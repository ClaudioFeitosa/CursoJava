package Secao09Exercicios;

import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
	
		
		Pessoa novapessoa = new Pessoa();
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("digite os dados da pessoa");
		
		System.out.println("informe o nome");
		novapessoa.nome = teclado.nextLine();
		System.out.println("informe a altura");
		novapessoa.altura = teclado.nextFloat();
		System.out.println("informe a idade");
		novapessoa.idade = teclado.nextInt();

		novapessoa.imprime();
		
	teclado.close();
}

}