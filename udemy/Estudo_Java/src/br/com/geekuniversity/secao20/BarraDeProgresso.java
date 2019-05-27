package br.com.geekuniversity.secao20;

/*para execultar metodos em paralelo, nossa classe deve implementar a interface 
 * RUNNABLE, e o metodo que precisa ser executado em paralelo deve ser executado
 * dentro do metodo run
 * 
 */

public class BarraDeProgresso implements Runnable{
	
	public void executa() {
		for (int i = 0; i<=1000; i++) {
			System.out.println(i + " Barra de progresso .... aguarde ....." + i +"/10000");
		}
	}


	@Override
	public void run() {
		for (int i = 0; i<=1000; i++) {
			System.out.println(i + " Barra de progresso .... aguarde ....." + i +"/10000");
		}
		
	}

}
