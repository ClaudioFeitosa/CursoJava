package br.com.geekuniversity.secao20;

/* SIMULA��O DE GERA��O DE RELATORIO COM BARRA DE PROGRESSO
 * SEM A UTILIZA�AO DE THREADS
 */


public class Programa51 {

	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.executa();
		

	}

}
