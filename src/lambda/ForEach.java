package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Nic", "Edu");
		
		System.out.printf("Forma tradicional...\n");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.printf("\nLambda foreach #1...\n");
		aprovados.forEach(x -> System.out.println(x));
		
		System.out.printf("\nMethod reference #1...\n");
		aprovados.forEach(System.out::println);
		
		System.out.printf("\nLambda foreach #2...\n");
		aprovados.forEach(x -> toString(x));
		
		System.out.printf("\nMethod reference #2...\n");
		aprovados.forEach(ForEach::toString);
	}
	
	static void toString(String nome) {
		System.out.println("Meu nome é " + nome);
	}
}
