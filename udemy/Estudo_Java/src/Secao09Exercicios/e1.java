package Secao09Exercicios;

import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
	
		
		Pessoa pessoas[] = new Pessoa[4];
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;
		float altura;
		
		
		System.out.println("digite os dados da pessoa");
		
		for (int i=0; i < pessoas.length; i++) {
				System.out.println("informe o nome");
				nome = teclado.nextLine();
				System.out.println("informe a idade");
				idade = Integer.parseInt(teclado.nextLine());
				System.out.println("informe a altura");
				altura = Float.parseFloat(teclado.nextLine());
								
				//novapessoa[i].novapessoa(nome, altura, idade);
				Pessoa agenda = new Pessoa(nome,idade,altura);
				pessoas[i] = agenda;
		}

		teclado.close();
		
			for (int i=0; i <pessoas.length; i++) {
				pessoas[i].imprimeTudo();
			}
		}		
	}

	
