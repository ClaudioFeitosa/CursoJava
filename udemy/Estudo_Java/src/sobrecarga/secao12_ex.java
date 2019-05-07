package sobrecarga;

public class secao12_ex {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(123,"Claudio", 41);
		
		p1.exibe();
		
		System.out.println("metodos");
		
		p1.exibe(2);
	}

}
