package Aulas;
// Instru��o Swith
public class Programa06 {

	public static void main(String[] args) {
		int numero = 7;
		
		
		switch (numero) {
			case 1:
				System.out.println("o numero � 1");
			
			break;
			case 3:
				System.out.println("o numero � 3");
			
			break;

		
			case 5:
				System.out.println("o numero � 5");
			
			break;

			
			default:
				System.out.println("[Default] o numero � " + numero);

			break;
		}
	}

}
