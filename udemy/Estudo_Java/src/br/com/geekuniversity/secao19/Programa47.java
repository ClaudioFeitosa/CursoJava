package br.com.geekuniversity.secao19;

import java.util.ArrayList;

import br.com.geekuniversity.secao11.Cliente;

public class Programa47 {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente("João da Silva", "Rua da paz,45");
		Cliente cli2 = new Cliente("Maria da Silva", "Rua da paz,45");
		
		clientes.add(cli1);
		clientes.add(cli2);
		
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
			/// atualizar
			//22222
			//4444
		}

	}

}
