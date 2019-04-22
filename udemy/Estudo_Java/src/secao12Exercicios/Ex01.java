package secao12Exercicios;

public class Ex01 {

	public static void main(String[] args) {

		Pessoaex01 p2 = new Pessoaex01("Claudio", "Av. Queiroz filho", "123456");
		Pessoaex01 p3 = new Pessoaex01("Ana Paula", "Av. Queiroz filho", "33333");
		 
		System.out.println(p2.getNome());
				
		p2.imprime();
		
		System.out.println(p2);
		System.out.println(p3);
	}

}
