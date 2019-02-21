package Exercicio01;
import java.util.Scanner;

public class Exercicio01 {


	public static void main(String[] args) {
		
		Pessoa pessoa[] = new Pessoa[1];
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("======================================== CADASTRO DE PESSOAS  ========================================");
		System.out.println("Informe os dados ");
		
		for(int i = 0; i < pessoa.length; i++) {
			System.out.print("Nome: ");
			String nome = teclado.nextLine();
		
			System.out.print("Idade: ");
			int idade = Integer.parseInt(teclado.nextLine());
		
			System.out.print("Altura: ");
			float altura = Float.parseFloat(teclado.nextLine());

			Pessoa novaPessoa = new Pessoa(nome,idade,altura);
			pessoa[i] = novaPessoa;
				
			}
	
		for(int i = 0; i <pessoa.length; i++) {
			System.out.println(pessoa[i].getNome() +" tem " 
					+ pessoa[i].getIdade() + " anos, e tem " 
					+ pessoa[i].getAltura()+" de altura");
			}
		teclado.close();
	}

}



