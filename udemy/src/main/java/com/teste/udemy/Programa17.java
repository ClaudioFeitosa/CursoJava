package com.teste.udemy;

// Vetores parte 2

public class Programa17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor " + numeros.length);
		
		for (int i =0; i < numeros.length; i++ )
		{
			numeros[i] = i+3;
		}

		System.out.println(numeros[0]);
		System.out.println(numeros[9]);
		
		//for (int p =0; p <numeros.length; p++)
		for (int i =0; i < numeros.length; i++ )
		{
		System.out.println("imprimindo meu vetor " + numeros[i]);	
		}
		
		// outra maneira de preencehr o arrray, usando uma bibliotreca do java
		for(int i = 0; i < numeros.length; i++)
		{
			numeros[i] = (int)Math.round(Math.random()*10);
			
		}

		for (int i =0; i < numeros.length; i++ ) 
		{
		System.out.println("imprimindo meu vetor usando Math " + numeros[i]);	
		}

		for (int i : numeros) { // usando o foreach nessa caso e mais facil, porem nao tem condição de parada
			System.out.println(i);
		}
	}

}
