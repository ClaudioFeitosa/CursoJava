package com.teste.udemy;

// tipos booleanos
public class Programa14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// primitivo
		boolean verdeiro = true;
		boolean falso = false;
		
		// não primitivo
				Boolean v = true;
				Boolean f = false;
		// Exemplo de usarios para sistema
				
		boolean ativo = false;
		
		System.out.println("boolean verdeiro " +verdeiro);
		System.out.println("boolean falso " +falso);	
		System.out.println("Boolean V " + v);
		System.out.println("Boolean F " + f);		
		
		if(verdeiro)
		{
			System.out.println("É Verdadeiro");
		} else
		{
			System.out.println("É Falso");

		}
		
		if(ativo) 
		{
			System.out.println("pode acessar");
		} else
		{
			System.out.println("Acesso negado");
		}

	}

}
