package br.com.geekuniversity.secao19;

import java.util.HashMap;
import java.util.Map;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*HasMap
 * 
 * A classe HasMap implementa a interface Map e trabalha com o conceito chave/valor
 *  não aceita chaves duplicados, mas valores sim
 */

public class Programa49 {

	public static void main(String[] args) {
		
		//map<k,V) onde k (no caso é String) e a chave key e V é o valor no nosso caso a conta 
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cli1 = new Cliente(24, "Angelina Jolie", "Rua 1");
		Cliente cli2 = new Cliente(34, "Angelina Jolie", "Rua 2");
		
		Conta c1 = new Conta(1,200,300, cli1);
		Conta c2 = new Conta(2,400,500, cli2);
		
		contas.put("Pessoa Fisica", c1);
		contas.put("Pessoa Juridica", c2);
		contas.put("Pessoa Fisica", c1);
		
		System.out.println(contas.size());
		//System.out.println("Pessoa Fisica");
		
		
		

	}

}
