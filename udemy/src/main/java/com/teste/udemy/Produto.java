package com.teste.udemy;

//Classes aula1
/*
 * O nome da classe se inicia com letra Maiuscula 
 * Não pode conter Espaço, nem caracteres especiais
 * Uma Classe não tem o metodo Main
 * O nome da Classe JAVA DEVE ser o mesmo nome do arquivo
 * Estrutura da Classe
 * Tudo que esta dentro da chave {} é da Classe
 * public class NomeDaClasse {
 *
 *		}	
 *
 */

//Atributos
/*
 * São as caracteristicas da classe/molde/modelo de dados;
 * Atributos são as variaveis da classe
 */

// Metodos
/*
 * 
 */
public class Produto {
	String nome;
	float preco;
	float desconto;
	
	//Metodo para aumentar o preço de um produto em 10
	void aumentar_preço(float valor) {
		this.preco = this.preco +valor;
	}
	
	

}
