package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DesafioMap {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		nums.stream()
			.map(Utilitarios::inteiroParaBinario)
			.map(Utilitarios::inverterString)
			.map(Utilitarios::binarioParaInteiro)
			.forEach(Utilitarios.print);
		
		HashMap<String, Integer> alunos = new HashMap<>();
		alunos.put("Nicolas", 9);
		alunos.put("Helo", 8);
		alunos.put("Edu", 10);
		alunos.entrySet().forEach(System.out::println);
		
	}
}
