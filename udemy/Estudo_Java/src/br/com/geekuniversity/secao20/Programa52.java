package br.com.geekuniversity.secao20;
/* SIMULA��O DE GERA��O DE RELATORIO COM BARRA DE PROGRESSO
 * com A UTILIZA�AO DE THREADS
 */
public class Programa52 {

	public static void main(String[] args) {
		
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
	
	
		GeraRelatorio relatorio = new GeraRelatorio();
		Thread t2 = new Thread(relatorio);
		t2.start();
	
	}
}
