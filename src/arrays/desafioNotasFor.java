package arrays;

import java.util.Scanner;

public class desafioNotasFor {
	public static void main(String[] args) {
		
		//Criar scanner
		Scanner sc = new Scanner(System.in);
		int tamanho;
		double total = 0;

		//Scanear
		System.out.printf("Digite a quantidade de notas a serem registradas: \n");
		tamanho = sc.nextInt();
		double notas[] = new double[tamanho];
		
		//Registrar notas
		for(int i=0; i<tamanho; i++) {
			notas[i] = sc.nextDouble();
		}
		
		//Total
		for(double nota : notas) {
			total += nota;
		}
		
		//Saida
		System.out.printf("A média da turma é de: %.1f.\n", total/tamanho);

		//Encerrar scanner
		sc.close();
	}
}
