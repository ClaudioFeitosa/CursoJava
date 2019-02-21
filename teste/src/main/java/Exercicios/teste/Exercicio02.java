package Exercicios.teste;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoas[] = new Pessoa[2];
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("======================================== CADASTRO DE PESSOAS  ========================================");
		System.out.println("Informe os dados ");
	
		for(int i = 0; i < pessoas.length; i++) {
			System.out.print("Nome: ");
			String nome = teclado.nextLine();
			System.out.print("Idade: ");
			int idade = Integer.parseInt(teclado.nextLine());
			System.out.print("Altura: ");
			float altura = Float.parseFloat(teclado.nextLine());
			
			Pessoa novaPessoa = new Pessoa(nome,idade,altura);
			pessoas[i] = novaPessoa;
			
		}
		
		System.out.println("------------------------ todos ------------------------");
		for(int i = 0; i <pessoas.length; i++) {
				pessoas[i].imprimeTudo();
			}

			System.out.print("Nome para pesquisar");
			String pesquisa = teclado.nextLine();
			for (int i = 0; i< pessoas.length; i++) {
				if (pesquisa.equals(pessoas[i].getNome())) {
					pessoas[i].resultadoDeBusca();
					
				}
			}
				
			
 		
		teclado.close();
	}


}



