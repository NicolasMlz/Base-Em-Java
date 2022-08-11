package arrays;

import java.util.Scanner;

public class DesafioMatriz {
	public static void main(String[] args) {
		
		//Criar scanner
		Scanner sc = new Scanner(System.in);
		
		//Variaveis
		int qtdeNotas, qtdeAlunos;
		double total=0, media;

		//Scanear
		System.out.printf("Quantidade de alunos: ");
		qtdeAlunos = sc.nextInt();
		System.out.printf("Quantidade de notas por aluno: ");
		qtdeNotas = sc.nextInt();
		double notas[][] = new double[qtdeAlunos][qtdeNotas];
		
		//Registrar notas
		for(int i=0; i<qtdeAlunos; i++) {
			for(int j=0; j<qtdeNotas; j++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", j+1, i+1);
				notas[i][j] = sc.nextDouble();
				total += notas[i][j];
			}
		}
		
		//Media
		media = total/(qtdeAlunos*qtdeNotas);
		
		//Saida
		System.out.printf("A média da turma é de %.1f.\n", media);

		//Encerrar scanner
		sc.close();
	}
}
