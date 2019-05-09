package br.com.geekuniversity.secao14;
/* interfaces - o que é e quando utilizar
 * -- interfaces são conhecidas como contratos
 * ou seja são regras que devem ser seguidas
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
		
		System.out.println("A marca do ventilador é" + vent.MARCA);
		vent.Desligar(); // não mostra msg pq esta desligado
		vent.Ligar(); // mostra
		vent.Desligar(); // mostra

	}
	
}
