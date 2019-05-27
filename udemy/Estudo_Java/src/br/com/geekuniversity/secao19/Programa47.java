package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.geekuniversity.secao11.Cliente;



public class Programa47 {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente(25,"João da Silva", "Rua da paz,45");
		Cliente cli2 = new Cliente(18,  "Andreia da Silva", "Rua da paz,5");
		Cliente cli3 = new Cliente(16,  "Maria da Silva", "Rua da paz,5");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		Collections.sort(clientes);
		
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
			/// pasta Estudo java
			// teste
		}

	}

}
