package Aulas;

/*O construtor sempre tem o mesmo noma da classe
 * podemos ter mais de um contrutor na classe
 * por padr�op a JVM cria em tempo de exec um construtor padr�o (um constreutor sdem parametrps ()
 */

public class Programa24 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Pessoa pessoa1 = new Pessoa(); //metodo construtor
			
			pessoa1.nome = "Claudio";
			pessoa1.email = "Teste@teste.com";
			pessoa1.ano_nascimento = 1977;
			
			
			System.out.println("===================== PESSOAS ====================");
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.email);
			System.out.println(pessoa1.ano_nascimento);
			
			Pessoa pessoa2 = new Pessoa("Manu", "email@eamil.com", 2010);
			pessoa2.imprime_informa��es();
		
			
			
			
		
	}

}
