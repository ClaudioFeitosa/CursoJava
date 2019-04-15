package br.com.geekuniversity.secao11;

/*Getters e setters
 * Getter : � um metodo publico que serve rpara consultar dados 
 * -- A NOMECLATURA destes metdodos � getnomedoAtributo()
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
// metodos
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
			
		}else {
			System.out.println("saldo insuficente");
		}
		
	}
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	public float getSaldo() {
		return this.saldo+ this.limite;
		
	}
	
}
