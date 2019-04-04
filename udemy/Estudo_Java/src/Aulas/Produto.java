package Aulas;

/* Classe 
 *  * 
 * O nome da Classe inicia com letra maiuscula
 * o nome não pode conter caracteres especiais
 * na classe não existe a função main() 
 * toda classe possui a seguinte forma
 * public class Pessoa {
 * 
 * }
 */

/*ATRIBUTOS
 * 	Carateristicas da classe/modelo/modelo de dados
 * Podemos entender ATRIBUTOS como variaveis da classe
 * outra forma de enender os ATRIBUTOS a que são estados
 * Atribustos = sempre com letra minuscula, sem espaços, sem caracteres especiais
 * sem acentuação
 * 
 */

/*METODOS
 * Podemos entender metodos como a AÇÃO que é realizada por um objeto da classe
 * metodos são compartamentos dos objetos da classe
 * 
 * possui os mesmos requisitos das funções 
 * - Tipo de retorno (tipo de dado que a funçaõ vai retornar)
 * - Nome Corrresponde a ação que a função realiza
 * - Parametros / argumentos de entrada (opcional) - void aumentar_preco(float valor) o valor aqui é o argumento/parametro
 * - Retorno (opcional - depende do tipo de retorno) 
 * 
 */
public class Produto {
	
	//atributos da classe
	String nome;
	float preco;
	float desconto;

	// posso passar ou não um parameto no metodo 
	// exemplo sem parametro void aumentar_preco() {this.preco = this.preco + 10;}
	// exemplo com parameto
	// metdo é semelhante uma função, porem o metodo depende de uma classe
	// compiortamento = aumentar o preço
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
	
	
}
