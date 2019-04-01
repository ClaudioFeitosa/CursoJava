package Aula1;

public class VetorA {

	public static void main(String[] args) {
		
		int soma = 0;
		int A[] = {1, 0, 5, -2, -5, 7};
		soma= A[0]+A[1]+A[5];
		System.out.println("imprimindo a soma " +soma);
		A[4] = 100;
		
		for (int i =0; i<A.length; i++)
		System.out.println("imprimindo vetor A ="+ A[i]);
		

	}

}
