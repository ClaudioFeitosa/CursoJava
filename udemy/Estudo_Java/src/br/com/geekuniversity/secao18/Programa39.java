package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa39 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Claudio", "rua 1, 1245");
		Cliente cli2 = new Cliente("Ana Paula", "rua 1, 1245");
		Conta cli3 = new Conta(3,390,400, new Cliente("Manu", "rua 1, 1245"));
		
		Conta c1 = new Conta(1,200,300,cli1);
		Conta c2 = new Conta(2,200,300,cli2);
	
		Caixa prateleira = new Caixa();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(cli3); // por padrão a instancia imprime com o toString
		
		
		/* vamos modificar o metodo equasls para verificar aoenas se o saldo for igual
		 *  ele dizer que as contas são iguais
		 *  para isso vamos fazer um override na clase conta
		 */
		if(c1.equals(c2)) { // 
			System.out.println("São a mesma conta");
		}else {
			System.out.println("São contas diferentes");
		}
	
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		//Conta conta = prateleira.pegar(0);
		
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo());// cast
		
		prateleira.adicionar(cli1); // não tem getSaldo()
		
		//System.out.println(((Conta)prateleira.pegar(2)).getSaldo());
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome()); // usando um cast com a classse cliente
	
		if ((Object) cli1 instanceof Conta) {
			System.out.println("o objeto é do tipo conta");
			
		} else {
			System.out.println("O objeto é do tipo Cliente");
		}
	
	}

}
