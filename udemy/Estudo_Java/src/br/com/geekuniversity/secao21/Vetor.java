package br.com.geekuniversity.secao21;

import java.util.Arrays;

public class Vetor {
	private Aluno alunos[]= new Aluno[100];
	private int total =0;
	
	
	public void adiciona(Aluno aluno) {
		garantirEspaco() ; 
		this.alunos[total] = aluno;
		total = total + 1;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		garantirEspaco();
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		for (int i = total -1; i >= posicao; i--) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total ++;
	}
		
	public Aluno pega(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posição invalida");
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posição invalida");
		}
		for (int i = posicao; i<this.total; i++ ) {
			this.alunos[i] = this.alunos[i+1];
		}
		total --;
	}
	
	public boolean contem(Aluno aluno) {
		for(int i =0; i<total; i++) {
			if(aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		
		return this.total;
	}
	
	@Override
	public String toString() {
		
		return Arrays.toString(this.alunos);
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}
	
	private void garantirEspaco() {
	// verifica se o vetor alunos esta cheio
		if(total == alunos.length) {
			// se estiver cheio, criar o novoArray com o dobro das posições do anterior
			Aluno novoArray[] = new Aluno[alunos.length*2];
		// copia todos os dados do array alunos e passa para o novoArray
			for (int i =0; i<alunos.length; i++) {
				novoArray[i]= alunos[i];
			}
			// por ultimo atribui o novo array ao array original
			this.alunos = novoArray;
		}
	}
	
	

}
