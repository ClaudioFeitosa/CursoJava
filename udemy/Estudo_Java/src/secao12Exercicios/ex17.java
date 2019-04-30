package secao12Exercicios;

public class ex17 {

	public static void main(String[] args) {
	
		Eletrodomestico e1 = new Eletrodomestico("Microondas",true,"Desligado");
		System.out.println(e1);
		
		System.out.println("\nMetodo ligar");
		e1.liga();
		System.out.println(e1);
		
		System.out.println("\nMetodo desligar");		
		e1.desliga();
		System.out.println(e1);

	}

}
