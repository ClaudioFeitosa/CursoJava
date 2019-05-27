package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Maps
 * os mapas s�o representados em java pela interface Map
 * e mapeia seus e�ementos utilizando o conceito de chave/valor
 * 
 * OS MAPAS S�O CONHECIDOS COMO SE FOSSEM/REPRESENTASSEM 3 COLE��ES
 * 1 - COLE��O DE CHAVES;
 * 2 - COLE��O DE VALORES;
 * 3 - COLE��O DE ASSOCIA��ES;
 */
public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(40, "Ana Paula");
		pessoas.put(41, "Claudio");
		pessoas.put(9, "Manu");
		pessoas.put(8, "Victor");
		
		//COLE��O DE CHAVES;
		System.out.println("Chaves " + pessoas.keySet());
		
		//COLE��O DE VALORES
		System.out.println("Valores " + pessoas.values());
		
		//COLE��O DE ASSOCIA��ES;
		System.out.println("Associa��o " + pessoas.entrySet());
		
		
		
		
		System.out.println(pessoas.keySet());
		//op��o disponivel a partir do java 8
		// ITERAR NA COLE��O DE CHAVES
		
		// OP��O 1
		
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
				
		//OP��O2 
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(idade);
		}
		
		//ITEAR COM A COLE�A� DE VALORES
		//FORMA1
		Collection<String> valores = pessoas.values();
		for (String nome : valores) {
			System.out.println("Collections " + nome);
		}
		
		// forma2
		
		pessoas.values().forEach(nome -> {
			System.out.println("for each na collection " + nome);
		});
		
		//ITERA��O COM AS ASSOCIA��ES
			
		//FORMA 1
		System.out.println("ITERA��O COM AS ASSOCIA��ES");
		
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
