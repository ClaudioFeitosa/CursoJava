package br.com.geekuniversity.secao21;

public class ListaLigada {
	private Celula primeira = null;
	private int total = 0;
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, this.primeira);
		this.primeira = nova;
		
		this.total = this.total +1;
	}
	
	public void adiciona(Object elemento) {
		
	}
	
	public void adiciona(int posicao, Object elemento) {
		
	}
	
	public Object pega(int posicao) {
		//todo
		return null;
	}

	public void remove(int posicao) {
	// TODO
		
	}
	
	public int tamanho() {
		//TODO
		return 0;
	}
	public boolean contem(Object obj) {
		//TODO
		return false;
	}
	public String toString() {
		if(total == 0) {
			return "[]";
		}
		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("[");
		
		for (int i =0; i< total; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			
			atual = atual.getProximo();
			
		}
		builder.append("]");
		return builder.toString();
		
	}

}
