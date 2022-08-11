package estruturasDeControle;

import java.util.Scanner;

public class WhilerComString {
	public static void main(String[] args) {
		
		//Criar scanner
		Scanner sc = new Scanner(System.in);
		
		//Variaveis
		String palavra = "";
		
		//Laço
		while(!palavra.equalsIgnoreCase("SAIR")) {
			System.out.printf("Digite a sua palavra: ");
			palavra = sc.next();
		}
		
		//Encerrar
		System.out.printf("Fim!\n");
		sc.close();
	}
}
