package br.com.geekuniversity.secao21;

import br.com.geekuniversity.secao11.Cliente;

/*LISTA LIGADA / LINKEDLIST
 * 
 * Em um vetor, os elementos estão um do aldo do outro, enquanto em uma lista ligada (linkedList)
 * eles estão em lugares diferentes, porem um aponta para o outro, indicando o prox elemento
 * [0][3][1][2][5]4][null]
 * 
 * 
 */
public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		String nome = "Pedro";
		System.out.println(lista);
		
		lista.adicionaNoComeco("Maria");
		System.out.println(lista);
		lista.adicionaNoComeco("Angelina");
		System.out.println(lista);
		lista.adicionaNoComeco("Felicity");
		
		System.out.println(lista);
		lista.adicionaNoComeco(nome);
		
		int numero = 42;
		
		lista.adicionaNoComeco(numero);
		System.out.println(lista);
		
		Cliente cli1 = new Cliente(34, "Juliana Paes", "Rua 3");
		
		lista.adicionaNoComeco(cli1);
		System.out.println(lista);
	}

}
