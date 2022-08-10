package generics;

public class ParesTEste {
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Nick");
		resultadoConcurso.adicionar(2, "Sofia");
		resultadoConcurso.adicionar(3, "Lorena");
		resultadoConcurso.adicionar(4, "Leticia");
		resultadoConcurso.adicionar(2, "Ana");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
	}
}
