package Secao09Exerciciose2;

import java.util.Scanner;

public class Exercico02 {
	static Cadastro_pessoas Agenda_pessoas[] = new Cadastro_pessoas[2];
	static String pesquisar;
	static String deletar;
	static Scanner teclado = new Scanner(System.in);
	static char busca, excluir;
	public static void main(String[] args) {
		
		String nome;
		int idade;
		float altura;
		
		System.out.println("digite os dados da pessoa");

		for (int i=0; i < Agenda_pessoas.length; i++) {
				System.out.println("informe o nome");
				nome = teclado.nextLine();
				System.out.println("informe a idade");
				idade = Integer.parseInt(teclado.nextLine());
				System.out.println("informe a altura");
				altura = Float.parseFloat(teclado.nextLine());
								
				Cadastro_pessoas armazenaAgenda = new Cadastro_pessoas (nome,idade,altura);
				
				Agenda_pessoas[i] = armazenaAgenda;
		}
	
	for (int i=0; i <Agenda_pessoas.length;  i++) {
		Agenda_pessoas[i].imprimeTudo();
	}

	// BUSCA PESSOA 
	
	System.out.print("Deseja realizar uma busca s/n");
		busca = teclado.nextLine().charAt(0);
		pesquisa(busca);
		
	// FIM DA BUSCA
	
		
		// ECLUIR PESSOA 	
	System.out.println("Deseja excluir um cadastro s/n");
	excluir = teclado.nextLine().charAt(0);
	excluirPessoa(excluir);

	
	teclado.close();	
	}
	
	// FUNC�OES 
	
	// FUN��O BUSCA PESSOAS
	static void pesquisa(char busca) {
		if (busca == 's') {
			
			System.out.print("Nome para pesquisar");
				pesquisar = teclado.nextLine();
				for (int i = 0; i< Agenda_pessoas.length; i++) {
					if (pesquisar.equals(Agenda_pessoas[i].getNome())) {
						Agenda_pessoas[i].buscaPessoa(i);
					}
				}
		} 
	}
	// FIM DA FUN��O DE BUSCA

	// INICIO DA FUN��O EXCLUIR
	static void excluirPessoa(char excluir) {
		if (excluir == 's') {
			
			System.out.print("Nome para excluir");
				deletar = teclado.nextLine();
					for (int i=0; i<Agenda_pessoas.length-1; i++) {
						if (deletar.equals(Agenda_pessoas[i].getNome()))
							for (int j =0; j < Agenda_pessoas.length-1;j++) {
								Agenda_pessoas[j]= Agenda_pessoas[j+1];
								}	
						Agenda_pessoas[i].imprimeTudo();
					}
				}
		} // FIM DA FUN��O EXCLUIR
}

	
