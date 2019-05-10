package br.com.geekuniversity.secao17;

import java.util.Scanner;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*Gernado Executavies 
 * JAR - JAVA ARCHIVE
 * 
 */
public class Principal {

		static Cliente Cliente  = new Cliente("Claudio Feitosa", "Av. queiroz filho, 45");
		static Conta conta = new Conta(1,200,300,Cliente);
		static Scanner teclado = new Scanner(System.in);
		public static void depositar() {
			
		System.out.println("=========Depósito========");
		System.out.println("informe o valor do deposito");
		float valor = teclado.nextFloat();
		if (valor >0) {
			conta.depositar(valor);
			System.out.println("Depósito realizado com sucesso");
			
		}else {
			System.out.println("Valor invalido");
		}
				
		}
		
public static void sacar() {
			
		System.out.println("=========saque========");
		System.out.println("informe o valor do saque");
		float valor = teclado.nextFloat();
		if (valor >0) {
			conta.sacar(valor);
				
		}else {
			System.out.println("Valor invalido");
		}
				
		}
		
		public static void consultar() {
			System.out.println("O Saldo atual é: " + conta.getSaldo());
		}
		
		public static void main (String[] args) {
			int opcao =0;
			System.out.println("Bem vindo ao banco ");
		
			
			do {
				
				
				System.out.println("digite 1 Para realizar depósito");
				System.out.println("digite 2 Para realizar saque");
				System.out.println("digite 3 Para realizar consulta");
				System.out.println("digite 0 Para sair");
				opcao = teclado.nextInt();
				
				switch (opcao) {
				case 1:
					depositar();
					break;
				case 2:
					sacar();
					break;
				case 3:
					consultar();
					break;
				case 0:
					
					break;
								
				default: 
					System.out.println("Opção invalida");
				break;
				}
			} while (opcao > 0);
			teclado.close();
		}
		
		
	

}
