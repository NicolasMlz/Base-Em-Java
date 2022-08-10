package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8, false); 
		Aluno a2 = new Aluno("Gui", 6.7, false); 
		Aluno a3 = new Aluno("Bia", 5.6, false); 
		Aluno a4 = new Aluno("Nic", 10.0, false); 
		Aluno a5 = new Aluno("Hel", 2.3, false); 
		Aluno a6 = new Aluno("Edu", 4.5, false); 
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		alunos.stream()
			.filter(n -> n.nota >= 7.0)
			.map(n -> "Parabéns " + n.nome + "! Você é inteligente.\n")
			.forEach(System.out::printf);
	}
}
