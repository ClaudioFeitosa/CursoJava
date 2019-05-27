package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

/*LISTAS
 * ARRAYS (vETORES E MATRIZES)
 *	Um array tem tamanho fixo
 *	Um Arrayy tem tipo de dados fixo 
 *  É dificil encontrar um determinado elemento em um array
 *  precisamos varrer todo o se indice
 *---
 * Colections (coleções)
 * Java possui diversas classes e interfaçes que facilitam muito o trabalho quando se trata de coleções de dados
 * 
 * 
 * LISTAS
 * -aceita repetição de valores
 * - possui tamanho infinito
 * - aceita qq valor desde que não especificado
 */

public class Programa45 {

	public static void main(String[] args) {
		//ArrayList nomes = new ArrayList(); -> sem especificar o tipo de dados
		
		ArrayList <String> nomes = new ArrayList<String>();
		
		nomes.add("Maria");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("Claudio");
		nomes.add("Maria");
		nomes.add("Angelina");
		
		
//		nomes.add(44);
//		nomes.add(true);
//		nomes.add(12.4);
//		nomes.add("e");
		
		
//		System.out.println(nomes.get(0));
//		System.out.println(nomes.get(3));
//		
//		System.out.println(nomes.size());
//		for (int i =0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
	
		Collections.sort(nomes);
		// foreach
		// neste caso se não for especificado o tipo de dados
//		for(Object nome : nomes) {
//			System.out.println(nome);
//		}
//neste caso porque definimos o tipo de dados no momento da declaração
		for(String nome : nomes) {
			System.out.println(nome);
		}

	}

}
