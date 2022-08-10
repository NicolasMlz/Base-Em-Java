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
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextDouble(); 
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextDouble(); 
		
		//Scannear operacao
		System.out.print("Digite a operação desejada: ");
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
				"Digite uma operação válida!" : "O resultado é: %.2f", resultado); 
		
		
		//Encerrar scanner
		sc.close();
	}
}
