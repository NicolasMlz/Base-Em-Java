package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.0, false);
		Aluno a2 = new Aluno("Gui", 4.0, true);
		Aluno a3 = new Aluno("Nic", 10.0, false);
		Aluno a4 = new Aluno("Helo", 9.0, true);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 2;
			if(aluno1.nota < aluno2.nota) return -2;
			return 0;
		};
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return -2;
			if(aluno1.nota < aluno2.nota) return 2;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		System.out.println(alunos.stream().max(piorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
	}
}
