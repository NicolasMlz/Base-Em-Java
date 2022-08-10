package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.0, false);
		Aluno a2 = new Aluno("Gui", 4.0, true);
		Aluno a3 = new Aluno("Nic", 8.0, false);
		Aluno a4 = new Aluno("Helo", 9.0, true);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		Predicate<Aluno> aprovado = n -> n.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(reprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));
	}
}
