package fudamentos;

public class desafioArimeticos {
	public static void main(String[] args) {
		
		//Variaveis
		double fr1, fr2, frGeral;
		
		
		//Resolucao
		fr1 = Math.pow((6 * (3+2)), 2)/(3*2);
		fr2 = Math.pow(((1-5) * (2-7))/2, 2);
		frGeral = (Math.pow((fr1 - fr2), 3))/(Math.pow(10, 3));
		
		//Saida
		System.out.printf("O resultado da fração é: %.0f.\n", frGeral);
	}
}
