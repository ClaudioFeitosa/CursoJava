package br.com.geekuniversity.secao13;

import br.com.geekuniversity.secao12.Aluno;
import br.com.geekuniversity.secao12.Pessoa;

/* classes abstratas
 *  � um recurso que porporciona um bloqueio na cria��o de objetos
 *  n�o conseguimos instanciar objetos de uma classe abstrata
 *  Geralmente a classe base � generica
 *  uma classe abstrata pode ter Atributos, metodos e metodos abstratos
 */

public class Programa31 {

	public static void main(String[] args) {

		Aluno maria = new Aluno("Claudio ", 1999, "RA123");
	
	System.out.println(maria);
	
	maria.outra_msg("Eu sou " + maria.getNome());
	
	
	}

}
