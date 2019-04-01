package Secao08Exercicios;

import java.util.Scanner;
public class e2 {
	static Scanner teclado = new Scanner(System.in);
	static String mes_extenso;
	
	public static void main(String[] args) {
		
		int dia = 0, mes, ano = 0;
				
		System.out.println("digite o dia");
		dia = teclado.nextInt();
		System.out.println("digite o mes");
		mes = teclado.nextInt();
		System.out.println("digite o ano");
		ano = teclado.nextInt();
		mes_extenso = mes_convertido(mes);
		
		System.out.println("a data é "+ dia+ " " + mes_extenso + " " + ano);
	}

	static String mes_convertido(int mes) {
	switch (mes) {
	case 1:
		mes_extenso = "Janeiro";
		
		break;
	case 2:
		mes_extenso = "Fevereiro";
		
		break;
	case 3:
		mes_extenso = "Março";
		
		break;
	case 4:
		mes_extenso = "Abril";
		
		break;
	case 5:
		mes_extenso = "Maio";
		
		break;
	case 6:
		mes_extenso = "Junho";
		
		break;
	case 7:
		mes_extenso = "Julho";
		
		break;
	case 8:
		mes_extenso = "Agosto";
		
		break;
	case 9:
		mes_extenso = "Setembro";
		
		break;
	case 10:
		mes_extenso = "Otubro";
		
		break;
	case 11:
		mes_extenso = "Novembro";
		
		break;
	case 12:
		mes_extenso = "Dezembro";
		
		break;
	default:
		mes_extenso = "Mes invalido";
		break;
	}	
		
		return mes_extenso;
		
	}
	

		
	
}
