package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Maps
 * os mapas são representados em java pela interface Map
 * e mapeia seus eçementos utilizando o conceito de chave/valor
 * 
 * OS MAPAS SÃO CONHECIDOS COMO SE FOSSEM/REPRESENTASSEM 3 COLEÇÕES
 * 1 - COLEÇÃO DE CHAVES;
 * 2 - COLEÇÃO DE VALORES;
 * 3 - COLEÇÃO DE ASSOCIAÇÕES;
 */
public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(40, "Ana Paula");
		pessoas.put(41, "Claudio");
		pessoas.put(9, "Manu");
		pessoas.put(8, "Victor");
		
		//COLEÇÃO DE CHAVES;
		System.out.println("Chaves " + pessoas.keySet());
		
		//COLEÇÃO DE VALORES
		System.out.println("Valores " + pessoas.values());
		
		//COLEÇÃO DE ASSOCIAÇÕES;
		System.out.println("Associação " + pessoas.entrySet());
		
		
		
		
		System.out.println(pessoas.keySet());
		//opção disponivel a partir do java 8
		// ITERAR NA COLEÇÃO DE CHAVES
		
		// OPÇÃO 1
		
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
				
		//OPÇÃO2 
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(idade);
		}
		
		//ITEAR COM A COLEÇAÕ DE VALORES
		//FORMA1
		Collection<String> valores = pessoas.values();
		for (String nome : valores) {
			System.out.println("Collections " + nome);
		}
		
		// forma2
		
		pessoas.values().forEach(nome -> {
			System.out.println("for each na collection " + nome);
		});
		
		//ITERAÇÃO COM AS ASSOCIAÇÕES
			
		//FORMA 1
		System.out.println("ITERAÇÃO COM AS ASSOCIAÇÕES");
		
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for (Entry<Integer, String> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue() );
		}
		
		//forma 2
		
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue() );
		});
		

	}

}
