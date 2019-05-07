package br.com.geekuniversity.secao13;

// Final é um modificador de acesso

public abstract class Treinamento {
	
	//Template method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}

	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino tatico....");
	}
	
	
}
