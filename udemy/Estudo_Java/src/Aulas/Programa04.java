package Aulas;

/* Estrutura IF, Else IF, Else
 * 
 */
public class Programa04 {

	public static void main(String[] args) {
		int num = 2;
		
		if (num >5) {
			System.out.println("Sim, o numero " + num + " é maior que 5");
		} else if (num == 5) {
			System.out.println(" O numero " + num + " é igual a 5");
		}else if (num %2 == 0) {
			System.out.println(" O numero " + num + " é par");
		}else {
			System.out.println("Não, o numero " + num + " não é maior que 5");

		}
		
		
		
	}

}
