package br.com.geekuniversity.secao14;
/* interfaces - o que � e quando utilizar
 * -- interfaces s�o conhecidas como contratos
 * ou seja s�o regras que devem ser seguidas
 * imagine um contrado onde se deve implementar um 	bolo, e todos devem seguir algumas 
 * regras gerais
 * exemplo
 * o bolo deve ser de chocolate
 * o bolo deve ter cobertura
 * o bolo deve ser recheado
 * 
 * note q qq padaria que for implementar o bolo pode usar o chocolate de sua preferencia
 * fazer a cobertura como desejar
 * e tmb o recheio
 */

public class Programa33 {
	
	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador �" + vent.MARCA);
		vent.Desligar(); // n�o mostra msg pq esta desligado
		vent.Ligar(); // mostra
		vent.Desligar(); // mostra

	}
	
}
