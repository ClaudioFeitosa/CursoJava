package br.com.geekuniversity.secao11;
/* Encapsulamento
 * capsula
 */
public class Programa25 {

	public static void main(String[] args) {
		Cliente joao = new Cliente("Jo�o da Silva", "Rua da paz,45");
		Cliente maria = new Cliente("Maria da Silva", "Rua da paz,45");
		
		Conta conta_joao = new Conta (1,100.0f,200.0f, joao);
		Conta conta_maria = new Conta (1,300.0f,500.0f, maria);
		
		System.out.println("Saldo do Jo�o (antes do saque) " + conta_joao.getSaldo());
		System.out.println("Saldo do Maria " + conta_maria.getSaldo());
		
		conta_joao.sacar(150);
		System.out.println("Saldo do Jo�o (depois do saque) " + conta_joao.getSaldo());


	}

}
