package Secao09Exercicio03V2;

import java.util.Scanner;

public class ElevadorClasse {
	static Scanner teclado = new Scanner(System.in);

	int capacidade, andares, pessoas, andar,terreo, qtdAtual, chamar, andarAtual;
	
	public ElevadorClasse (int capacidade, int andares, int terreo) {
		this.capacidade = capacidade;
		this.andares = andares;
		this.terreo =terreo;
	}
	
	void imprimedadosPredio() {
		System.out.println("o predio tem " + getAndares() +" Andares e o elevador tem a capacidade de " + getCapacidade() + " de pessoas" );
	}
	
	//public int dados_do_elevador

// VALIDANDO o andar
	public int definir_andar(int x) {
		x=1;
		
		while (x==1) {
			System.out.println("digite o andar desejado");
			andar = teclado.nextInt();
			if (andar < 0 || andar > getAndares()) {
			System.out.println("andar invalido");
			} else if(andar > 0 || andar <= getAndares())
			
			break;
			}
			x =x+1;
		return andar;
		}

// FIM DA VALIDA��O DO A ANDAR

// VALIDANDO A CAPACIDADE
	public int definir_pessoas(int p) {
		p=1;
		
		while (p==1) {
			System.out.println("digite a quantidade de pessoas");
			pessoas = teclado.nextInt();
			qtdAtual = pessoas + getqtdAtual();
			
			if (qtdAtual > getCapacidade()) {
			System.out.println("numero excedente de pessoas");
			} else if(qtdAtual <= getCapacidade())
			
			break;
			}
			p =p+1;
		return pessoas;
		}
// FIM DA VALIDA��O DE CAPACIDADDE

// REALIZANDO A SAIDA DE PESSOAS
	public int definir_saida(int sair) {
		System.out.println("digite a quantidade de pessoas para sair");
		sair = teclado.nextInt();
		qtdAtual = (qtdAtual - sair);
		
		System.out.println("nova quantidade " +getqtdAtual());
		
		return qtdAtual;
		
	}

	// FIM DA SAIDA DE PESSOAS 
	
	void  elevadorAtivo() {	
		if (andarAtual < getAndar()) {
			System.out.println("subindo...");
			andarAtual = andar+andarAtual;
		}else if (andarAtual > getAndar()) {
			System.out.println("desce...");
			andarAtual = andar+andarAtual;
			
		}
	} 
	
	
	public int getqtdAtual() {
		
		return this.qtdAtual;
	}
	public int getPessoas() {
		return this.pessoas;
	}
	public int getChamar() {
		return this.chamar;
	}
	public int getCapacidade() {
		return this.capacidade;
	}
	public int getAndares() {
		return this.andares;
	}
	public int getTerreo() {
		return this.terreo;
	}
	
	public int getAndar() {
		return this.andar;
	}
	

	
	public int setCapacidade() {
		return this.capacidade;
	}
	public int setAndares() {
		return this.andares;
	}
	
	public int setTerreo() {
		return this.terreo;
	}
	
	public int setAndar() {
		return this.andar;
	}
	
}
