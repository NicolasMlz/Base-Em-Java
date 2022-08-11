package fudamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variaveis
		String s1, s2, s3;
		double sal1, sal2, sal3, media;
		
		//Entradas
		System.out.println("Digite os 3 últimos salários do funcionário: ");
		s1 = sc.nextLine().replace(",", ".");
		s2 = sc.nextLine().replace(",", ".");
		s3 = sc.nextLine().replace(",", ".");
		
		//Converter para double
		sal1 = Double.parseDouble(s1);
		sal2 = Double.parseDouble(s2);
		sal3 = Double.parseDouble(s3);
		
		//Calcular media
		media = (sal1 + sal2 + sal3)/3;
		
		//Saida
		System.out.printf("A média do funcionário é: %.2f\n", media);
		
		//Fechar scanner
		sc.close();
	}
}
