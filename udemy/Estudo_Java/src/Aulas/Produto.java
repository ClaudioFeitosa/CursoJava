package Aulas;
//Classes

/*METODO
 * PODEMOS ENTENDER OS METODOS COMO A AÇÃO QUE E REALIZADA POR UM OBJETO DA CLASSE
 * metodos tmb são comportamentos dos objetos da nossa classe
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
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
	
	
}
