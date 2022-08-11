package streams.reduce;

import java.util.Arrays;
import java.util.List;
import streams.Aluno;

public class Reduce2 {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.0, false);
		Aluno a2 = new Aluno("Gui", 4.0, true);
		Aluno a3 = new Aluno("Nic", 8.0, false);
		Aluno a4 = new Aluno("Helo", 9.0, true);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		alunos.stream()
			.filter(n -> n.nota >= 7)
			.map(n -> n.nota)
			.reduce((a, b) -> a + b)
			.ifPresent(System.out::println);
		
	} 
}
