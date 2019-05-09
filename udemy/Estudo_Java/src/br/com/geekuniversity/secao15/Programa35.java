package br.com.geekuniversity.secao15;
/*Metodo estatico
 *  UM METODO ESTATICO NÃO DEPENDE DE UMA INSTANCIA DA CLASSE PARA SER UTILIZADO
 *  PODE SE UTILIZAR CONFORME
 *  
 *  NomeDaClasse();
 */
public class Programa35 {

	public static void main(String[] args) {
		Conta c1 = new Conta("CONTA DO METODO ESTATIcO");
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		System.out.println("A proxima conta sera " + Conta.proximaConta());

	}

}
