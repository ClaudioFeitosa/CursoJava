package secao12Exercicios;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televisor tv1 = new Televisor(true, 01,02);
		
		//System.out.println("TV _canal: " + tv1.getCanal());
		tv1.imprimeTV();
		
		tv1.Desligar();
		System.out.println("executando o metodo de desligar e conferindo");
		tv1.imprimeTV();
		tv1.Ligar();
		System.out.println("executando o metodo de ligar e conferindo");
		//tv1.imprimeTV();
		
		tv1.canalAcima();
		tv1.canalAcima();
		tv1.canalAcima();
		tv1.canalAcima();

	//	tv1.imprimeTV();
		tv1.canalAbaixo();
		tv1.canalAbaixo();
		tv1.canalAbaixo();
		tv1.canalAbaixo();
		tv1.canalAbaixo();
		tv1.canalAbaixo();
		tv1.canalAbaixo();
		
		
		
		tv1.volumemaxAbaixo();
		tv1.volumemaxAbaixo();
		tv1.volumemaxAbaixo();
		tv1.volumemaxAbaixo();
		
		tv1.imprimeTV();
		
		
		
			

		
		
	}


}