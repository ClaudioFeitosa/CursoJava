package Exercicios;
import java.util.Scanner;

import Exercicios.teste.Pessoa;

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
					
			for(int i = 0; i <pessoas.length; i++) {
				System.out.println(pessoas[i].getNome() +" tem " 
						+ pessoas[i].getIdade() + " anos, e tem " 
						+ pessoas[i].getAltura()+" de altura");
			}
		
 		
		teclado.close();
	}


}