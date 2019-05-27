package br.com.geekuniversity.secao21;

/*Armazenamento sequencial (relacionado a vetores)
 * int numeros[] = new int[5]
 * numeros[0] = 1;
 * numeros[1] = 3;
 * numeros[2] = 5;
 * numeros[3] = 7;
 * numeros[4] = 9;
 * 
 */
public class Programa55 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Felicity");
		
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);
		
		System.out.println("Total de alunos: " +lista.tamanho());
		
		System.out.println(lista.contem(a1));
		
		try {
			System.out.println(lista.pega(101));
		}catch (IllegalArgumentException e) {
			System.out.println("O aluno da posi��o pesquisada n�o existe");
			System.out.println(e.getMessage());
		}

		Aluno a3 = new Aluno("Maria");
		try {
			lista.adiciona(101, a3);
		} catch (IllegalArgumentException e) {
			System.out.println("a posi��o indicada n�o existe");
			System.out.println(e.getMessage());
		}
		
		lista.remove(0);
		System.out.println(lista);
		
	}

}
