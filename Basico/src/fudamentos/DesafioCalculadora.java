package fudamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		//Criar scanner
		Scanner sc = new Scanner(System.in);
		
		//Variaveis
		double n1, n2, resultado;
		String operacao;
		
		//Scannear numeros
		System.out.print("Digite o primeiro n�mero: ");
		n1 = sc.nextDouble(); 
		System.out.print("Digite o segundo n�mero: ");
		n2 = sc.nextDouble(); 
		
		//Scannear operacao
		System.out.print("Digite a opera��o desejada: ");
		operacao = sc.next();
		
		//Caso soma
		resultado = operacao.equals("+") ? 
				(n1 + n2) : operacao.equals("-") ?
						(n1 - n2) : operacao.equals("*") ?
								(n1 * n2) : operacao.equals("/") ?
										(n1 / n2) : operacao.equals("%") ?
												(n1 % n2) : 0.0001;
		
		//Saida
		System.out.printf((resultado == 0.001) ? 
				"Digite uma opera��o v�lida!" : "O resultado �: %.2f", resultado); 
		
		
		//Encerrar scanner
		sc.close();
	}
}
