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
			System.out.printf("Equivalente ao número 1");
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.printf("Equivalente ao número 2");
		} else if(dia.equalsIgnoreCase("terça")) {
			System.out.printf("Equivalente ao número 3");
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.printf("Equivalente ao número 4");
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.printf("Equivalente ao número 5");
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.printf("Equivalente ao número 6");
		} else if(dia.equalsIgnoreCase("sábado")) {
			System.out.printf("Equivalente ao número 7");
		} else {
			System.out.printf("Dia inválido");
		}
		
		sc.close();
	}
}
