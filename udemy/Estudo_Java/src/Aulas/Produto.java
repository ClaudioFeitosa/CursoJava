package Aulas;

/* Classe 
 *  * 
 * O nome da Classe inicia com letra maiuscula
 * o nome n�o pode conter caracteres especiais
 * na classe n�o existe a fun��o main() 
 * toda classe possui a seguinte forma
 * public class Pessoa {
 * 
 * }
 */

/*ATRIBUTOS
 * 	Carateristicas da classe/modelo/modelo de dados
 * Podemos entender ATRIBUTOS como variaveis da classe
 * outra forma de enender os ATRIBUTOS a que s�o estados
 * Atribustos = sempre com letra minuscula, sem espa�os, sem caracteres especiais
 * sem acentua��o
 * 
 */

/*METODOS
 * Podemos entender metodos como a A��O que � realizada por um objeto da classe
 * metodos s�o compartamentos dos objetos da classe
 * 
 * possui os mesmos requisitos das fun��es 
 * - Tipo de retorno (tipo de dado que a fun�a� vai retornar)
 * - Nome Corrresponde a a��o que a fun��o realiza
 * - Parametros / argumentos de entrada (opcional) - void aumentar_preco(float valor) o valor aqui � o argumento/parametro
 * - Retorno (opcional - depende do tipo de retorno) 
 * 
 */
public class Produto {
	
	//atributos da classe
	String nome;
	float preco;
	float desconto;

	// posso passar ou n�o um parameto no metodo 
	// exemplo sem parametro void aumentar_preco() {this.preco = this.preco + 10;}
	// exemplo com parameto
	// metdo � semelhante uma fun��o, porem o metodo depende de uma classe
	// compiortamento = aumentar o pre�o
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
	
	
}
