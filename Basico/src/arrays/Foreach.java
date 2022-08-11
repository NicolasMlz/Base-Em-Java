package arrays;


public class Foreach {
	public static void main(String[] args) {
		
		//Variaveis
		double notas[] = { 10, 5.6, 8.7, 6.5, 7.6};
		
		//Percorrer jeito 1
		for(int i=0; i<notas.length; i++) {
			System.out.printf("%.1f ", notas[i]);
		}
		System.out.printf("\n");
		for(double nota : notas) {
			System.out.printf("%.1f ", nota);
		}
		
	}
}
