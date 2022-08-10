package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

import streams.Aluno;
import streams.Media;

public class Reduce3 {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.0, false);
		Aluno a2 = new Aluno("Gui", 4.0, true);
		Aluno a3 = new Aluno("Nic", 8.0, false);
		Aluno a4 = new Aluno("Helo", 9.0, true);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		BiFunction<Media, Double, Media> calculo =
				(media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinar =
				(m1, m2) -> Media.combinar(m1, m2);
				
		Media media = alunos.stream()
			.filter(n -> n.nota >= 7)
			.map(n -> n.nota)
			.reduce(new Media(), calculo, combinar);
		
		System.out.println("A media da turma inteligente eh: " + media.getMedia());
		
	} 
}
