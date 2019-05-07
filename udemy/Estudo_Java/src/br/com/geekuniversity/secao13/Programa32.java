package br.com.geekuniversity.secao13;

public class Programa32 {
	
	/* O padrão Template Method define o esqueleto de um algoritimo dentro de um metodo
	 * transferindo alguns de seus passoss para as subclasses. o Template Method permite
	 * que as subclasses redefinam certos passos de um algoritimo sem alterar a estrutura
	 * do proprio algoritimo
	 * Algoritimos são "receitas" passo a passo  para resolver um problema
	 * 
	 * receber numero;
	 * retornar numero * numero;
	 * 
	 * Metodo_principal
	 *  	passo1();
	 * 		passo2();
	 *  	passo3();
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		
		tit.treinoDiario();
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		
		tft.treinoDiario();
				
		
				

	}

}
