package secao12Exercicios;


public class ex09_moto {
	
	public static void main(String[] args) {

	Moto m1 = new Moto("Honda", "Lead", "Vermelha",1, false);
	
	//MotoAtiva m2 = new MotoAtiva("Yes","Honda", "Lead", "Vermelha",4);
	System.out.println("=======================================Moto Ativa=====================================");

	System.out.println(m1);
	
	m1.ligarMoto();
	System.out.println("metodo ligar moto ativo");
	m1.marchaAcima();
	m1.marchaAcima();
	System.out.println(m1);
	

	}
}
