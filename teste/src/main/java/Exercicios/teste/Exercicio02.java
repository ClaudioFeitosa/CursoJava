package Exercicios.teste;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoas[] = new Pessoa[4];
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
				
			System.out.print("Nome para excluir");
			String deletar = teclado.nextLine();
			
			for (int i = 0; i< pessoas.length-1; i++) {
				if (deletar.equals(pessoas[i].getNome()))
					
					for (int j = 0; j < pessoas.length-1; j++) {
						
						pessoas[j] = pessoas[j+1];
					}
				pessoas[i].excluido();
			}
			
			
 		
		teclado.close();
	}


}



