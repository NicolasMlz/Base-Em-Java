package estruturasDeControle;

import java.util.Scanner;

public class DesafioIfElse {
	public static void main(String[] args) {
		
		//Criar scanner
		Scanner sc = new Scanner(System.in);
		
		//Variaveis
		String dia;
		
		//Entrada
		System.out.printf("Digite o dia da semana: ");
		dia = sc.next();
		
		//Saidas
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.printf("Equivalente ao n�mero 1");
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.printf("Equivalente ao n�mero 2");
		} else if(dia.equalsIgnoreCase("ter�a")) {
			System.out.printf("Equivalente ao n�mero 3");
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.printf("Equivalente ao n�mero 4");
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.printf("Equivalente ao n�mero 5");
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.printf("Equivalente ao n�mero 6");
		} else if(dia.equalsIgnoreCase("s�bado")) {
			System.out.printf("Equivalente ao n�mero 7");
		} else {
			System.out.printf("Dia inv�lido");
		}
		
		sc.close();
	}
}
