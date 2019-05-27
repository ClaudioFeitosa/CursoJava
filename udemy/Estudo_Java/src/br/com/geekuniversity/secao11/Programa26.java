package br.com.geekuniversity.secao11;

public class Programa26 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(40,"Claudio", "Avenida queiroz filho");
		
		
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Nome: " + cli1.getEndereco());
		
		Cliente cli2 = new Cliente(40,"Ana Paula", "Avenida queiroz filho");
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Nome: " + cli2.getEndereco());

	}

}
