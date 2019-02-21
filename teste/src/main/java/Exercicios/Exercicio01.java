package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		float altura;
		int idade;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("======================================== CADASTRO DE PESSOAS  ========================================");
		System.out.println("Informe os dados ");
		
		System.out.print("Nome: ");
		nome = teclado.nextLine();
		
		System.out.print("Altura: ");
		altura = teclado.nextFloat();
		
		System.out.print("Idade: ");
		idade = teclado.nextInt();
		
		P1 Pessoa = new P1(nome, altura, idade);
		Pessoa.imprime();
		
		teclado.close();
	}
}
