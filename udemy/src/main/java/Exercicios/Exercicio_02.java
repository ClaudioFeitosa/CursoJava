package Exercicios;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda aluno[] = new Agenda[4];
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("======================================== CADASTRO DE PESSOAS  ========================================");
		System.out.println("Informe os dados para Registro ");
	
		for(int i = 0; i < aluno.length; i++) {
			System.out.println("Nome:		 ");
			String nome = teclado.nextLine();
			System.out.println("Idade:	 ");
			int idade = Integer.parseInt(teclado.nextLine());
			System.out.println("Altura:	 ");
			float altura = Float.parseFloat(teclado.nextLine());
			
			Agenda armazenaPessoa = new Agenda(nome,idade,altura);
			aluno[i] = armazenaPessoa;
			
		// Bloco imprime toda a lista
		}
		
		Agenda.cabecalho();
		// imprime todos os alunos	
		for(int i = 0; i <aluno.length; i++) {
			aluno[i].imprimeLista(i);
			}

		// fim Bloco imprime toda a lista
			
		
		// Bloco de pesquisa
		
		System.out.print("Deseja realizar uma busca s/n");
			
		char busca = teclado.nextLine().charAt(0);
		if (busca == 's') {
		
		System.out.print("Nome para pesquisar");
			String pesquisa = teclado.nextLine();
			Agenda.cabecalho();
			for (int i = 0; i< aluno.length; i++) {
				
				if (pesquisa.equals(aluno[i].getNome())) {
					aluno[i].imprimePesquisa(i);
				}
			}
		} 
			
			// Fim do Bloco de pesquisa
			
			// Bloco de Excluir 
		
		System.out.print("Deseja excluir s/n");
		char excluir = teclado.nextLine().charAt(0);
		if (excluir == 's') {

			System.out.print("Nome para excluir");
			String deletar = teclado.nextLine();
			Agenda.cabecalho();
			for (int i = 0; i< aluno.length-1; i++) {
				if (deletar.equals(aluno[i].getNome()))
					for (int j = 0; j < aluno.length-1; j++) {
					aluno[j] = aluno[j+1];
					}
					aluno[i].imprimeLista(i);
			}
		
		}
	
		// Fim do Bloco de Excluir 
		
		teclado.close();
	}
}



