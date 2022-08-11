package fudamentos;

public class temperatura {
	
	public static void main(String[] args) {
		
		//Constantes e variaveis
		final double AJUSTE = -32;
		final double FATOR = 5.0/9.0;
		double tempF = 27, tempC;

		
		//Saida
		System.out.println("A temperatura em Fareheint é: " + tempF + " F.");
		System.out.println("Convertendo para graus celsius fica...");
		
		//Calculo
		tempC = (tempF + AJUSTE) * FATOR;
		
		//Saida
		System.out.println("A temperatura em Celsius é: " + tempC + "C.");
		
	}
}
