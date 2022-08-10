package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.0, false);
		Aluno a2 = new Aluno("Gui", 4.0, true);
		Aluno a3 = new Aluno("Nic", 8.0, false);
		Aluno a4 = new Aluno("Helo", 9.0, true);
		Aluno a5 = new Aluno("Ana", 7.0, false);
		Aluno a6 = new Aluno("Gui", 4.0, true);
		Aluno a7 = new Aluno("Borgo", 8.0, false);
		Aluno a8 = new Aluno("Helly", 9.0, true);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		//So funciona se tiver hashCode e equals
		System.out.printf("Usando o distinct...\n");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.printf("\nUsando o skip e limit...\n");
		alunos.stream()
			.distinct()
			.skip(3)
			.limit(3)
			.forEach(System.out::println);
		
		System.out.printf("\nUsando o takeWhile...\n");
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(n -> n.nota >= 8)
			.forEach(System.out::println);
	}
}
