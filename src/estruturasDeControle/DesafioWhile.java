package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		//Criar scanner
		Scanner sc = new Scanner(System.in);

		//Variaveis
		double nota=0, total=0, validos=0, media;
		
		//Laço
		while(nota != -1) {
			
			//Digitar a nota
			System.out.printf("Digite a nota do aluno: ");
			nota = sc.nextDouble();
			
			//Armazenar no total
			if((nota >= 0) && (nota <= 10)) {
				total += nota;
				validos++;
			} else {
				System.out.printf("Nota inválida");
			}
		}
		
		//Calcular media da turma
		media = total/validos;
		
		//Saida
		System.out.printf("A média da turma é de %.2f\n", media);

		//Encerrar scanner
		sc.close();
	}
}
