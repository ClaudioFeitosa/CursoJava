package br.com.geekuniversity.secao15;
/*
 * Atributos est�ticos
 * Atributos estaticos s�o atributos, onde os valores s�o compoartilahdos entre
 * as instancias da classe (criamos uma especie de indice aqui)
 *  para usar um atributo da classe :
 *  NomeDaClasse.atributo
 * 
 */
public class Programa34 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Ana Paula");
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2 = new Conta("Manuela");
		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());
		
		Conta c3 = new Conta("Victor");
		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());
		

	}

}
