package Aulas;

/* Estrutura IF, Else IF, Else
 * 
 */
public class Programa04 {

	public static void main(String[] args) {
		int num = 2;
		
		if (num >5) {
			System.out.println("Sim, o numero " + num + " � maior que 5");
		} else if (num == 5) {
			System.out.println(" O numero " + num + " � igual a 5");
		}else if (num %2 == 0) {
			System.out.println(" O numero " + num + " � par");
		}else {
			System.out.println("N�o, o numero " + num + " n�o � maior que 5");

		}
		
		
		
	}

}
