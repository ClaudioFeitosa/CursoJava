package br.com.geekuniversity.secao11;

/*Getters e setters
 * Getter : é um metodo publico que serve rpara consultar dados 
 * -- A NOMECLATURA destes metdodos é getnomedoAtributo()
 * 
 */

public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;
	
	// construtor
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero=numero;
		this.saldo=saldo;
		this.limite=limite;
		this.cliente=cliente;
	}
/**
 *  metodos sacar
 * @param valor
 */
	public void sacar(float valor) {
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}else if (valor <= (this.saldo + this.limite)) {
			// calculando o valor excedente]=
			// 100 - 200 -> -100
			
			float val_ret = this.saldo -valor;
			if (val_ret < 0);
			this.saldo =0;
			
			val_ret = (this.limite + val_ret);
			this.limite = val_ret;
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("saldo insuficente");
		}
		
	}
	/**
	 * Mewtodo depoisitar
	 * @param valor a ser deposititado
	 */
	// forma 1
//	public void depositar1(float valor) {
//		synchronized (this) {
//			this.saldo = this.saldo + valor;
//		}
//	}
	
	// forma 2
	
	public synchronized void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	
	public float getSaldo() {
		return this.saldo+ this.limite;
		
	}
	
	
	@Override
	public String toString() {
		return "O saldo da conta é: " + this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) {
			return false;
		}else {
		Conta verificar = (Conta) obj; // fazendo um cast da conta onde o (Object obj) é o meu c2 la do programa 39
		return verificar.getSaldo() == this.getSaldo();
		}
	}
}
