package br.com.geekuniversity.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//conjuntos
/*
 * os conjuntos são implementados com a interface 7;
 * uma das classes que implementa esta interfaçe é a HashSet
 * A maioria das coleções possui os mesmos metodos ja conhecidos e utilizados com as listas
 * mas o comportamento é um pouco diferente
 * a performance é maior nos conjutos que as listas
 * 
 * A ordem de inserção não é respeitada (realiza uma semi ordenação)
 * Não aceita a ordenação Sort()
 * Não possui indice
 * 
 */
public class Programa48 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for (int i=0; i< 5; i++) {
			System.out.println("Informe o " +(i+1) + "/5 nome");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			if(!res) {
				System.out.println("o nome não pode ser repetido");
				i--;
			}
		}
		
		System.out.println("no conjunto nomes temos " + nomes.size()+ " elementos");
		for(String nome: nomes) {
			System.out.println(nome);
		}
		teclado.close();
	}
}
