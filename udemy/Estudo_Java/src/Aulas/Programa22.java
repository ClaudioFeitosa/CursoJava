package Aulas;
// objetos são produtos / instancias da classe
public class Programa22 {

	public static void main(String[] args) {
		/*declaração e instanciando o opjeto da classe produto
		 * p1 é uma instacia do objeto 
		 */
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("===================== PRODUTOS ====================");
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.desconto);
		
		Produto p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 2.45f;
		p2.desconto = 5;
		System.out.println("");
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.println(p2.desconto);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Claudio";
		pessoa1.email = "teste@teste.com";
		pessoa1.ano_nascimento = 1977;
		
		System.out.println("===================== PESSOAS ====================");
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.email);
		System.out.println(pessoa1.ano_nascimento);
		
				
		
		
		
	}

}
